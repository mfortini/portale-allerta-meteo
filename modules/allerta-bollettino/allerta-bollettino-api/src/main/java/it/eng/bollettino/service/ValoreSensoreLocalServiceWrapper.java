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

package it.eng.bollettino.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ValoreSensoreLocalService}.
 *
 * @author GFAVINI
 * @see ValoreSensoreLocalService
 * @generated
 */
@ProviderType
public class ValoreSensoreLocalServiceWrapper
	implements ValoreSensoreLocalService,
			   ServiceWrapper<ValoreSensoreLocalService> {

	public ValoreSensoreLocalServiceWrapper(
		ValoreSensoreLocalService valoreSensoreLocalService) {

		_valoreSensoreLocalService = valoreSensoreLocalService;
	}

	/**
	 * Adds the valore sensore to the database. Also notifies the appropriate model listeners.
	 *
	 * @param valoreSensore the valore sensore
	 * @return the valore sensore that was added
	 */
	@Override
	public it.eng.bollettino.model.ValoreSensore addValoreSensore(
		it.eng.bollettino.model.ValoreSensore valoreSensore) {

		return _valoreSensoreLocalService.addValoreSensore(valoreSensore);
	}

	@Override
	public java.util.Map<String, Object> aggiornaDatiOsservati(String dati) {
		return _valoreSensoreLocalService.aggiornaDatiOsservati(dati);
	}

	@Override
	public it.eng.bollettino.cron.RisultatiAggiornamento
		aggiornaTuttiDatiOsservati() {

		return _valoreSensoreLocalService.aggiornaTuttiDatiOsservati();
	}

	@Override
	public boolean controlloPioggiaMonitoraggio() {
		return _valoreSensoreLocalService.controlloPioggiaMonitoraggio();
	}

	/**
	 * Creates a new valore sensore with the primary key. Does not add the valore sensore to the database.
	 *
	 * @param id the primary key for the new valore sensore
	 * @return the new valore sensore
	 */
	@Override
	public it.eng.bollettino.model.ValoreSensore createValoreSensore(long id) {
		return _valoreSensoreLocalService.createValoreSensore(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _valoreSensoreLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the valore sensore with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the valore sensore
	 * @return the valore sensore that was removed
	 * @throws PortalException if a valore sensore with the primary key could not be found
	 */
	@Override
	public it.eng.bollettino.model.ValoreSensore deleteValoreSensore(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _valoreSensoreLocalService.deleteValoreSensore(id);
	}

	/**
	 * Deletes the valore sensore from the database. Also notifies the appropriate model listeners.
	 *
	 * @param valoreSensore the valore sensore
	 * @return the valore sensore that was removed
	 */
	@Override
	public it.eng.bollettino.model.ValoreSensore deleteValoreSensore(
		it.eng.bollettino.model.ValoreSensore valoreSensore) {

		return _valoreSensoreLocalService.deleteValoreSensore(valoreSensore);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _valoreSensoreLocalService.dynamicQuery();
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

		return _valoreSensoreLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>it.eng.bollettino.model.impl.ValoreSensoreModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

		return _valoreSensoreLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>it.eng.bollettino.model.impl.ValoreSensoreModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

		return _valoreSensoreLocalService.dynamicQuery(
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

		return _valoreSensoreLocalService.dynamicQueryCount(dynamicQuery);
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

		return _valoreSensoreLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public it.eng.bollettino.model.ValoreSensore fetchValoreSensore(long id) {
		return _valoreSensoreLocalService.fetchValoreSensore(id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _valoreSensoreLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.Date getDataAggiornamentoStazioneVariabile(
		String stazione, String variabile) {

		return _valoreSensoreLocalService.getDataAggiornamentoStazioneVariabile(
			stazione, variabile);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _valoreSensoreLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _valoreSensoreLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _valoreSensoreLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the valore sensore with the primary key.
	 *
	 * @param id the primary key of the valore sensore
	 * @return the valore sensore
	 * @throws PortalException if a valore sensore with the primary key could not be found
	 */
	@Override
	public it.eng.bollettino.model.ValoreSensore getValoreSensore(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _valoreSensoreLocalService.getValoreSensore(id);
	}

	/**
	 * Returns a range of all the valore sensores.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>it.eng.bollettino.model.impl.ValoreSensoreModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of valore sensores
	 * @param end the upper bound of the range of valore sensores (not inclusive)
	 * @return the range of valore sensores
	 */
	@Override
	public java.util.List<it.eng.bollettino.model.ValoreSensore>
		getValoreSensores(int start, int end) {

		return _valoreSensoreLocalService.getValoreSensores(start, end);
	}

	/**
	 * Returns the number of valore sensores.
	 *
	 * @return the number of valore sensores
	 */
	@Override
	public int getValoreSensoresCount() {
		return _valoreSensoreLocalService.getValoreSensoresCount();
	}

	/**
	 * Updates the valore sensore in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param valoreSensore the valore sensore
	 * @return the valore sensore that was updated
	 */
	@Override
	public it.eng.bollettino.model.ValoreSensore updateValoreSensore(
		it.eng.bollettino.model.ValoreSensore valoreSensore) {

		return _valoreSensoreLocalService.updateValoreSensore(valoreSensore);
	}

	@Override
	public ValoreSensoreLocalService getWrappedService() {
		return _valoreSensoreLocalService;
	}

	@Override
	public void setWrappedService(
		ValoreSensoreLocalService valoreSensoreLocalService) {

		_valoreSensoreLocalService = valoreSensoreLocalService;
	}

	private ValoreSensoreLocalService _valoreSensoreLocalService;

}