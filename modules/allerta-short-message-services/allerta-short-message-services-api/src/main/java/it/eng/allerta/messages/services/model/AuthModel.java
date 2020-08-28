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

package it.eng.allerta.messages.services.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

/**
 * The base model interface for the Auth service. Represents a row in the &quot;smsService_Auth&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>it.eng.allerta.messages.services.model.impl.AuthModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>it.eng.allerta.messages.services.model.impl.AuthImpl</code>.
 * </p>
 *
 * @author Giorgianni_F
 * @see Auth
 * @generated
 */
@ProviderType
public interface AuthModel extends BaseModel<Auth> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a auth model instance should use the {@link Auth} interface instead.
	 */

	/**
	 * Returns the primary key of this auth.
	 *
	 * @return the primary key of this auth
	 */
	public String getPrimaryKey();

	/**
	 * Sets the primary key of this auth.
	 *
	 * @param primaryKey the primary key of this auth
	 */
	public void setPrimaryKey(String primaryKey);

	/**
	 * Returns the key of this auth.
	 *
	 * @return the key of this auth
	 */
	@AutoEscape
	public String getKey();

	/**
	 * Sets the key of this auth.
	 *
	 * @param key the key of this auth
	 */
	public void setKey(String key);

	/**
	 * Returns the value of this auth.
	 *
	 * @return the value of this auth
	 */
	@AutoEscape
	public String getValue();

	/**
	 * Sets the value of this auth.
	 *
	 * @param value the value of this auth
	 */
	public void setValue(String value);

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
	public int compareTo(it.eng.allerta.messages.services.model.Auth auth);

	@Override
	public int hashCode();

	@Override
	public CacheModel<it.eng.allerta.messages.services.model.Auth>
		toCacheModel();

	@Override
	public it.eng.allerta.messages.services.model.Auth toEscapedModel();

	@Override
	public it.eng.allerta.messages.services.model.Auth toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();

}