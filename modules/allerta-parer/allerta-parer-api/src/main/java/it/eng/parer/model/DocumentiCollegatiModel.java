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

package it.eng.parer.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import it.eng.parer.service.persistence.DocumentiCollegatiPK;

import java.io.Serializable;

/**
 * The base model interface for the DocumentiCollegati service. Represents a row in the &quot;parer_DocumentiCollegati&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>it.eng.parer.model.impl.DocumentiCollegatiModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>it.eng.parer.model.impl.DocumentiCollegatiImpl</code>.
 * </p>
 *
 * @author Pratola_L
 * @see DocumentiCollegati
 * @generated
 */
@ProviderType
public interface DocumentiCollegatiModel extends BaseModel<DocumentiCollegati> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a documenti collegati model instance should use the {@link DocumentiCollegati} interface instead.
	 */

	/**
	 * Returns the primary key of this documenti collegati.
	 *
	 * @return the primary key of this documenti collegati
	 */
	public DocumentiCollegatiPK getPrimaryKey();

	/**
	 * Sets the primary key of this documenti collegati.
	 *
	 * @param primaryKey the primary key of this documenti collegati
	 */
	public void setPrimaryKey(DocumentiCollegatiPK primaryKey);

	/**
	 * Returns the doc_collegato_numero of this documenti collegati.
	 *
	 * @return the doc_collegato_numero of this documenti collegati
	 */
	@AutoEscape
	public String getDOC_COLLEGATO_NUMERO();

	/**
	 * Sets the doc_collegato_numero of this documenti collegati.
	 *
	 * @param DOC_COLLEGATO_NUMERO the doc_collegato_numero of this documenti collegati
	 */
	public void setDOC_COLLEGATO_NUMERO(String DOC_COLLEGATO_NUMERO);

	/**
	 * Returns the doc_collegato_anno of this documenti collegati.
	 *
	 * @return the doc_collegato_anno of this documenti collegati
	 */
	public int getDOC_COLLEGATO_ANNO();

	/**
	 * Sets the doc_collegato_anno of this documenti collegati.
	 *
	 * @param DOC_COLLEGATO_ANNO the doc_collegato_anno of this documenti collegati
	 */
	public void setDOC_COLLEGATO_ANNO(int DOC_COLLEGATO_ANNO);

	/**
	 * Returns the doc_collegato_tipo_registro of this documenti collegati.
	 *
	 * @return the doc_collegato_tipo_registro of this documenti collegati
	 */
	@AutoEscape
	public String getDOC_COLLEGATO_TIPO_REGISTRO();

	/**
	 * Sets the doc_collegato_tipo_registro of this documenti collegati.
	 *
	 * @param DOC_COLLEGATO_TIPO_REGISTRO the doc_collegato_tipo_registro of this documenti collegati
	 */
	public void setDOC_COLLEGATO_TIPO_REGISTRO(
		String DOC_COLLEGATO_TIPO_REGISTRO);

	/**
	 * Returns the descrizione_collegamento of this documenti collegati.
	 *
	 * @return the descrizione_collegamento of this documenti collegati
	 */
	@AutoEscape
	public String getDESCRIZIONE_COLLEGAMENTO();

	/**
	 * Sets the descrizione_collegamento of this documenti collegati.
	 *
	 * @param DESCRIZIONE_COLLEGAMENTO the descrizione_collegamento of this documenti collegati
	 */
	public void setDESCRIZIONE_COLLEGAMENTO(String DESCRIZIONE_COLLEGAMENTO);

	/**
	 * Returns the id_invio of this documenti collegati.
	 *
	 * @return the id_invio of this documenti collegati
	 */
	public long getID_INVIO();

	/**
	 * Sets the id_invio of this documenti collegati.
	 *
	 * @param ID_INVIO the id_invio of this documenti collegati
	 */
	public void setID_INVIO(long ID_INVIO);

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
		it.eng.parer.model.DocumentiCollegati documentiCollegati);

	@Override
	public int hashCode();

	@Override
	public CacheModel<it.eng.parer.model.DocumentiCollegati> toCacheModel();

	@Override
	public it.eng.parer.model.DocumentiCollegati toEscapedModel();

	@Override
	public it.eng.parer.model.DocumentiCollegati toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();

}