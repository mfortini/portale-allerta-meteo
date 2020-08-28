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

package it.eng.allerta.messages.services.service.base;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalServiceRegistry;
import com.liferay.portal.kernel.service.persistence.ClassNamePersistence;
import com.liferay.portal.kernel.service.persistence.UserPersistence;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import it.eng.allerta.messages.services.model.Parametro;
import it.eng.allerta.messages.services.service.ParametroLocalService;
import it.eng.allerta.messages.services.service.persistence.AuthPersistence;
import it.eng.allerta.messages.services.service.persistence.CounterSmsPersistence;
import it.eng.allerta.messages.services.service.persistence.NodoPersistence;
import it.eng.allerta.messages.services.service.persistence.ParametroFinder;
import it.eng.allerta.messages.services.service.persistence.ParametroPersistence;
import it.eng.allerta.messages.services.service.persistence.SmsSchedulerContextPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the parametro local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link it.eng.allerta.messages.services.service.impl.ParametroLocalServiceImpl}.
 * </p>
 *
 * @author Giorgianni_F
 * @see it.eng.allerta.messages.services.service.impl.ParametroLocalServiceImpl
 * @generated
 */
@ProviderType
public abstract class ParametroLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements ParametroLocalService, IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>ParametroLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>it.eng.allerta.messages.services.service.ParametroLocalServiceUtil</code>.
	 */

	/**
	 * Adds the parametro to the database. Also notifies the appropriate model listeners.
	 *
	 * @param parametro the parametro
	 * @return the parametro that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Parametro addParametro(Parametro parametro) {
		parametro.setNew(true);

		return parametroPersistence.update(parametro);
	}

	/**
	 * Creates a new parametro with the primary key. Does not add the parametro to the database.
	 *
	 * @param Id the primary key for the new parametro
	 * @return the new parametro
	 */
	@Override
	@Transactional(enabled = false)
	public Parametro createParametro(long Id) {
		return parametroPersistence.create(Id);
	}

	/**
	 * Deletes the parametro with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id the primary key of the parametro
	 * @return the parametro that was removed
	 * @throws PortalException if a parametro with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Parametro deleteParametro(long Id) throws PortalException {
		return parametroPersistence.remove(Id);
	}

	/**
	 * Deletes the parametro from the database. Also notifies the appropriate model listeners.
	 *
	 * @param parametro the parametro
	 * @return the parametro that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Parametro deleteParametro(Parametro parametro) {
		return parametroPersistence.remove(parametro);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(
			Parametro.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return parametroPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>it.eng.allerta.messages.services.model.impl.ParametroModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return parametroPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>it.eng.allerta.messages.services.model.impl.ParametroModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return parametroPersistence.findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return parametroPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection) {

		return parametroPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public Parametro fetchParametro(long Id) {
		return parametroPersistence.fetchByPrimaryKey(Id);
	}

	/**
	 * Returns the parametro with the primary key.
	 *
	 * @param Id the primary key of the parametro
	 * @return the parametro
	 * @throws PortalException if a parametro with the primary key could not be found
	 */
	@Override
	public Parametro getParametro(long Id) throws PortalException {
		return parametroPersistence.findByPrimaryKey(Id);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(parametroLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(Parametro.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("Id");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			parametroLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(Parametro.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName("Id");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(parametroLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(Parametro.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("Id");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		return parametroLocalService.deleteParametro((Parametro)persistedModel);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return parametroPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the parametros.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>it.eng.allerta.messages.services.model.impl.ParametroModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of parametros
	 * @param end the upper bound of the range of parametros (not inclusive)
	 * @return the range of parametros
	 */
	@Override
	public List<Parametro> getParametros(int start, int end) {
		return parametroPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of parametros.
	 *
	 * @return the number of parametros
	 */
	@Override
	public int getParametrosCount() {
		return parametroPersistence.countAll();
	}

	/**
	 * Updates the parametro in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param parametro the parametro
	 * @return the parametro that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Parametro updateParametro(Parametro parametro) {
		return parametroPersistence.update(parametro);
	}

	/**
	 * Returns the auth local service.
	 *
	 * @return the auth local service
	 */
	public it.eng.allerta.messages.services.service.AuthLocalService
		getAuthLocalService() {

		return authLocalService;
	}

	/**
	 * Sets the auth local service.
	 *
	 * @param authLocalService the auth local service
	 */
	public void setAuthLocalService(
		it.eng.allerta.messages.services.service.AuthLocalService
			authLocalService) {

		this.authLocalService = authLocalService;
	}

	/**
	 * Returns the auth persistence.
	 *
	 * @return the auth persistence
	 */
	public AuthPersistence getAuthPersistence() {
		return authPersistence;
	}

	/**
	 * Sets the auth persistence.
	 *
	 * @param authPersistence the auth persistence
	 */
	public void setAuthPersistence(AuthPersistence authPersistence) {
		this.authPersistence = authPersistence;
	}

	/**
	 * Returns the counter sms local service.
	 *
	 * @return the counter sms local service
	 */
	public it.eng.allerta.messages.services.service.CounterSmsLocalService
		getCounterSmsLocalService() {

		return counterSmsLocalService;
	}

	/**
	 * Sets the counter sms local service.
	 *
	 * @param counterSmsLocalService the counter sms local service
	 */
	public void setCounterSmsLocalService(
		it.eng.allerta.messages.services.service.CounterSmsLocalService
			counterSmsLocalService) {

		this.counterSmsLocalService = counterSmsLocalService;
	}

	/**
	 * Returns the counter sms persistence.
	 *
	 * @return the counter sms persistence
	 */
	public CounterSmsPersistence getCounterSmsPersistence() {
		return counterSmsPersistence;
	}

	/**
	 * Sets the counter sms persistence.
	 *
	 * @param counterSmsPersistence the counter sms persistence
	 */
	public void setCounterSmsPersistence(
		CounterSmsPersistence counterSmsPersistence) {

		this.counterSmsPersistence = counterSmsPersistence;
	}

	/**
	 * Returns the nodo local service.
	 *
	 * @return the nodo local service
	 */
	public it.eng.allerta.messages.services.service.NodoLocalService
		getNodoLocalService() {

		return nodoLocalService;
	}

	/**
	 * Sets the nodo local service.
	 *
	 * @param nodoLocalService the nodo local service
	 */
	public void setNodoLocalService(
		it.eng.allerta.messages.services.service.NodoLocalService
			nodoLocalService) {

		this.nodoLocalService = nodoLocalService;
	}

	/**
	 * Returns the nodo persistence.
	 *
	 * @return the nodo persistence
	 */
	public NodoPersistence getNodoPersistence() {
		return nodoPersistence;
	}

	/**
	 * Sets the nodo persistence.
	 *
	 * @param nodoPersistence the nodo persistence
	 */
	public void setNodoPersistence(NodoPersistence nodoPersistence) {
		this.nodoPersistence = nodoPersistence;
	}

	/**
	 * Returns the parametro local service.
	 *
	 * @return the parametro local service
	 */
	public ParametroLocalService getParametroLocalService() {
		return parametroLocalService;
	}

	/**
	 * Sets the parametro local service.
	 *
	 * @param parametroLocalService the parametro local service
	 */
	public void setParametroLocalService(
		ParametroLocalService parametroLocalService) {

		this.parametroLocalService = parametroLocalService;
	}

	/**
	 * Returns the parametro persistence.
	 *
	 * @return the parametro persistence
	 */
	public ParametroPersistence getParametroPersistence() {
		return parametroPersistence;
	}

	/**
	 * Sets the parametro persistence.
	 *
	 * @param parametroPersistence the parametro persistence
	 */
	public void setParametroPersistence(
		ParametroPersistence parametroPersistence) {

		this.parametroPersistence = parametroPersistence;
	}

	/**
	 * Returns the parametro finder.
	 *
	 * @return the parametro finder
	 */
	public ParametroFinder getParametroFinder() {
		return parametroFinder;
	}

	/**
	 * Sets the parametro finder.
	 *
	 * @param parametroFinder the parametro finder
	 */
	public void setParametroFinder(ParametroFinder parametroFinder) {
		this.parametroFinder = parametroFinder;
	}

	/**
	 * Returns the sms scheduler context local service.
	 *
	 * @return the sms scheduler context local service
	 */
	public
		it.eng.allerta.messages.services.service.SmsSchedulerContextLocalService
			getSmsSchedulerContextLocalService() {

		return smsSchedulerContextLocalService;
	}

	/**
	 * Sets the sms scheduler context local service.
	 *
	 * @param smsSchedulerContextLocalService the sms scheduler context local service
	 */
	public void setSmsSchedulerContextLocalService(
		it.eng.allerta.messages.services.service.SmsSchedulerContextLocalService
			smsSchedulerContextLocalService) {

		this.smsSchedulerContextLocalService = smsSchedulerContextLocalService;
	}

	/**
	 * Returns the sms scheduler context persistence.
	 *
	 * @return the sms scheduler context persistence
	 */
	public SmsSchedulerContextPersistence getSmsSchedulerContextPersistence() {
		return smsSchedulerContextPersistence;
	}

	/**
	 * Sets the sms scheduler context persistence.
	 *
	 * @param smsSchedulerContextPersistence the sms scheduler context persistence
	 */
	public void setSmsSchedulerContextPersistence(
		SmsSchedulerContextPersistence smsSchedulerContextPersistence) {

		this.smsSchedulerContextPersistence = smsSchedulerContextPersistence;
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
		persistedModelLocalServiceRegistry.register(
			"it.eng.allerta.messages.services.model.Parametro",
			parametroLocalService);
	}

	public void destroy() {
		persistedModelLocalServiceRegistry.unregister(
			"it.eng.allerta.messages.services.model.Parametro");
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return ParametroLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return Parametro.class;
	}

	protected String getModelClassName() {
		return Parametro.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = parametroPersistence.getDataSource();

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

	@BeanReference(
		type = it.eng.allerta.messages.services.service.AuthLocalService.class
	)
	protected it.eng.allerta.messages.services.service.AuthLocalService
		authLocalService;

	@BeanReference(type = AuthPersistence.class)
	protected AuthPersistence authPersistence;

	@BeanReference(
		type = it.eng.allerta.messages.services.service.CounterSmsLocalService.class
	)
	protected it.eng.allerta.messages.services.service.CounterSmsLocalService
		counterSmsLocalService;

	@BeanReference(type = CounterSmsPersistence.class)
	protected CounterSmsPersistence counterSmsPersistence;

	@BeanReference(
		type = it.eng.allerta.messages.services.service.NodoLocalService.class
	)
	protected it.eng.allerta.messages.services.service.NodoLocalService
		nodoLocalService;

	@BeanReference(type = NodoPersistence.class)
	protected NodoPersistence nodoPersistence;

	@BeanReference(type = ParametroLocalService.class)
	protected ParametroLocalService parametroLocalService;

	@BeanReference(type = ParametroPersistence.class)
	protected ParametroPersistence parametroPersistence;

	@BeanReference(type = ParametroFinder.class)
	protected ParametroFinder parametroFinder;

	@BeanReference(
		type = it.eng.allerta.messages.services.service.SmsSchedulerContextLocalService.class
	)
	protected
		it.eng.allerta.messages.services.service.SmsSchedulerContextLocalService
			smsSchedulerContextLocalService;

	@BeanReference(type = SmsSchedulerContextPersistence.class)
	protected SmsSchedulerContextPersistence smsSchedulerContextPersistence;

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

	@ServiceReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;

	@ServiceReference(type = PersistedModelLocalServiceRegistry.class)
	protected PersistedModelLocalServiceRegistry
		persistedModelLocalServiceRegistry;

}