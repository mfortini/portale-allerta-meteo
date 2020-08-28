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

import it.eng.previsioni.meteo.model.Img;
import it.eng.previsioni.meteo.service.ImgService;
import it.eng.previsioni.meteo.service.persistence.BollettinoPersistence;
import it.eng.previsioni.meteo.service.persistence.ImgPersistence;
import it.eng.previsioni.meteo.service.persistence.StoricoPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the img remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link it.eng.previsioni.meteo.service.impl.ImgServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see it.eng.previsioni.meteo.service.impl.ImgServiceImpl
 * @generated
 */
public abstract class ImgServiceBaseImpl
	extends BaseServiceImpl implements ImgService, IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>ImgService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>it.eng.previsioni.meteo.service.ImgServiceUtil</code>.
	 */

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
	 * Returns the bollettino remote service.
	 *
	 * @return the bollettino remote service
	 */
	public it.eng.previsioni.meteo.service.BollettinoService
		getBollettinoService() {

		return bollettinoService;
	}

	/**
	 * Sets the bollettino remote service.
	 *
	 * @param bollettinoService the bollettino remote service
	 */
	public void setBollettinoService(
		it.eng.previsioni.meteo.service.BollettinoService bollettinoService) {

		this.bollettinoService = bollettinoService;
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
	 * Returns the img remote service.
	 *
	 * @return the img remote service
	 */
	public ImgService getImgService() {
		return imgService;
	}

	/**
	 * Sets the img remote service.
	 *
	 * @param imgService the img remote service
	 */
	public void setImgService(ImgService imgService) {
		this.imgService = imgService;
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
	public it.eng.previsioni.meteo.service.StoricoLocalService
		getStoricoLocalService() {

		return storicoLocalService;
	}

	/**
	 * Sets the storico local service.
	 *
	 * @param storicoLocalService the storico local service
	 */
	public void setStoricoLocalService(
		it.eng.previsioni.meteo.service.StoricoLocalService
			storicoLocalService) {

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
		return ImgService.class.getName();
	}

	protected Class<?> getModelClass() {
		return Img.class;
	}

	protected String getModelClassName() {
		return Img.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = imgPersistence.getDataSource();

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

	@BeanReference(
		type = it.eng.previsioni.meteo.service.BollettinoService.class
	)
	protected it.eng.previsioni.meteo.service.BollettinoService
		bollettinoService;

	@BeanReference(type = BollettinoPersistence.class)
	protected BollettinoPersistence bollettinoPersistence;

	@BeanReference(type = it.eng.previsioni.meteo.service.ImgLocalService.class)
	protected it.eng.previsioni.meteo.service.ImgLocalService imgLocalService;

	@BeanReference(type = ImgService.class)
	protected ImgService imgService;

	@BeanReference(type = ImgPersistence.class)
	protected ImgPersistence imgPersistence;

	@BeanReference(
		type = it.eng.previsioni.meteo.service.StoricoLocalService.class
	)
	protected it.eng.previsioni.meteo.service.StoricoLocalService
		storicoLocalService;

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