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

import it.eng.bollettino.model.RegolaAllarmeComune;
import it.eng.bollettino.service.RegolaAllarmeComuneLocalServiceUtil;

/**
 * The extended model base implementation for the RegolaAllarmeComune service. Represents a row in the &quot;BOLLETTINO_RegolaAllarmeComune&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link RegolaAllarmeComuneImpl}.
 * </p>
 *
 * @author GFAVINI
 * @see RegolaAllarmeComuneImpl
 * @see RegolaAllarmeComune
 * @generated
 */
@ProviderType
public abstract class RegolaAllarmeComuneBaseImpl
	extends RegolaAllarmeComuneModelImpl implements RegolaAllarmeComune {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a regola allarme comune model instance should use the <code>RegolaAllarmeComune</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			RegolaAllarmeComuneLocalServiceUtil.addRegolaAllarmeComune(this);
		}
		else {
			RegolaAllarmeComuneLocalServiceUtil.updateRegolaAllarmeComune(this);
		}
	}

}