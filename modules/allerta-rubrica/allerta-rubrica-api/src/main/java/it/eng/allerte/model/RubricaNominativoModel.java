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

package it.eng.allerte.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the RubricaNominativo service. Represents a row in the &quot;rubrica_RubricaNominativo&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>it.eng.allerte.model.impl.RubricaNominativoModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>it.eng.allerte.model.impl.RubricaNominativoImpl</code>.
 * </p>
 *
 * @author Pratola_L
 * @see RubricaNominativo
 * @generated
 */
@ProviderType
public interface RubricaNominativoModel extends BaseModel<RubricaNominativo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a rubrica nominativo model instance should use the {@link RubricaNominativo} interface instead.
	 */

	/**
	 * Returns the primary key of this rubrica nominativo.
	 *
	 * @return the primary key of this rubrica nominativo
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this rubrica nominativo.
	 *
	 * @param primaryKey the primary key of this rubrica nominativo
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the id_nominativo of this rubrica nominativo.
	 *
	 * @return the id_nominativo of this rubrica nominativo
	 */
	public long getID_NOMINATIVO();

	/**
	 * Sets the id_nominativo of this rubrica nominativo.
	 *
	 * @param ID_NOMINATIVO the id_nominativo of this rubrica nominativo
	 */
	public void setID_NOMINATIVO(long ID_NOMINATIVO);

	/**
	 * Returns the cognome of this rubrica nominativo.
	 *
	 * @return the cognome of this rubrica nominativo
	 */
	@AutoEscape
	public String getCOGNOME();

	/**
	 * Sets the cognome of this rubrica nominativo.
	 *
	 * @param COGNOME the cognome of this rubrica nominativo
	 */
	public void setCOGNOME(String COGNOME);

	/**
	 * Returns the nome of this rubrica nominativo.
	 *
	 * @return the nome of this rubrica nominativo
	 */
	@AutoEscape
	public String getNOME();

	/**
	 * Sets the nome of this rubrica nominativo.
	 *
	 * @param NOME the nome of this rubrica nominativo
	 */
	public void setNOME(String NOME);

	/**
	 * Returns the indirizzo of this rubrica nominativo.
	 *
	 * @return the indirizzo of this rubrica nominativo
	 */
	@AutoEscape
	public String getINDIRIZZO();

	/**
	 * Sets the indirizzo of this rubrica nominativo.
	 *
	 * @param INDIRIZZO the indirizzo of this rubrica nominativo
	 */
	public void setINDIRIZZO(String INDIRIZZO);

	/**
	 * Returns the fk_sito_proprietario of this rubrica nominativo.
	 *
	 * @return the fk_sito_proprietario of this rubrica nominativo
	 */
	public long getFK_SITO_PROPRIETARIO();

	/**
	 * Sets the fk_sito_proprietario of this rubrica nominativo.
	 *
	 * @param FK_SITO_PROPRIETARIO the fk_sito_proprietario of this rubrica nominativo
	 */
	public void setFK_SITO_PROPRIETARIO(long FK_SITO_PROPRIETARIO);

	/**
	 * Returns the fk_utente_portale of this rubrica nominativo.
	 *
	 * @return the fk_utente_portale of this rubrica nominativo
	 */
	public long getFK_UTENTE_PORTALE();

	/**
	 * Sets the fk_utente_portale of this rubrica nominativo.
	 *
	 * @param FK_UTENTE_PORTALE the fk_utente_portale of this rubrica nominativo
	 */
	public void setFK_UTENTE_PORTALE(long FK_UTENTE_PORTALE);

	/**
	 * Returns the fk_utente_creazione of this rubrica nominativo.
	 *
	 * @return the fk_utente_creazione of this rubrica nominativo
	 */
	public long getFK_UTENTE_CREAZIONE();

	/**
	 * Sets the fk_utente_creazione of this rubrica nominativo.
	 *
	 * @param FK_UTENTE_CREAZIONE the fk_utente_creazione of this rubrica nominativo
	 */
	public void setFK_UTENTE_CREAZIONE(long FK_UTENTE_CREAZIONE);

	/**
	 * Returns the data_creazione of this rubrica nominativo.
	 *
	 * @return the data_creazione of this rubrica nominativo
	 */
	public Date getDATA_CREAZIONE();

	/**
	 * Sets the data_creazione of this rubrica nominativo.
	 *
	 * @param DATA_CREAZIONE the data_creazione of this rubrica nominativo
	 */
	public void setDATA_CREAZIONE(Date DATA_CREAZIONE);

	/**
	 * Returns the fk_utente_modifica of this rubrica nominativo.
	 *
	 * @return the fk_utente_modifica of this rubrica nominativo
	 */
	public long getFK_UTENTE_MODIFICA();

	/**
	 * Sets the fk_utente_modifica of this rubrica nominativo.
	 *
	 * @param FK_UTENTE_MODIFICA the fk_utente_modifica of this rubrica nominativo
	 */
	public void setFK_UTENTE_MODIFICA(long FK_UTENTE_MODIFICA);

	/**
	 * Returns the data_modifica of this rubrica nominativo.
	 *
	 * @return the data_modifica of this rubrica nominativo
	 */
	public Date getDATA_MODIFICA();

	/**
	 * Sets the data_modifica of this rubrica nominativo.
	 *
	 * @param DATA_MODIFICA the data_modifica of this rubrica nominativo
	 */
	public void setDATA_MODIFICA(Date DATA_MODIFICA);

	/**
	 * Returns the disabled of this rubrica nominativo.
	 *
	 * @return the disabled of this rubrica nominativo
	 */
	public boolean getDISABLED();

	/**
	 * Returns <code>true</code> if this rubrica nominativo is disabled.
	 *
	 * @return <code>true</code> if this rubrica nominativo is disabled; <code>false</code> otherwise
	 */
	public boolean isDISABLED();

	/**
	 * Sets whether this rubrica nominativo is disabled.
	 *
	 * @param DISABLED the disabled of this rubrica nominativo
	 */
	public void setDISABLED(boolean DISABLED);

	/**
	 * Returns the modifica_minore of this rubrica nominativo.
	 *
	 * @return the modifica_minore of this rubrica nominativo
	 */
	public boolean getMODIFICA_MINORE();

	/**
	 * Returns <code>true</code> if this rubrica nominativo is modifica_minore.
	 *
	 * @return <code>true</code> if this rubrica nominativo is modifica_minore; <code>false</code> otherwise
	 */
	public boolean isMODIFICA_MINORE();

	/**
	 * Sets whether this rubrica nominativo is modifica_minore.
	 *
	 * @param MODIFICA_MINORE the modifica_minore of this rubrica nominativo
	 */
	public void setMODIFICA_MINORE(boolean MODIFICA_MINORE);

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
		it.eng.allerte.model.RubricaNominativo rubricaNominativo);

	@Override
	public int hashCode();

	@Override
	public CacheModel<it.eng.allerte.model.RubricaNominativo> toCacheModel();

	@Override
	public it.eng.allerte.model.RubricaNominativo toEscapedModel();

	@Override
	public it.eng.allerte.model.RubricaNominativo toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();

}