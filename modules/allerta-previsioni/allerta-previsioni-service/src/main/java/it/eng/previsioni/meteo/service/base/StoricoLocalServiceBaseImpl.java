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

package it.eng.previsioni.meteo.service.base;

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

import it.eng.previsioni.meteo.model.Storico;
import it.eng.previsioni.meteo.service.StoricoLocalService;
import it.eng.previsioni.meteo.service.persistence.BollettinoPersistence;
import it.eng.previsioni.meteo.service.persistence.ImgPersistence;
import it.eng.previsioni.meteo.service.persistence.StoricoPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the storico local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link it.eng.previsioni.meteo.service.impl.StoricoLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see it.eng.previsioni.meteo.service.impl.StoricoLocalServiceImpl
 * @generated
 */
@ProviderType
public abstract class StoricoLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements StoricoLocalService, IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>StoricoLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>it.eng.previsioni.meteo.service.StoricoLocalServiceUtil</code>.
	 */

	/**
	 * Adds the storico to the database. Also notifies the appropriate model listeners.
	 *
	 * @param storico the storico
	 * @return the storico that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Storico addStorico(Storico storico) {
		storico.setNew(true);

		return storicoPersistence.update(storico);
	}

	/**
	 * Creates a new storico with the primary key. Does not add the storico to the database.
	 *
	 * @param id the primary key for the new storico
	 * @return the new storico
	 */
	@Override
	@Transactional(enabled = false)
	public Storico createStorico(long id) {
		return storicoPersistence.create(id);
	}

	/**
	 * Deletes the storico with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the storico
	 * @return the storico that was removed
	 * @throws PortalException if a storico with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Storico deleteStorico(long id) throws PortalException {
		return storicoPersistence.remove(id);
	}

	/**
	 * Deletes the storico from the database. Also notifies the appropriate model listeners.
	 *
	 * @param storico the storico
	 * @return the storico that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Storico deleteStorico(Storico storico) {
		return storicoPersistence.remove(storico);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(
			Storico.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return storicoPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>it.eng.previsioni.meteo.model.impl.StoricoModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

		return storicoPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>it.eng.previsioni.meteo.model.impl.StoricoModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

		return storicoPersistence.findWithDynamicQuery(
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
		return storicoPersistence.countWithDynamicQuery(dynamicQuery);
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

		return storicoPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public Storico fetchStorico(long id) {
		return storicoPersistence.fetchByPrimaryKey(id);
	}

	/**
	 * Returns the storico with the primary key.
	 *
	 * @param id the primary key of the storico
	 * @return the storico
	 * @throws PortalException if a storico with the primary key could not be found
	 */
	@Override
	public Storico getStorico(long id) throws PortalException {
		return storicoPersistence.findByPrimaryKey(id);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(storicoLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(Storico.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("id");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			storicoLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(Storico.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName("id");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(storicoLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(Storico.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("id");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		return storicoLocalService.deleteStorico((Storico)persistedModel);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return storicoPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the storicos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>it.eng.previsioni.meteo.model.impl.StoricoModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of storicos
	 * @param end the upper bound of the range of storicos (not inclusive)
	 * @return the range of storicos
	 */
	@Override
	public List<Storico> getStoricos(int start, int end) {
		return storicoPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of storicos.
	 *
	 * @return the number of storicos
	 */
	@Override
	public int getStoricosCount() {
		return storicoPersistence.countAll();
	}

	/**
	 * Updates the storico in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param storico the storico
	 * @return the storico that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Storico updateStorico(Storico storico) {
		return storicoPersistence.update(storico);
	}

	/**
	 * Returns the bollettino local service.
	 *
	 * @return the bollettino local service
	 */
	public it.eng.previsioni.meteo.service.BollettinoLocalService
		getBollettinoLocalService() {

		return bollettinoLocalService;
	}

	/**
	 * Sets the bollettino local service.
	 *
	 * @param bollettinoLocalService the bollettino local service
	 */
	public void setBollettinoLocalService(
		it.eng.previsioni.meteo.service.BollettinoLocalService
			bollettinoLocalService) {

		this.bollettinoLocalService = bollettinoLocalService;
	}

	/**
	 * Returns the bollettino persistence.
	 *
	 * @return the bollettino persistence
	 */
	public BollettinoPersistence getBollettinoPersistence() {
		return bollettinoPersistence;
	}

	/**
	 * Sets the bollettino persistence.
	 *
	 * @param bollettinoPersistence the bollettino persistence
	 */
	public void setBollettinoPersistence(
		BollettinoPersistence bollettinoPersistence) {

		this.bollettinoPersistence = bollettinoPersistence;
	}

	/**
	 * Returns the img local service.
	 *
	 * @return the img local service
	 */
	public it.eng.previsioni.meteo.service.ImgLocalService
		getImgLocalService() {

		return imgLocalService;
	}

	/**
	 * Sets the img local service.
	 *
	 * @param imgLocalService the img local service
	 */
	public void setImgLocalService(
		it.eng.previsioni.meteo.service.ImgLocalService imgLocalService) {

		this.imgLocalService = imgLocalService;
	}

	/**
	 * Returns the img persistence.
	 *
	 * @return the img persistence
	 */
	public ImgPersistence getImgPersistence() {
		return imgPersistence;
	}

	/**
	 * Sets the img persistence.
	 *
	 * @param imgPersistence the img persistence
	 */
	public void setImgPersistence(ImgPersistence imgPersistence) {
		this.imgPersistence = imgPersistence;
	}

	/**
	 * Returns the storico local service.
	 *
	 * @return the storico local service
	 */
	public StoricoLocalService getStoricoLocalService() {
		return storicoLocalService;
	}

	/**
	 * Sets the storico local service.
	 *
	 * @param storicoLocalService the storico local service
	 */
	public void setStoricoLocalService(
		StoricoLocalService storicoLocalService) {

		this.storicoLocalService = storicoLocalService;
	}

	/**
	 * Returns the storico persistence.
	 *
	 * @return the storico persistence
	 */
	public StoricoPersistence getStoricoPersistence() {
		return storicoPersistence;
	}

	/**
	 * Sets the storico persistence.
	 *
	 * @param storicoPersistence the storico persistence
	 */
	public void setStoricoPersistence(StoricoPersistence storicoPersistence) {
		this.storicoPersistence = storicoPersistence;
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
			"it.eng.previsioni.meteo.model.Storico", storicoLocalService);
	}

	public void destroy() {
		persistedModelLocalServiceRegistry.unregister(
			"it.eng.previsioni.meteo.model.Storico");
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return StoricoLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return Storico.class;
	}

	protected String getModelClassName() {
		return Storico.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = storicoPersistence.getDataSource();

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
		type = it.eng.previsioni.meteo.service.BollettinoLocalService.class
	)
	protected it.eng.previsioni.meteo.service.BollettinoLocalService
		bollettinoLocalService;

	@BeanReference(type = BollettinoPersistence.class)
	protected BollettinoPersistence bollettinoPersistence;

	@BeanReference(type = it.eng.previsioni.meteo.service.ImgLocalService.class)
	protected it.eng.previsioni.meteo.service.ImgLocalService imgLocalService;

	@BeanReference(type = ImgPersistence.class)
	protected ImgPersistence imgPersistence;

	@BeanReference(type = StoricoLocalService.class)
	protected StoricoLocalService storicoLocalService;

	@BeanReference(type = StoricoPersistence.class)
	protected StoricoPersistence storicoPersistence;

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