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

package it.eng.allerter.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Email service. Represents a row in the &quot;ALLERTER_Email&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>it.eng.allerter.model.impl.EmailModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>it.eng.allerter.model.impl.EmailImpl</code>.
 * </p>
 *
 * @author GFAVINI
 * @see Email
 * @generated
 */
@ProviderType
public interface EmailModel extends BaseModel<Email> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a email model instance should use the {@link Email} interface instead.
	 */

	/**
	 * Returns the primary key of this email.
	 *
	 * @return the primary key of this email
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this email.
	 *
	 * @param primaryKey the primary key of this email
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this email.
	 *
	 * @return the ID of this email
	 */
	public long getId();

	/**
	 * Sets the ID of this email.
	 *
	 * @param id the ID of this email
	 */
	public void setId(long id);

	/**
	 * Returns the tipo of this email.
	 *
	 * @return the tipo of this email
	 */
	@AutoEscape
	public String getTipo();

	/**
	 * Sets the tipo of this email.
	 *
	 * @param tipo the tipo of this email
	 */
	public void setTipo(String tipo);

	/**
	 * Returns the sottotipo of this email.
	 *
	 * @return the sottotipo of this email
	 */
	@AutoEscape
	public String getSottotipo();

	/**
	 * Sets the sottotipo of this email.
	 *
	 * @param sottotipo the sottotipo of this email
	 */
	public void setSottotipo(String sottotipo);

	/**
	 * Returns the param of this email.
	 *
	 * @return the param of this email
	 */
	public long getParam();

	/**
	 * Sets the param of this email.
	 *
	 * @param param the param of this email
	 */
	public void setParam(long param);

	/**
	 * Returns the destinatario of this email.
	 *
	 * @return the destinatario of this email
	 */
	public long getDestinatario();

	/**
	 * Sets the destinatario of this email.
	 *
	 * @param destinatario the destinatario of this email
	 */
	public void setDestinatario(long destinatario);

	/**
	 * Returns the indirizzo of this email.
	 *
	 * @return the indirizzo of this email
	 */
	@AutoEscape
	public String getIndirizzo();

	/**
	 * Sets the indirizzo of this email.
	 *
	 * @param indirizzo the indirizzo of this email
	 */
	public void setIndirizzo(String indirizzo);

	/**
	 * Returns the nome destinatario of this email.
	 *
	 * @return the nome destinatario of this email
	 */
	@AutoEscape
	public String getNomeDestinatario();

	/**
	 * Sets the nome destinatario of this email.
	 *
	 * @param nomeDestinatario the nome destinatario of this email
	 */
	public void setNomeDestinatario(String nomeDestinatario);

	/**
	 * Returns the stato of this email.
	 *
	 * @return the stato of this email
	 */
	public long getStato();

	/**
	 * Sets the stato of this email.
	 *
	 * @param stato the stato of this email
	 */
	public void setStato(long stato);

	/**
	 * Returns the data invio of this email.
	 *
	 * @return the data invio of this email
	 */
	public Date getDataInvio();

	/**
	 * Sets the data invio of this email.
	 *
	 * @param dataInvio the data invio of this email
	 */
	public void setDataInvio(Date dataInvio);

	/**
	 * Returns the testo of this email.
	 *
	 * @return the testo of this email
	 */
	@AutoEscape
	public String getTesto();

	/**
	 * Sets the testo of this email.
	 *
	 * @param testo the testo of this email
	 */
	public void setTesto(String testo);

	/**
	 * Returns the oggetto of this email.
	 *
	 * @return the oggetto of this email
	 */
	@AutoEscape
	public String getOggetto();

	/**
	 * Sets the oggetto of this email.
	 *
	 * @param oggetto the oggetto of this email
	 */
	public void setOggetto(String oggetto);

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
	public int compareTo(it.eng.allerter.model.Email email);

	@Override
	public int hashCode();

	@Override
	public CacheModel<it.eng.allerter.model.Email> toCacheModel();

	@Override
	public it.eng.allerter.model.Email toEscapedModel();

	@Override
	public it.eng.allerter.model.Email toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();

}