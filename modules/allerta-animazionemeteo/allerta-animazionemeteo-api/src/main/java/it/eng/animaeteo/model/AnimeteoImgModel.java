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

package it.eng.animaeteo.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the AnimeteoImg service. Represents a row in the &quot;animeteo_AnimeteoImg&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>it.eng.animaeteo.model.impl.AnimeteoImgModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>it.eng.animaeteo.model.impl.AnimeteoImgImpl</code>.
 * </p>
 *
 * @author UTENTE
 * @see AnimeteoImg
 * @generated
 */
@ProviderType
public interface AnimeteoImgModel extends BaseModel<AnimeteoImg> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a animeteo img model instance should use the {@link AnimeteoImg} interface instead.
	 */

	/**
	 * Returns the primary key of this animeteo img.
	 *
	 * @return the primary key of this animeteo img
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this animeteo img.
	 *
	 * @param primaryKey the primary key of this animeteo img
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this animeteo img.
	 *
	 * @return the ID of this animeteo img
	 */
	public long getId();

	/**
	 * Sets the ID of this animeteo img.
	 *
	 * @param id the ID of this animeteo img
	 */
	public void setId(long id);

	/**
	 * Returns the name of this animeteo img.
	 *
	 * @return the name of this animeteo img
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this animeteo img.
	 *
	 * @param name the name of this animeteo img
	 */
	public void setName(String name);

	/**
	 * Returns the type of this animeteo img.
	 *
	 * @return the type of this animeteo img
	 */
	@AutoEscape
	public String getType();

	/**
	 * Sets the type of this animeteo img.
	 *
	 * @param type the type of this animeteo img
	 */
	public void setType(String type);

	/**
	 * Returns the inserted of this animeteo img.
	 *
	 * @return the inserted of this animeteo img
	 */
	public Date getInserted();

	/**
	 * Sets the inserted of this animeteo img.
	 *
	 * @param inserted the inserted of this animeteo img
	 */
	public void setInserted(Date inserted);

	/**
	 * Returns the data of this animeteo img.
	 *
	 * @return the data of this animeteo img
	 */
	@AutoEscape
	public String getData();

	/**
	 * Sets the data of this animeteo img.
	 *
	 * @param data the data of this animeteo img
	 */
	public void setData(String data);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(it.eng.animaeteo.model.AnimeteoImg animeteoImg);

	@Override
	public int hashCode();

	@Override
	public CacheModel<it.eng.animaeteo.model.AnimeteoImg> toCacheModel();

	@Override
	public it.eng.animaeteo.model.AnimeteoImg toEscapedModel();

	@Override
	public it.eng.animaeteo.model.AnimeteoImg toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();

}