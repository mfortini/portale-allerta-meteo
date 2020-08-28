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

package it.eng.bollettino.model.impl;

import aQute.bnd.annotation.ProviderType;

import it.eng.bollettino.model.BollettinoIcona;
import it.eng.bollettino.service.BollettinoIconaLocalServiceUtil;

/**
 * The extended model base implementation for the BollettinoIcona service. Represents a row in the &quot;BOLLETTINO_BollettinoIcona&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link BollettinoIconaImpl}.
 * </p>
 *
 * @author GFAVINI
 * @see BollettinoIconaImpl
 * @see BollettinoIcona
 * @generated
 */
@ProviderType
public abstract class BollettinoIconaBaseImpl
	extends BollettinoIconaModelImpl implements BollettinoIcona {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a bollettino icona model instance should use the <code>BollettinoIcona</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			BollettinoIconaLocalServiceUtil.addBollettinoIcona(this);
		}
		else {
			BollettinoIconaLocalServiceUtil.updateBollettinoIcona(this);
		}
	}

}