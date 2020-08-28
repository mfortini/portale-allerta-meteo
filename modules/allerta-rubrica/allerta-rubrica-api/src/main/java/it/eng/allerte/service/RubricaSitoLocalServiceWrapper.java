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

package it.eng.allerte.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RubricaSitoLocalService}.
 *
 * @author Pratola_L
 * @see RubricaSitoLocalService
 * @generated
 */
@ProviderType
public class RubricaSitoLocalServiceWrapper
	implements RubricaSitoLocalService,
			   ServiceWrapper<RubricaSitoLocalService> {

	public RubricaSitoLocalServiceWrapper(
		RubricaSitoLocalService rubricaSitoLocalService) {

		_rubricaSitoLocalService = rubricaSitoLocalService;
	}

	/**
	 * Adds the rubrica sito to the database. Also notifies the appropriate model listeners.
	 *
	 * @param rubricaSito the rubrica sito
	 * @return the rubrica sito that was added
	 */
	@Override
	public it.eng.allerte.model.RubricaSito addRubricaSito(
		it.eng.allerte.model.RubricaSito rubricaSito) {

		return _rubricaSitoLocalService.addRubricaSito(rubricaSito);
	}

	/**
	 * Creates a new rubrica sito with the primary key. Does not add the rubrica sito to the database.
	 *
	 * @param ID_SITO the primary key for the new rubrica sito
	 * @return the new rubrica sito
	 */
	@Override
	public it.eng.allerte.model.RubricaSito createRubricaSito(long ID_SITO) {
		return _rubricaSitoLocalService.createRubricaSito(ID_SITO);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rubricaSitoLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the rubrica sito with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ID_SITO the primary key of the rubrica sito
	 * @return the rubrica sito that was removed
	 * @throws PortalException if a rubrica sito with the primary key could not be found
	 */
	@Override
	public it.eng.allerte.model.RubricaSito deleteRubricaSito(long ID_SITO)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rubricaSitoLocalService.deleteRubricaSito(ID_SITO);
	}

	/**
	 * Deletes the rubrica sito from the database. Also notifies the appropriate model listeners.
	 *
	 * @param rubricaSito the rubrica sito
	 * @return the rubrica sito that was removed
	 */
	@Override
	public it.eng.allerte.model.RubricaSito deleteRubricaSito(
		it.eng.allerte.model.RubricaSito rubricaSito) {

		return _rubricaSitoLocalService.deleteRubricaSito(rubricaSito);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _rubricaSitoLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _rubricaSitoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>it.eng.allerte.model.impl.RubricaSitoModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _rubricaSitoLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>it.eng.allerte.model.impl.RubricaSitoModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _rubricaSitoLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _rubricaSitoLocalService.dynamicQueryCount(dynamicQuery);
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
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _rubricaSitoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public it.eng.allerte.model.RubricaSito fetchRubricaSito(long ID_SITO) {
		return _rubricaSitoLocalService.fetchRubricaSito(ID_SITO);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _rubricaSitoLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _rubricaSitoLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _rubricaSitoLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rubricaSitoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the rubrica sito with the primary key.
	 *
	 * @param ID_SITO the primary key of the rubrica sito
	 * @return the rubrica sito
	 * @throws PortalException if a rubrica sito with the primary key could not be found
	 */
	@Override
	public it.eng.allerte.model.RubricaSito getRubricaSito(long ID_SITO)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rubricaSitoLocalService.getRubricaSito(ID_SITO);
	}

	/**
	 * Returns a range of all the rubrica sitos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>it.eng.allerte.model.impl.RubricaSitoModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of rubrica sitos
	 * @param end the upper bound of the range of rubrica sitos (not inclusive)
	 * @return the range of rubrica sitos
	 */
	@Override
	public java.util.List<it.eng.allerte.model.RubricaSito> getRubricaSitos(
		int start, int end) {

		return _rubricaSitoLocalService.getRubricaSitos(start, end);
	}

	/**
	 * Returns the number of rubrica sitos.
	 *
	 * @return the number of rubrica sitos
	 */
	@Override
	public int getRubricaSitosCount() {
		return _rubricaSitoLocalService.getRubricaSitosCount();
	}

	/**
	 * Updates the rubrica sito in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param rubricaSito the rubrica sito
	 * @return the rubrica sito that was updated
	 */
	@Override
	public it.eng.allerte.model.RubricaSito updateRubricaSito(
		it.eng.allerte.model.RubricaSito rubricaSito) {

		return _rubricaSitoLocalService.updateRubricaSito(rubricaSito);
	}

	@Override
	public RubricaSitoLocalService getWrappedService() {
		return _rubricaSitoLocalService;
	}

	@Override
	public void setWrappedService(
		RubricaSitoLocalService rubricaSitoLocalService) {

		_rubricaSitoLocalService = rubricaSitoLocalService;
	}

	private RubricaSitoLocalService _rubricaSitoLocalService;

}