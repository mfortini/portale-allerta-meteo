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

package it.eng.bollettino.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the StazioneVariabile service. Represents a row in the &quot;BOLLETTINO_StazioneVariabile&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>it.eng.bollettino.model.impl.StazioneVariabileModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>it.eng.bollettino.model.impl.StazioneVariabileImpl</code>.
 * </p>
 *
 * @author GFAVINI
 * @see StazioneVariabile
 * @generated
 */
@ProviderType
public interface StazioneVariabileModel extends BaseModel<StazioneVariabile> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a stazione variabile model instance should use the {@link StazioneVariabile} interface instead.
	 */

	/**
	 * Returns the primary key of this stazione variabile.
	 *
	 * @return the primary key of this stazione variabile
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this stazione variabile.
	 *
	 * @param primaryKey the primary key of this stazione variabile
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this stazione variabile.
	 *
	 * @return the uuid of this stazione variabile
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this stazione variabile.
	 *
	 * @param uuid the uuid of this stazione variabile
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the ID of this stazione variabile.
	 *
	 * @return the ID of this stazione variabile
	 */
	public long getId();

	/**
	 * Sets the ID of this stazione variabile.
	 *
	 * @param id the ID of this stazione variabile
	 */
	public void setId(long id);

	/**
	 * Returns the id stazione of this stazione variabile.
	 *
	 * @return the id stazione of this stazione variabile
	 */
	@AutoEscape
	public String getIdStazione();

	/**
	 * Sets the id stazione of this stazione variabile.
	 *
	 * @param idStazione the id stazione of this stazione variabile
	 */
	public void setIdStazione(String idStazione);

	/**
	 * Returns the id variabile of this stazione variabile.
	 *
	 * @return the id variabile of this stazione variabile
	 */
	@AutoEscape
	public String getIdVariabile();

	/**
	 * Sets the id variabile of this stazione variabile.
	 *
	 * @param idVariabile the id variabile of this stazione variabile
	 */
	public void setIdVariabile(String idVariabile);

	/**
	 * Returns the data ultimo valore of this stazione variabile.
	 *
	 * @return the data ultimo valore of this stazione variabile
	 */
	public Date getDataUltimoValore();

	/**
	 * Sets the data ultimo valore of this stazione variabile.
	 *
	 * @param dataUltimoValore the data ultimo valore of this stazione variabile
	 */
	public void setDataUltimoValore(Date dataUltimoValore);

	/**
	 * Returns the soglia1 of this stazione variabile.
	 *
	 * @return the soglia1 of this stazione variabile
	 */
	public double getSoglia1();

	/**
	 * Sets the soglia1 of this stazione variabile.
	 *
	 * @param soglia1 the soglia1 of this stazione variabile
	 */
	public void setSoglia1(double soglia1);

	/**
	 * Returns the soglia2 of this stazione variabile.
	 *
	 * @return the soglia2 of this stazione variabile
	 */
	public double getSoglia2();

	/**
	 * Sets the soglia2 of this stazione variabile.
	 *
	 * @param soglia2 the soglia2 of this stazione variabile
	 */
	public void setSoglia2(double soglia2);

	/**
	 * Returns the soglia3 of this stazione variabile.
	 *
	 * @return the soglia3 of this stazione variabile
	 */
	public double getSoglia3();

	/**
	 * Sets the soglia3 of this stazione variabile.
	 *
	 * @param soglia3 the soglia3 of this stazione variabile
	 */
	public void setSoglia3(double soglia3);

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
	public int compareTo(
		it.eng.bollettino.model.StazioneVariabile stazioneVariabile);

	@Override
	public int hashCode();

	@Override
	public CacheModel<it.eng.bollettino.model.StazioneVariabile> toCacheModel();

	@Override
	public it.eng.bollettino.model.StazioneVariabile toEscapedModel();

	@Override
	public it.eng.bollettino.model.StazioneVariabile toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();

}