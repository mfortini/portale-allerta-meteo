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

package it.eng.radarMeteo.service.base;

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

import it.eng.radarMeteo.model.Json;
import it.eng.radarMeteo.service.JsonLocalService;
import it.eng.radarMeteo.service.persistence.Comuni_bacini_wsPersistence;
import it.eng.radarMeteo.service.persistence.Comuni_wsFinder;
import it.eng.radarMeteo.service.persistence.Comuni_wsPersistence;
import it.eng.radarMeteo.service.persistence.ImgFinder;
import it.eng.radarMeteo.service.persistence.ImgPersistence;
import it.eng.radarMeteo.service.persistence.JsonFinder;
import it.eng.radarMeteo.service.persistence.JsonPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the json local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link it.eng.radarMeteo.service.impl.JsonLocalServiceImpl}.
 * </p>
 *
 * @author Francesco
 * @see it.eng.radarMeteo.service.impl.JsonLocalServiceImpl
 * @generated
 */
@ProviderType
public abstract class JsonLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements JsonLocalService, IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>JsonLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>it.eng.radarMeteo.service.JsonLocalServiceUtil</code>.
	 */

	/**
	 * Adds the json to the database. Also notifies the appropriate model listeners.
	 *
	 * @param json the json
	 * @return the json that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Json addJson(Json json) {
		json.setNew(true);

		return jsonPersistence.update(json);
	}

	/**
	 * Creates a new json with the primary key. Does not add the json to the database.
	 *
	 * @param id the primary key for the new json
	 * @return the new json
	 */
	@Override
	@Transactional(enabled = false)
	public Json createJson(long id) {
		return jsonPersistence.create(id);
	}

	/**
	 * Deletes the json with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the json
	 * @return the json that was removed
	 * @throws PortalException if a json with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Json deleteJson(long id) throws PortalException {
		return jsonPersistence.remove(id);
	}

	/**
	 * Deletes the json from the database. Also notifies the appropriate model listeners.
	 *
	 * @param json the json
	 * @return the json that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Json deleteJson(Json json) {
		return jsonPersistence.remove(json);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(
			Json.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return jsonPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>it.eng.radarMeteo.model.impl.JsonModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

		return jsonPersistence.findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>it.eng.radarMeteo.model.impl.JsonModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

		return jsonPersistence.findWithDynamicQuery(
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
		return jsonPersistence.countWithDynamicQuery(dynamicQuery);
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

		return jsonPersistence.countWithDynamicQuery(dynamicQuery, projection);
	}

	@Override
	public Json fetchJson(long id) {
		return jsonPersistence.fetchByPrimaryKey(id);
	}

	/**
	 * Returns the json with the primary key.
	 *
	 * @param id the primary key of the json
	 * @return the json
	 * @throws PortalException if a json with the primary key could not be found
	 */
	@Override
	public Json getJson(long id) throws PortalException {
		return jsonPersistence.findByPrimaryKey(id);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(jsonLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(Json.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("id");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(jsonLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(Json.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName("id");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(jsonLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(Json.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("id");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		return jsonLocalService.deleteJson((Json)persistedModel);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return jsonPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the jsons.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>it.eng.radarMeteo.model.impl.JsonModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of jsons
	 * @param end the upper bound of the range of jsons (not inclusive)
	 * @return the range of jsons
	 */
	@Override
	public List<Json> getJsons(int start, int end) {
		return jsonPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of jsons.
	 *
	 * @return the number of jsons
	 */
	@Override
	public int getJsonsCount() {
		return jsonPersistence.countAll();
	}

	/**
	 * Updates the json in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param json the json
	 * @return the json that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Json updateJson(Json json) {
		return jsonPersistence.update(json);
	}

	/**
	 * Returns the comuni_bacini_ws local service.
	 *
	 * @return the comuni_bacini_ws local service
	 */
	public it.eng.radarMeteo.service.Comuni_bacini_wsLocalService
		getComuni_bacini_wsLocalService() {

		return comuni_bacini_wsLocalService;
	}

	/**
	 * Sets the comuni_bacini_ws local service.
	 *
	 * @param comuni_bacini_wsLocalService the comuni_bacini_ws local service
	 */
	public void setComuni_bacini_wsLocalService(
		it.eng.radarMeteo.service.Comuni_bacini_wsLocalService
			comuni_bacini_wsLocalService) {

		this.comuni_bacini_wsLocalService = comuni_bacini_wsLocalService;
	}

	/**
	 * Returns the comuni_bacini_ws persistence.
	 *
	 * @return the comuni_bacini_ws persistence
	 */
	public Comuni_bacini_wsPersistence getComuni_bacini_wsPersistence() {
		return comuni_bacini_wsPersistence;
	}

	/**
	 * Sets the comuni_bacini_ws persistence.
	 *
	 * @param comuni_bacini_wsPersistence the comuni_bacini_ws persistence
	 */
	public void setComuni_bacini_wsPersistence(
		Comuni_bacini_wsPersistence comuni_bacini_wsPersistence) {

		this.comuni_bacini_wsPersistence = comuni_bacini_wsPersistence;
	}

	/**
	 * Returns the comuni_ws local service.
	 *
	 * @return the comuni_ws local service
	 */
	public it.eng.radarMeteo.service.Comuni_wsLocalService
		getComuni_wsLocalService() {

		return comuni_wsLocalService;
	}

	/**
	 * Sets the comuni_ws local service.
	 *
	 * @param comuni_wsLocalService the comuni_ws local service
	 */
	public void setComuni_wsLocalService(
		it.eng.radarMeteo.service.Comuni_wsLocalService comuni_wsLocalService) {

		this.comuni_wsLocalService = comuni_wsLocalService;
	}

	/**
	 * Returns the comuni_ws persistence.
	 *
	 * @return the comuni_ws persistence
	 */
	public Comuni_wsPersistence getComuni_wsPersistence() {
		return comuni_wsPersistence;
	}

	/**
	 * Sets the comuni_ws persistence.
	 *
	 * @param comuni_wsPersistence the comuni_ws persistence
	 */
	public void setComuni_wsPersistence(
		Comuni_wsPersistence comuni_wsPersistence) {

		this.comuni_wsPersistence = comuni_wsPersistence;
	}

	/**
	 * Returns the comuni_ws finder.
	 *
	 * @return the comuni_ws finder
	 */
	public Comuni_wsFinder getComuni_wsFinder() {
		return comuni_wsFinder;
	}

	/**
	 * Sets the comuni_ws finder.
	 *
	 * @param comuni_wsFinder the comuni_ws finder
	 */
	public void setComuni_wsFinder(Comuni_wsFinder comuni_wsFinder) {
		this.comuni_wsFinder = comuni_wsFinder;
	}

	/**
	 * Returns the img local service.
	 *
	 * @return the img local service
	 */
	public it.eng.radarMeteo.service.ImgLocalService getImgLocalService() {
		return imgLocalService;
	}

	/**
	 * Sets the img local service.
	 *
	 * @param imgLocalService the img local service
	 */
	public void setImgLocalService(
		it.eng.radarMeteo.service.ImgLocalService imgLocalService) {

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
	 * Returns the img finder.
	 *
	 * @return the img finder
	 */
	public ImgFinder getImgFinder() {
		return imgFinder;
	}

	/**
	 * Sets the img finder.
	 *
	 * @param imgFinder the img finder
	 */
	public void setImgFinder(ImgFinder imgFinder) {
		this.imgFinder = imgFinder;
	}

	/**
	 * Returns the json local service.
	 *
	 * @return the json local service
	 */
	public JsonLocalService getJsonLocalService() {
		return jsonLocalService;
	}

	/**
	 * Sets the json local service.
	 *
	 * @param jsonLocalService the json local service
	 */
	public void setJsonLocalService(JsonLocalService jsonLocalService) {
		this.jsonLocalService = jsonLocalService;
	}

	/**
	 * Returns the json persistence.
	 *
	 * @return the json persistence
	 */
	public JsonPersistence getJsonPersistence() {
		return jsonPersistence;
	}

	/**
	 * Sets the json persistence.
	 *
	 * @param jsonPersistence the json persistence
	 */
	public void setJsonPersistence(JsonPersistence jsonPersistence) {
		this.jsonPersistence = jsonPersistence;
	}

	/**
	 * Returns the json finder.
	 *
	 * @return the json finder
	 */
	public JsonFinder getJsonFinder() {
		return jsonFinder;
	}

	/**
	 * Sets the json finder.
	 *
	 * @param jsonFinder the json finder
	 */
	public void setJsonFinder(JsonFinder jsonFinder) {
		this.jsonFinder = jsonFinder;
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
			"it.eng.radarMeteo.model.Json", jsonLocalService);
	}

	public void destroy() {
		persistedModelLocalServiceRegistry.unregister(
			"it.eng.radarMeteo.model.Json");
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return JsonLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return Json.class;
	}

	protected String getModelClassName() {
		return Json.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = jsonPersistence.getDataSource();

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
		type = it.eng.radarMeteo.service.Comuni_bacini_wsLocalService.class
	)
	protected it.eng.radarMeteo.service.Comuni_bacini_wsLocalService
		comuni_bacini_wsLocalService;

	@BeanReference(type = Comuni_bacini_wsPersistence.class)
	protected Comuni_bacini_wsPersistence comuni_bacini_wsPersistence;

	@BeanReference(type = it.eng.radarMeteo.service.Comuni_wsLocalService.class)
	protected it.eng.radarMeteo.service.Comuni_wsLocalService
		comuni_wsLocalService;

	@BeanReference(type = Comuni_wsPersistence.class)
	protected Comuni_wsPersistence comuni_wsPersistence;

	@BeanReference(type = Comuni_wsFinder.class)
	protected Comuni_wsFinder comuni_wsFinder;

	@BeanReference(type = it.eng.radarMeteo.service.ImgLocalService.class)
	protected it.eng.radarMeteo.service.ImgLocalService imgLocalService;

	@BeanReference(type = ImgPersistence.class)
	protected ImgPersistence imgPersistence;

	@BeanReference(type = ImgFinder.class)
	protected ImgFinder imgFinder;

	@BeanReference(type = JsonLocalService.class)
	protected JsonLocalService jsonLocalService;

	@BeanReference(type = JsonPersistence.class)
	protected JsonPersistence jsonPersistence;

	@BeanReference(type = JsonFinder.class)
	protected JsonFinder jsonFinder;

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