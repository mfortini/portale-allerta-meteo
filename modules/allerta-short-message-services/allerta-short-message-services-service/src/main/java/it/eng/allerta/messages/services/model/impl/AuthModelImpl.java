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

package it.eng.allerta.messages.services.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;

import it.eng.allerta.messages.services.model.Auth;
import it.eng.allerta.messages.services.model.AuthModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the Auth service. Represents a row in the &quot;smsService_Auth&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface </code>AuthModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AuthImpl}.
 * </p>
 *
 * @author Giorgianni_F
 * @see AuthImpl
 * @generated
 */
@ProviderType
public class AuthModelImpl extends BaseModelImpl<Auth> implements AuthModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a auth model instance should use the <code>Auth</code> interface instead.
	 */
	public static final String TABLE_NAME = "smsService_Auth";

	public static final Object[][] TABLE_COLUMNS = {
		{"key_", Types.VARCHAR}, {"value", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("key_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("value", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table smsService_Auth (key_ VARCHAR(75) not null primary key,value VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP = "drop table smsService_Auth";

	public static final String ORDER_BY_JPQL = " ORDER BY auth.key ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY smsService_Auth.key_ ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(
		it.eng.allerta.messages.services.service.util.ServiceProps.get(
			"value.object.entity.cache.enabled.it.eng.allerta.messages.services.model.Auth"),
		true);

	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(
		it.eng.allerta.messages.services.service.util.ServiceProps.get(
			"value.object.finder.cache.enabled.it.eng.allerta.messages.services.model.Auth"),
		true);

	public static final boolean COLUMN_BITMASK_ENABLED = false;

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(
		it.eng.allerta.messages.services.service.util.ServiceProps.get(
			"lock.expiration.time.it.eng.allerta.messages.services.model.Auth"));

	public AuthModelImpl() {
	}

	@Override
	public String getPrimaryKey() {
		return _key;
	}

	@Override
	public void setPrimaryKey(String primaryKey) {
		setKey(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _key;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
	}

	@Override
	public Class<?> getModelClass() {
		return Auth.class;
	}

	@Override
	public String getModelClassName() {
		return Auth.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<Auth, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<Auth, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Auth, Object> attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((Auth)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<Auth, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<Auth, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept((Auth)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<Auth, Object>> getAttributeGetterFunctions() {
		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<Auth, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static final Map<String, Function<Auth, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<Auth, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<Auth, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<Auth, Object>>();
		Map<String, BiConsumer<Auth, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<Auth, ?>>();

		attributeGetterFunctions.put(
			"key",
			new Function<Auth, Object>() {

				@Override
				public Object apply(Auth auth) {
					return auth.getKey();
				}

			});
		attributeSetterBiConsumers.put(
			"key",
			new BiConsumer<Auth, Object>() {

				@Override
				public void accept(Auth auth, Object key) {
					auth.setKey((String)key);
				}

			});
		attributeGetterFunctions.put(
			"value",
			new Function<Auth, Object>() {

				@Override
				public Object apply(Auth auth) {
					return auth.getValue();
				}

			});
		attributeSetterBiConsumers.put(
			"value",
			new BiConsumer<Auth, Object>() {

				@Override
				public void accept(Auth auth, Object value) {
					auth.setValue((String)value);
				}

			});

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@Override
	public String getKey() {
		if (_key == null) {
			return "";
		}
		else {
			return _key;
		}
	}

	@Override
	public void setKey(String key) {
		_key = key;
	}

	@Override
	public String getValue() {
		if (_value == null) {
			return "";
		}
		else {
			return _value;
		}
	}

	@Override
	public void setValue(String value) {
		_value = value;
	}

	@Override
	public Auth toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Auth)ProxyUtil.newProxyInstance(
				_classLoader, _escapedModelInterfaces,
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		AuthImpl authImpl = new AuthImpl();

		authImpl.setKey(getKey());
		authImpl.setValue(getValue());

		authImpl.resetOriginalValues();

		return authImpl;
	}

	@Override
	public int compareTo(Auth auth) {
		String primaryKey = auth.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Auth)) {
			return false;
		}

		Auth auth = (Auth)obj;

		String primaryKey = auth.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<Auth> toCacheModel() {
		AuthCacheModel authCacheModel = new AuthCacheModel();

		authCacheModel.key = getKey();

		String key = authCacheModel.key;

		if ((key != null) && (key.length() == 0)) {
			authCacheModel.key = null;
		}

		authCacheModel.value = getValue();

		String value = authCacheModel.value;

		if ((value != null) && (value.length() == 0)) {
			authCacheModel.value = null;
		}

		return authCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<Auth, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<Auth, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Auth, Object> attributeGetterFunction = entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((Auth)this));
			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<Auth, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<Auth, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Auth, Object> attributeGetterFunction = entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((Auth)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = Auth.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
		Auth.class, ModelWrapper.class
	};

	private String _key;
	private String _value;
	private Auth _escapedModel;

}