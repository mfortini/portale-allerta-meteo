package it.eng.allerter.activator;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.module.framework.ModuleServiceLifecycle;
import com.liferay.portal.kernel.util.PortalUtil;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleEvent;
import org.osgi.framework.BundleListener;
import org.osgi.framework.FrameworkUtil;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;

import it.eng.allerta.messages.services.HostUtility;
import it.eng.allerta.messages.services.SmsWatchdogManagerWebServices;
import it.eng.allerta.messages.services.action.StartupAction;
import it.eng.allerta.messages.services.scheduler.SmsSchedulerContextException;
import it.eng.allerta.messages.services.scheduler.SmsSchedulerContextUtility;
import it.eng.allerta.messages.services.service.SmsSchedulerContextLocalService;
import it.eng.allerter.service.SMSLocalService;

public class AllertaSMSBundleActivatorService implements BundleActivator/*, BundleListener */{
	
	private static Log logger = LogFactoryUtil.getLog(AllertaSMSBundleActivatorService.class);
	
	private String BUNDLEDEP_SYMBOLICNAME = "it.eng.allertaer.service";
	private String BUNDLEDEP_VERSION = "1.0.0";
	
	private String BUNDLE_SYMBOLICNAME = "it.eng.allerta.messages.services.service";
	private String BUNDLE_VERSION = "1.0.0";
	
	@Reference(cardinality = ReferenceCardinality.MANDATORY)
	private SmsSchedulerContextUtility smsSchedulerContextUtility;
	
	@Reference(cardinality = ReferenceCardinality.MANDATORY)
	private SmsSchedulerContextLocalService smsSchedulerContextLocalService;
	
	//private Bundle bundleDep;
	
	@Reference(cardinality = ReferenceCardinality.MANDATORY)
	private SMSLocalService smsLocalService;
	
	//@Reference(target = ModuleServiceLifecycle.PORTAL_INITIALIZED)
	//private ModuleServiceLifecycle moduleServiceLifecycle;
	
	/*
	@Override
	public void bundleChanged(BundleEvent bundleEvent) {
	    int eventType = bundleEvent.getType();
	    Bundle bundleDep = bundleEvent.getBundle();
	    
	    boolean bundleFind = bundleDep.getSymbolicName().equals(BUNDLEDEP_SYMBOLICNAME) &&
				 	 		 bundleDep.getVersion().toString().equals(BUNDLEDEP_VERSION);
				 	 		 
	    if (bundleFind && eventType == BundleEvent.STARTED) {
	    	doStart(bundleEvent.getBundle().getBundleContext());
	    }
	}
	*/
	
	/*
	@Override
	public void bundleChanged(BundleEvent bundleEvent) {
	    int eventType = bundleEvent.getType();
	    Bundle bundle = bundleEvent.getBundle();
	    
	    boolean bundleFind = bundle.getSymbolicName().equals(BUNDLE_SYMBOLICNAME) &&
				 	 		 bundle.getVersion().toString().equals(BUNDLEDEP_VERSION);
	    
	    if (bundleFind && eventType == BundleEvent.STOPPING) {
	    	doStopping(bundle.getBundleContext());
	    }
	}
	*/
	
	@Override
	public void start(BundleContext context) throws Exception {
		logger.info("start AllertaSMSBundleActivatorService begin");
		logger.info("lo stato del bundle " + context.getBundle().getSymbolicName() + " è " + context.getBundle().getState());
		logger.info("start AllertaSMSBundleActivatorService end");
		
		//context.addBundleListener(this);
	}
	
	/*
	@Override
	public void start(BundleContext context) throws Exception {
		logger.info("start AllertaSMSBundleActivatorService begin");
		logger.info("lo stato del bundle " + context.getBundle().getSymbolicName() + " è " + toState(context.getBundle().getState()));
		
		Bundle[] bundles = context.getBundles();
		boolean bundleFind = false;
		
		for (int i = 0; i < bundles.length && !bundleFind; i++) {
			bundleDep = bundles[i];
			
			bundleFind = bundleDep.getSymbolicName().equals(BUNDLEDEP_SYMBOLICNAME) &&
						 bundleDep.getVersion().toString().equals(BUNDLEDEP_VERSION);
		}
		
		if (!bundleFind) {
			throw new SystemException("Lo scheduler SMS non verrà avviato : non è stato possibile trovare la dipendenza dal bundle " + bundleDep + " ver " + BUNDLEDEP_VERSION);
		} else {		
			if (bundleDep.getState() == Bundle.ACTIVE) {
				doStart(context);
			} else {
				bundleDep.getBundleContext().addBundleListener(this);
			}
		}
		
		logger.info("start AllertaSMSBundleActivatorService end");
	}
	*/
	
	@Override
	public void stop(BundleContext context) throws Exception {
		logger.info("stop AllertaSMSBundleActivatorService begin");
		logger.info("lo stato del bundle " + context.getBundle().getSymbolicName() + " è " + context.getBundle().getState());
		logger.info("stop AllertaSMSBundleActivatorService end");
	}

	/*
	@Override
	public void stop(BundleContext context) throws Exception {
		logger.info("stop AllertaSMSBundleActivatorService begin");
		logger.info("lo stato del bundle " + context.getBundle().getSymbolicName() + " è " + toState(context.getBundle().getState()));
		
		doStop(context);
		
		logger.info("stop AllertaSMSBundleActivatorService stop");
	}
	*/
	
	// metodi protected
	
	/*
	protected void doStart(BundleContext context) {
		// Recupero info realtive al Host corrente
		String infoHost = null;
		String hostIp = "unknown";
		String port = "";
		String nodeId = "unknown";
		
		try {
			nodeId = HostUtility.getCurrentClusterId();
			hostIp = HostUtility.getCurrentHostIp();
			port = HostUtility.getCurrentHostPort();
			
			infoHost = System.lineSeparator() +
					   "Startup Service" + System.lineSeparator() +
					   "Computer name = " + PortalUtil.getComputerName() + System.lineSeparator() +
					   "Node id = " + nodeId + System.lineSeparator() +
					   "Node IP:Port = " + hostIp + ":" + port + System.lineSeparator();
			
			logger.info(infoHost);
		} catch (SystemException e) {
			String errMsg = "Startup Service - Activate terminato con fallimento : non è stato possibile recuperare info sul host";
			logger.error(errMsg, e);
			
			throw new SystemException(errMsg, e);
		}

		// è la prima volta che viene avviato il server
		if (StartupAction.isServerStartedFirstTime()) {
			StartupAction.setServerNotStartedFirstTime(); // da ora in poi non sarà più il primo riavvio	
			
			try {
				// se lo scheduler risulta morto all'avvio del server allora prova a diventare lo scheduler
				if (smsSchedulerContextUtility.ifDeadTryToBecomeScheduler(hostIp, port)) {
					// dato che ragionevolmente è morto, eseguo il reset dello stato dello Scheduler SMS portandolo a DEAD;
					// tenta di diventare lo scheduler di invio/verifica SMS : usa la tecnica del lock esclusivo (mettendo prima lo stato a DEAD).
					// Se ci riesce, lo scheduler andrà in esecuzione con lo stato pari a STARTED					
					logger.info("il seguente host " + hostIp + ":" + port + " ha avviato l'istanza dello scheduler di invio/verifica SMS");				
				// se non è in stato DEAD il nodo diventa un watchdog
				} else {
					if (!smsSchedulerContextLocalService.isSchedulerInThisHost()) {
						startWatchdogIfNecessary(hostIp, port);
						logger.info("Startup Service - lo scheduler è attivo ma non mi trovo nel host dello scheduler; avvio il watchdog");
					} else {
						logger.warn("Startup Service - lo scheduler è già attivo, se avete cambiato codice è necessario stoppare lo scheduler e riavviarlo");
					}
				}
				
				logger.info("Startup Service - Activate terminato con successo");
			} catch (Throwable ex) {
				String errMsg = "Startup Service - Activate terminato con fallimento : fase di avvio scheduler andata in errore, verificare che lo scheduler sia attivo : " + ex.getMessage();
				logger.error(errMsg, ex.getCause());
				
				smsSchedulerContextLocalService.sendMailWithPlainText(errMsg);
			}
		// se non è il primo riavvio del server allora è il deploy del solo bundle/portlet
		} else {		
			try {
				smsSchedulerContextUtility.doPortalInitInExclusiveMode(hostIp, port);
				
				logger.info("Startup Service - Activate terminato con successo");
			} catch (SmsSchedulerContextException ex) {
				logger.error("Startup Service - Activate terminato con fallimento : fase di riavvio scheduler andata in errore, verificare che lo scheduler sia attivo", ex);
			}
		}
	}
	*/
	
	protected void doStopping(BundleContext context) {		
		try {			
			smsSchedulerContextUtility.doPortalDestroyInExclusiveMode();
			logger.info("Startup Service - Deactive terminato con successo");					
		} catch (Throwable e) {			
			logger.error("Startup Service - Deactive terminato con fallimento",  e);
		}	
	}
	
	// metodi private
	
	/*
	private void startWatchdogIfNecessary(String hostIp, String port) throws SmsSchedulerContextException {
		logger.info("il seguente host tenterà di avviare l'istanza del watchdog di controllo dello scheduler di invio/verifica SMS");
		
		boolean result = SmsWatchdogManagerWebServices.getInstance().tryStartWatchdog();					
						
		if (!result) {
			String errMsg = "Attenzione!!! Watchdog non avviato per il seguente host : " + hostIp + ":" + port + " perchè già attivo";
			logger.error(errMsg);
			
			smsSchedulerContextLocalService.sendMailWithPlainText(errMsg);
		} else {
			logger.info("Watchdog avviato per il seguente host : " + hostIp);
		}		
	}
	*/
	
	private static String toState(int state) {
        switch (state) {
	        case Bundle.UNINSTALLED:
	            return "UNINSTALLED";
	        case Bundle.INSTALLED:
	            return "INSTALLED";
	        case Bundle.RESOLVED:
	            return "RESOLVED";
	        case Bundle.STARTING:
	            return "STARTING";
	        case Bundle.STOPPING:
	            return "STOPPING";
	        case Bundle.ACTIVE:
	            return "ACTIVE";
        }
        return null;
    }
}
