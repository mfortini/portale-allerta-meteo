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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link it.eng.allerte.service.http.RubricaRuoloServiceSoap}.
 *
 * @author Pratola_L
 * @generated
 */
@ProviderType
public class RubricaRuoloSoap implements Serializable {

	public static RubricaRuoloSoap toSoapModel(RubricaRuolo model) {
		RubricaRuoloSoap soapModel = new RubricaRuoloSoap();

		soapModel.setID_RUOLO(model.getID_RUOLO());
		soapModel.setDESCRIZIONE(model.getDESCRIZIONE());
		soapModel.setFK_RUOLO_LIFERAY(model.getFK_RUOLO_LIFERAY());

		return soapModel;
	}

	public static RubricaRuoloSoap[] toSoapModels(RubricaRuolo[] models) {
		RubricaRuoloSoap[] soapModels = new RubricaRuoloSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RubricaRuoloSoap[][] toSoapModels(RubricaRuolo[][] models) {
		RubricaRuoloSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new RubricaRuoloSoap[models.length][models[0].length];
		}
		else {
			soapModels = new RubricaRuoloSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RubricaRuoloSoap[] toSoapModels(List<RubricaRuolo> models) {
		List<RubricaRuoloSoap> soapModels = new ArrayList<RubricaRuoloSoap>(
			models.size());

		for (RubricaRuolo model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RubricaRuoloSoap[soapModels.size()]);
	}

	public RubricaRuoloSoap() {
	}

	public long getPrimaryKey() {
		return _ID_RUOLO;
	}

	public void setPrimaryKey(long pk) {
		setID_RUOLO(pk);
	}

	public long getID_RUOLO() {
		return _ID_RUOLO;
	}

	public void setID_RUOLO(long ID_RUOLO) {
		_ID_RUOLO = ID_RUOLO;
	}

	public String getDESCRIZIONE() {
		return _DESCRIZIONE;
	}

	public void setDESCRIZIONE(String DESCRIZIONE) {
		_DESCRIZIONE = DESCRIZIONE;
	}

	public long getFK_RUOLO_LIFERAY() {
		return _FK_RUOLO_LIFERAY;
	}

	public void setFK_RUOLO_LIFERAY(long FK_RUOLO_LIFERAY) {
		_FK_RUOLO_LIFERAY = FK_RUOLO_LIFERAY;
	}

	private long _ID_RUOLO;

	private String _DESCRIZIONE;

	private long _FK_RUOLO_LIFERAY;

}