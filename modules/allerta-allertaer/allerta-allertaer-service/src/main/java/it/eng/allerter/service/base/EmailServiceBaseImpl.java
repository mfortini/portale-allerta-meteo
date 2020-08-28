/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package it.eng.allerter.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.service.BaseServiceImpl;
import com.liferay.portal.kernel.service.persistence.ClassNamePersistence;
import com.liferay.portal.kernel.service.persistence.UserPersistence;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import it.eng.allerter.model.Email;
import it.eng.allerter.service.EmailService;
import it.eng.allerter.service.persistence.AllertaFinder;
import it.eng.allerter.service.persistence.AllertaParametroPersistence;
import it.eng.allerter.service.persistence.AllertaPersistence;
import it.eng.allerter.service.persistence.AllertaStatoPersistence;
import it.eng.allerter.service.persistence.AreaPersistence;
import it.eng.allerter.service.persistence.EmailPersistence;
import it.eng.allerter.service.persistence.FeedPersistence;
import it.eng.allerter.service.persistence.GeografiaPersistence;
import it.eng.allerter.service.persistence.LogInternoPersistence;
import it.eng.allerter.service.persistence.SMSFinder;
import it.eng.allerter.service.persistence.SMSPersistence;
import it.eng.allerter.service.persistence.StatoAllertamentoPersistence;
import it.eng.allerter.service.persistence.TipoEventoPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the email remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link it.eng.allerter.service.impl.EmailServiceImpl}.
 * </p>
 *
 * @author GFAVINI
 * @see it.eng.allerter.service.impl.EmailServiceImpl
 * @generated
 */
public abstract class EmailServiceBaseImpl
	extends BaseServiceImpl implements EmailService, IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>EmailService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>it.eng.allerter.service.EmailServiceUtil</code>.
	 */

	/**
	 * Returns the allerta local service.
	 *
	 * @return the allerta local service
	 */
	public it.eng.allerter.service.AllertaLocalService
		getAllertaLocalService() {

		return allertaLocalService;
	}

	/**
	 * Sets the allerta local service.
	 *
	 * @param allertaLocalService the allerta local service
	 */
	public void setAllertaLocalService(
		it.eng.allerter.service.AllertaLocalService allertaLocalService) {

		this.allertaLocalService = allertaLocalService;
	}

	/**
	 * Returns the allerta remote service.
	 *
	 * @return the allerta remote service
	 */
	public it.eng.allerter.service.AllertaService getAllertaService() {
		return allertaService;
	}

	/**
	 * Sets the allerta remote service.
	 *
	 * @param allertaService the allerta remote service
	 */
	public void setAllertaService(
		it.eng.allerter.service.AllertaService allertaService) {

		this.allertaService = allertaService;
	}

	/**
	 * Returns the allerta persistence.
	 *
	 * @return the allerta persistence
	 */
	public AllertaPersistence getAllertaPersistence() {
		return allertaPersistence;
	}

	/**
	 * Sets the allerta persistence.
	 *
	 * @param allertaPersistence the allerta persistence
	 */
	public void setAllertaPersistence(AllertaPersistence allertaPersistence) {
		this.allertaPersistence = allertaPersistence;
	}

	/**
	 * Returns the allerta finder.
	 *
	 * @return the allerta finder
	 */
	public AllertaFinder getAllertaFinder() {
		return allertaFinder;
	}

	/**
	 * Sets the allerta finder.
	 *
	 * @param allertaFinder the allerta finder
	 */
	public void setAllertaFinder(AllertaFinder allertaFinder) {
		this.allertaFinder = allertaFinder;
	}

	/**
	 * Returns the allerta parametro local service.
	 *
	 * @return the allerta parametro local service
	 */
	public it.eng.allerter.service.AllertaParametroLocalService
		getAllertaParametroLocalService() {

		return allertaParametroLocalService;
	}

	/**
	 * Sets the allerta parametro local service.
	 *
	 * @param allertaParametroLocalService the allerta parametro local service
	 */
	public void setAllertaParametroLocalService(
		it.eng.allerter.service.AllertaParametroLocalService
			allertaParametroLocalService) {

		this.allertaParametroLocalService = allertaParametroLocalService;
	}

	/**
	 * Returns the allerta parametro remote service.
	 *
	 * @return the allerta parametro remote service
	 */
	public it.eng.allerter.service.AllertaParametroService
		getAllertaParametroService() {

		return allertaParametroService;
	}

	/**
	 * Sets the allerta parametro remote service.
	 *
	 * @param allertaParametroService the allerta parametro remote service
	 */
	public void setAllertaParametroService(
		it.eng.allerter.service.AllertaParametroService
			allertaParametroService) {

		this.allertaParametroService = allertaParametroService;
	}

	/**
	 * Returns the allerta parametro persistence.
	 *
	 * @return the allerta parametro persistence
	 */
	public AllertaParametroPersistence getAllertaParametroPersistence() {
		return allertaParametroPersistence;
	}

	/**
	 * Sets the allerta parametro persistence.
	 *
	 * @param allertaParametroPersistence the allerta parametro persistence
	 */
	public void setAllertaParametroPersistence(
		AllertaParametroPersistence allertaParametroPersistence) {

		this.allertaParametroPersistence = allertaParametroPersistence;
	}

	/**
	 * Returns the allerta stato local service.
	 *
	 * @return the allerta stato local service
	 */
	public it.eng.allerter.service.AllertaStatoLocalService
		getAllertaStatoLocalService() {

		return allertaStatoLocalService;
	}

	/**
	 * Sets the allerta stato local service.
	 *
	 * @param allertaStatoLocalService the allerta stato local service
	 */
	public void setAllertaStatoLocalService(
		it.eng.allerter.service.AllertaStatoLocalService
			allertaStatoLocalService) {

		this.allertaStatoLocalService = allertaStatoLocalService;
	}

	/**
	 * Returns the allerta stato remote service.
	 *
	 * @return the allerta stato remote service
	 */
	public it.eng.allerter.service.AllertaStatoService
		getAllertaStatoService() {

		return allertaStatoService;
	}

	/**
	 * Sets the allerta stato remote service.
	 *
	 * @param allertaStatoService the allerta stato remote service
	 */
	public void setAllertaStatoService(
		it.eng.allerter.service.AllertaStatoService allertaStatoService) {

		this.allertaStatoService = allertaStatoService;
	}

	/**
	 * Returns the allerta stato persistence.
	 *
	 * @return the allerta stato persistence
	 */
	public AllertaStatoPersistence getAllertaStatoPersistence() {
		return allertaStatoPersistence;
	}

	/**
	 * Sets the allerta stato persistence.
	 *
	 * @param allertaStatoPersistence the allerta stato persistence
	 */
	public void setAllertaStatoPersistence(
		AllertaStatoPersistence allertaStatoPersistence) {

		this.allertaStatoPersistence = allertaStatoPersistence;
	}

	/**
	 * Returns the area local service.
	 *
	 * @return the area local service
	 */
	public it.eng.allerter.service.AreaLocalService getAreaLocalService() {
		return areaLocalService;
	}

	/**
	 * Sets the area local service.
	 *
	 * @param areaLocalService the area local service
	 */
	public void setAreaLocalService(
		it.eng.allerter.service.AreaLocalService areaLocalService) {

		this.areaLocalService = areaLocalService;
	}

	/**
	 * Returns the area remote service.
	 *
	 * @return the area remote service
	 */
	public it.eng.allerter.service.AreaService getAreaService() {
		return areaService;
	}

	/**
	 * Sets the area remote service.
	 *
	 * @param areaService the area remote service
	 */
	public void setAreaService(
		it.eng.allerter.service.AreaService areaService) {

		this.areaService = areaService;
	}

	/**
	 * Returns the area persistence.
	 *
	 * @return the area persistence
	 */
	public AreaPersistence getAreaPersistence() {
		return areaPersistence;
	}

	/**
	 * Sets the area persistence.
	 *
	 * @param areaPersistence the area persistence
	 */
	public void setAreaPersistence(AreaPersistence areaPersistence) {
		this.areaPersistence = areaPersistence;
	}

	/**
	 * Returns the email local service.
	 *
	 * @return the email local service
	 */
	public it.eng.allerter.service.EmailLocalService getEmailLocalService() {
		return emailLocalService;
	}

	/**
	 * Sets the email local service.
	 *
	 * @param emailLocalService the email local service
	 */
	public void setEmailLocalService(
		it.eng.allerter.service.EmailLocalService emailLocalService) {

		this.emailLocalService = emailLocalService;
	}

	/**
	 * Returns the email remote service.
	 *
	 * @return the email remote service
	 */
	public EmailService getEmailService() {
		return emailService;
	}

	/**
	 * Sets the email remote service.
	 *
	 * @param emailService the email remote service
	 */
	public void setEmailService(EmailService emailService) {
		this.emailService = emailService;
	}

	/**
	 * Returns the email persistence.
	 *
	 * @return the email persistence
	 */
	public EmailPersistence getEmailPersistence() {
		return emailPersistence;
	}

	/**
	 * Sets the email persistence.
	 *
	 * @param emailPersistence the email persistence
	 */
	public void setEmailPersistence(EmailPersistence emailPersistence) {
		this.emailPersistence = emailPersistence;
	}

	/**
	 * Returns the feed local service.
	 *
	 * @return the feed local service
	 */
	public it.eng.allerter.service.FeedLocalService getFeedLocalService() {
		return feedLocalService;
	}

	/**
	 * Sets the feed local service.
	 *
	 * @param feedLocalService the feed local service
	 */
	public void setFeedLocalService(
		it.eng.allerter.service.FeedLocalService feedLocalService) {

		this.feedLocalService = feedLocalService;
	}

	/**
	 * Returns the feed remote service.
	 *
	 * @return the feed remote service
	 */
	public it.eng.allerter.service.FeedService getFeedService() {
		return feedService;
	}

	/**
	 * Sets the feed remote service.
	 *
	 * @param feedService the feed remote service
	 */
	public void setFeedService(
		it.eng.allerter.service.FeedService feedService) {

		this.feedService = feedService;
	}

	/**
	 * Returns the feed persistence.
	 *
	 * @return the feed persistence
	 */
	public FeedPersistence getFeedPersistence() {
		return feedPersistence;
	}

	/**
	 * Sets the feed persistence.
	 *
	 * @param feedPersistence the feed persistence
	 */
	public void setFeedPersistence(FeedPersistence feedPersistence) {
		this.feedPersistence = feedPersistence;
	}

	/**
	 * Returns the geografia local service.
	 *
	 * @return the geografia local service
	 */
	public it.eng.allerter.service.GeografiaLocalService
		getGeografiaLocalService() {

		return geografiaLocalService;
	}

	/**
	 * Sets the geografia local service.
	 *
	 * @param geografiaLocalService the geografia local service
	 */
	public void setGeografiaLocalService(
		it.eng.allerter.service.GeografiaLocalService geografiaLocalService) {

		this.geografiaLocalService = geografiaLocalService;
	}

	/**
	 * Returns the geografia remote service.
	 *
	 * @return the geografia remote service
	 */
	public it.eng.allerter.service.GeografiaService getGeografiaService() {
		return geografiaService;
	}

	/**
	 * Sets the geografia remote service.
	 *
	 * @param geografiaService the geografia remote service
	 */
	public void setGeografiaService(
		it.eng.allerter.service.GeografiaService geografiaService) {

		this.geografiaService = geografiaService;
	}

	/**
	 * Returns the geografia persistence.
	 *
	 * @return the geografia persistence
	 */
	public GeografiaPersistence getGeografiaPersistence() {
		return geografiaPersistence;
	}

	/**
	 * Sets the geografia persistence.
	 *
	 * @param geografiaPersistence the geografia persistence
	 */
	public void setGeografiaPersistence(
		GeografiaPersistence geografiaPersistence) {

		this.geografiaPersistence = geografiaPersistence;
	}

	/**
	 * Returns the log interno local service.
	 *
	 * @return the log interno local service
	 */
	public it.eng.allerter.service.LogInternoLocalService
		getLogInternoLocalService() {

		return logInternoLocalService;
	}

	/**
	 * Sets the log interno local service.
	 *
	 * @param logInternoLocalService the log interno local service
	 */
	public void setLogInternoLocalService(
		it.eng.allerter.service.LogInternoLocalService logInternoLocalService) {

		this.logInternoLocalService = logInternoLocalService;
	}

	/**
	 * Returns the log interno remote service.
	 *
	 * @return the log interno remote service
	 */
	public it.eng.allerter.service.LogInternoService getLogInternoService() {
		return logInternoService;
	}

	/**
	 * Sets the log interno remote service.
	 *
	 * @param logInternoService the log interno remote service
	 */
	public void setLogInternoService(
		it.eng.allerter.service.LogInternoService logInternoService) {

		this.logInternoService = logInternoService;
	}

	/**
	 * Returns the log interno persistence.
	 *
	 * @return the log interno persistence
	 */
	public LogInternoPersistence getLogInternoPersistence() {
		return logInternoPersistence;
	}

	/**
	 * Sets the log interno persistence.
	 *
	 * @param logInternoPersistence the log interno persistence
	 */
	public void setLogInternoPersistence(
		LogInternoPersistence logInternoPersistence) {

		this.logInternoPersistence = logInternoPersistence;
	}

	/**
	 * Returns the sms local service.
	 *
	 * @return the sms local service
	 */
	public it.eng.allerter.service.SMSLocalService getSMSLocalService() {
		return smsLocalService;
	}

	/**
	 * Sets the sms local service.
	 *
	 * @param smsLocalService the sms local service
	 */
	public void setSMSLocalService(
		it.eng.allerter.service.SMSLocalService smsLocalService) {

		this.smsLocalService = smsLocalService;
	}

	/**
	 * Returns the sms remote service.
	 *
	 * @return the sms remote service
	 */
	public it.eng.allerter.service.SMSService getSMSService() {
		return smsService;
	}

	/**
	 * Sets the sms remote service.
	 *
	 * @param smsService the sms remote service
	 */
	public void setSMSService(it.eng.allerter.service.SMSService smsService) {
		this.smsService = smsService;
	}

	/**
	 * Returns the sms persistence.
	 *
	 * @return the sms persistence
	 */
	public SMSPersistence getSMSPersistence() {
		return smsPersistence;
	}

	/**
	 * Sets the sms persistence.
	 *
	 * @param smsPersistence the sms persistence
	 */
	public void setSMSPersistence(SMSPersistence smsPersistence) {
		this.smsPersistence = smsPersistence;
	}

	/**
	 * Returns the sms finder.
	 *
	 * @return the sms finder
	 */
	public SMSFinder getSMSFinder() {
		return smsFinder;
	}

	/**
	 * Sets the sms finder.
	 *
	 * @param smsFinder the sms finder
	 */
	public void setSMSFinder(SMSFinder smsFinder) {
		this.smsFinder = smsFinder;
	}

	/**
	 * Returns the stato allertamento local service.
	 *
	 * @return the stato allertamento local service
	 */
	public it.eng.allerter.service.StatoAllertamentoLocalService
		getStatoAllertamentoLocalService() {

		return statoAllertamentoLocalService;
	}

	/**
	 * Sets the stato allertamento local service.
	 *
	 * @param statoAllertamentoLocalService the stato allertamento local service
	 */
	public void setStatoAllertamentoLocalService(
		it.eng.allerter.service.StatoAllertamentoLocalService
			statoAllertamentoLocalService) {

		this.statoAllertamentoLocalService = statoAllertamentoLocalService;
	}

	/**
	 * Returns the stato allertamento remote service.
	 *
	 * @return the stato allertamento remote service
	 */
	public it.eng.allerter.service.StatoAllertamentoService
		getStatoAllertamentoService() {

		return statoAllertamentoService;
	}

	/**
	 * Sets the stato allertamento remote service.
	 *
	 * @param statoAllertamentoService the stato allertamento remote service
	 */
	public void setStatoAllertamentoService(
		it.eng.allerter.service.StatoAllertamentoService
			statoAllertamentoService) {

		this.statoAllertamentoService = statoAllertamentoService;
	}

	/**
	 * Returns the stato allertamento persistence.
	 *
	 * @return the stato allertamento persistence
	 */
	public StatoAllertamentoPersistence getStatoAllertamentoPersistence() {
		return statoAllertamentoPersistence;
	}

	/**
	 * Sets the stato allertamento persistence.
	 *
	 * @param statoAllertamentoPersistence the stato allertamento persistence
	 */
	public void setStatoAllertamentoPersistence(
		StatoAllertamentoPersistence statoAllertamentoPersistence) {

		this.statoAllertamentoPersistence = statoAllertamentoPersistence;
	}

	/**
	 * Returns the tipo evento local service.
	 *
	 * @return the tipo evento local service
	 */
	public it.eng.allerter.service.TipoEventoLocalService
		getTipoEventoLocalService() {

		return tipoEventoLocalService;
	}

	/**
	 * Sets the tipo evento local service.
	 *
	 * @param tipoEventoLocalService the tipo evento local service
	 */
	public void setTipoEventoLocalService(
		it.eng.allerter.service.TipoEventoLocalService tipoEventoLocalService) {

		this.tipoEventoLocalService = tipoEventoLocalService;
	}

	/**
	 * Returns the tipo evento remote service.
	 *
	 * @return the tipo evento remote service
	 */
	public it.eng.allerter.service.TipoEventoService getTipoEventoService() {
		return tipoEventoService;
	}

	/**
	 * Sets the tipo evento remote service.
	 *
	 * @param tipoEventoService the tipo evento remote service
	 */
	public void setTipoEventoService(
		it.eng.allerter.service.TipoEventoService tipoEventoService) {

		this.tipoEventoService = tipoEventoService;
	}

	/**
	 * Returns the tipo evento persistence.
	 *
	 * @return the tipo evento persistence
	 */
	public TipoEventoPersistence getTipoEventoPersistence() {
		return tipoEventoPersistence;
	}

	/**
	 * Sets the tipo evento persistence.
	 *
	 * @param tipoEventoPersistence the tipo evento persistence
	 */
	public void setTipoEventoPersistence(
		TipoEventoPersistence tipoEventoPersistence) {

		this.tipoEventoPersistence = tipoEventoPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.kernel.service.CounterLocalService
		getCounterLocalService() {

		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.kernel.service.CounterLocalService
			counterLocalService) {

		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the class name local service.
	 *
	 * @return the class name local service
	 */
	public com.liferay.portal.kernel.service.ClassNameLocalService
		getClassNameLocalService() {

		return classNameLocalService;
	}

	/**
	 * Sets the class name local service.
	 *
	 * @param classNameLocalService the class name local service
	 */
	public void setClassNameLocalService(
		com.liferay.portal.kernel.service.ClassNameLocalService
			classNameLocalService) {

		this.classNameLocalService = classNameLocalService;
	}

	/**
	 * Returns the class name remote service.
	 *
	 * @return the class name remote service
	 */
	public com.liferay.portal.kernel.service.ClassNameService
		getClassNameService() {

		return classNameService;
	}

	/**
	 * Sets the class name remote service.
	 *
	 * @param classNameService the class name remote service
	 */
	public void setClassNameService(
		com.liferay.portal.kernel.service.ClassNameService classNameService) {

		this.classNameService = classNameService;
	}

	/**
	 * Returns the class name persistence.
	 *
	 * @return the class name persistence
	 */
	public ClassNamePersistence getClassNamePersistence() {
		return classNamePersistence;
	}

	/**
	 * Sets the class name persistence.
	 *
	 * @param classNamePersistence the class name persistence
	 */
	public void setClassNamePersistence(
		ClassNamePersistence classNamePersistence) {

		this.classNamePersistence = classNamePersistence;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.kernel.service.ResourceLocalService
		getResourceLocalService() {

		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.kernel.service.ResourceLocalService
			resourceLocalService) {

		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.kernel.service.UserLocalService
		getUserLocalService() {

		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.kernel.service.UserLocalService userLocalService) {

		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.kernel.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.kernel.service.UserService userService) {

		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
	}

	public void destroy() {
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return EmailService.class.getName();
	}

	protected Class<?> getModelClass() {
		return Email.class;
	}

	protected String getModelClassName() {
		return Email.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = emailPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(
				dataSource, sql);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = it.eng.allerter.service.AllertaLocalService.class)
	protected it.eng.allerter.service.AllertaLocalService allertaLocalService;

	@BeanReference(type = it.eng.allerter.service.AllertaService.class)
	protected it.eng.allerter.service.AllertaService allertaService;

	@BeanReference(type = AllertaPersistence.class)
	protected AllertaPersistence allertaPersistence;

	@BeanReference(type = AllertaFinder.class)
	protected AllertaFinder allertaFinder;

	@BeanReference(
		type = it.eng.allerter.service.AllertaParametroLocalService.class
	)
	protected it.eng.allerter.service.AllertaParametroLocalService
		allertaParametroLocalService;

	@BeanReference(type = it.eng.allerter.service.AllertaParametroService.class)
	protected it.eng.allerter.service.AllertaParametroService
		allertaParametroService;

	@BeanReference(type = AllertaParametroPersistence.class)
	protected AllertaParametroPersistence allertaParametroPersistence;

	@BeanReference(
		type = it.eng.allerter.service.AllertaStatoLocalService.class
	)
	protected it.eng.allerter.service.AllertaStatoLocalService
		allertaStatoLocalService;

	@BeanReference(type = it.eng.allerter.service.AllertaStatoService.class)
	protected it.eng.allerter.service.AllertaStatoService allertaStatoService;

	@BeanReference(type = AllertaStatoPersistence.class)
	protected AllertaStatoPersistence allertaStatoPersistence;

	@BeanReference(type = it.eng.allerter.service.AreaLocalService.class)
	protected it.eng.allerter.service.AreaLocalService areaLocalService;

	@BeanReference(type = it.eng.allerter.service.AreaService.class)
	protected it.eng.allerter.service.AreaService areaService;

	@BeanReference(type = AreaPersistence.class)
	protected AreaPersistence areaPersistence;

	@BeanReference(type = it.eng.allerter.service.EmailLocalService.class)
	protected it.eng.allerter.service.EmailLocalService emailLocalService;

	@BeanReference(type = EmailService.class)
	protected EmailService emailService;

	@BeanReference(type = EmailPersistence.class)
	protected EmailPersistence emailPersistence;

	@BeanReference(type = it.eng.allerter.service.FeedLocalService.class)
	protected it.eng.allerter.service.FeedLocalService feedLocalService;

	@BeanReference(type = it.eng.allerter.service.FeedService.class)
	protected it.eng.allerter.service.FeedService feedService;

	@BeanReference(type = FeedPersistence.class)
	protected FeedPersistence feedPersistence;

	@BeanReference(type = it.eng.allerter.service.GeografiaLocalService.class)
	protected it.eng.allerter.service.GeografiaLocalService
		geografiaLocalService;

	@BeanReference(type = it.eng.allerter.service.GeografiaService.class)
	protected it.eng.allerter.service.GeografiaService geografiaService;

	@BeanReference(type = GeografiaPersistence.class)
	protected GeografiaPersistence geografiaPersistence;

	@BeanReference(type = it.eng.allerter.service.LogInternoLocalService.class)
	protected it.eng.allerter.service.LogInternoLocalService
		logInternoLocalService;

	@BeanReference(type = it.eng.allerter.service.LogInternoService.class)
	protected it.eng.allerter.service.LogInternoService logInternoService;

	@BeanReference(type = LogInternoPersistence.class)
	protected LogInternoPersistence logInternoPersistence;

	@BeanReference(type = it.eng.allerter.service.SMSLocalService.class)
	protected it.eng.allerter.service.SMSLocalService smsLocalService;

	@BeanReference(type = it.eng.allerter.service.SMSService.class)
	protected it.eng.allerter.service.SMSService smsService;

	@BeanReference(type = SMSPersistence.class)
	protected SMSPersistence smsPersistence;

	@BeanReference(type = SMSFinder.class)
	protected SMSFinder smsFinder;

	@BeanReference(
		type = it.eng.allerter.service.StatoAllertamentoLocalService.class
	)
	protected it.eng.allerter.service.StatoAllertamentoLocalService
		statoAllertamentoLocalService;

	@BeanReference(
		type = it.eng.allerter.service.StatoAllertamentoService.class
	)
	protected it.eng.allerter.service.StatoAllertamentoService
		statoAllertamentoService;

	@BeanReference(type = StatoAllertamentoPersistence.class)
	protected StatoAllertamentoPersistence statoAllertamentoPersistence;

	@BeanReference(type = it.eng.allerter.service.TipoEventoLocalService.class)
	protected it.eng.allerter.service.TipoEventoLocalService
		tipoEventoLocalService;

	@BeanReference(type = it.eng.allerter.service.TipoEventoService.class)
	protected it.eng.allerter.service.TipoEventoService tipoEventoService;

	@BeanReference(type = TipoEventoPersistence.class)
	protected TipoEventoPersistence tipoEventoPersistence;

	@ServiceReference(
		type = com.liferay.counter.kernel.service.CounterLocalService.class
	)
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@ServiceReference(
		type = com.liferay.portal.kernel.service.ClassNameLocalService.class
	)
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@ServiceReference(
		type = com.liferay.portal.kernel.service.ClassNameService.class
	)
	protected com.liferay.portal.kernel.service.ClassNameService
		classNameService;

	@ServiceReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;

	@ServiceReference(
		type = com.liferay.portal.kernel.service.ResourceLocalService.class
	)
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@ServiceReference(
		type = com.liferay.portal.kernel.service.UserLocalService.class
	)
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

	@ServiceReference(
		type = com.liferay.portal.kernel.service.UserService.class
	)
	protected com.liferay.portal.kernel.service.UserService userService;

	@ServiceReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;

}