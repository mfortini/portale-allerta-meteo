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

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;

import it.eng.bollettino.model.Bollettino;
import it.eng.bollettino.model.BollettinoModel;
import it.eng.bollettino.model.BollettinoSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the Bollettino service. Represents a row in the &quot;BOLLETTINO_Bollettino&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface </code>BollettinoModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link BollettinoImpl}.
 * </p>
 *
 * @author GFAVINI
 * @see BollettinoImpl
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class BollettinoModelImpl
	extends BaseModelImpl<Bollettino> implements BollettinoModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a bollettino model instance should use the <code>Bollettino</code> interface instead.
	 */
	public static final String TABLE_NAME = "BOLLETTINO_Bollettino";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"bollettinoId", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"stato", Types.INTEGER}, {"idApprovatore", Types.BIGINT},
		{"dataApprovazione", Types.TIMESTAMP}, {"numero", Types.VARCHAR},
		{"progressivo", Types.INTEGER}, {"anno", Types.INTEGER},
		{"dataEmissione", Types.TIMESTAMP}, {"dataInizio", Types.TIMESTAMP},
		{"dataFine", Types.TIMESTAMP}, {"noteMeteo", Types.VARCHAR},
		{"stringaMeteo", Types.VARCHAR}, {"link", Types.VARCHAR},
		{"ultimo", Types.BOOLEAN}, {"hash", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("bollettinoId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("stato", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("idApprovatore", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("dataApprovazione", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("numero", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("progressivo", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("anno", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("dataEmissione", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("dataInizio", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("dataFine", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("noteMeteo", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("stringaMeteo", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("link", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("ultimo", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("hash", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table BOLLETTINO_Bollettino (uuid_ VARCHAR(75) null,bollettinoId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,stato INTEGER,idApprovatore LONG,dataApprovazione DATE null,numero VARCHAR(75) null,progressivo INTEGER,anno INTEGER,dataEmissione DATE null,dataInizio DATE null,dataFine DATE null,noteMeteo TEXT null,stringaMeteo TEXT null,link VARCHAR(256) null,ultimo BOOLEAN,hash VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP =
		"drop table BOLLETTINO_Bollettino";

	public static final String ORDER_BY_JPQL =
		" ORDER BY bollettino.numero ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY BOLLETTINO_Bollettino.numero ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(
		allerta.bollettino.service.util.ServiceProps.get(
			"value.object.entity.cache.enabled.it.eng.bollettino.model.Bollettino"),
		true);

	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(
		allerta.bollettino.service.util.ServiceProps.get(
			"value.object.finder.cache.enabled.it.eng.bollettino.model.Bollettino"),
		true);

	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(
		allerta.bollettino.service.util.ServiceProps.get(
			"value.object.column.bitmask.enabled.it.eng.bollettino.model.Bollettino"),
		true);

	public static final long COMPANYID_COLUMN_BITMASK = 1L;

	public static final long GROUPID_COLUMN_BITMASK = 2L;

	public static final long NUMERO_COLUMN_BITMASK = 4L;

	public static final long UUID_COLUMN_BITMASK = 8L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Bollettino toModel(BollettinoSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Bollettino model = new BollettinoImpl();

		model.setUuid(soapModel.getUuid());
		model.setBollettinoId(soapModel.getBollettinoId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setStato(soapModel.getStato());
		model.setIdApprovatore(soapModel.getIdApprovatore());
		model.setDataApprovazione(soapModel.getDataApprovazione());
		model.setNumero(soapModel.getNumero());
		model.setProgressivo(soapModel.getProgressivo());
		model.setAnno(soapModel.getAnno());
		model.setDataEmissione(soapModel.getDataEmissione());
		model.setDataInizio(soapModel.getDataInizio());
		model.setDataFine(soapModel.getDataFine());
		model.setNoteMeteo(soapModel.getNoteMeteo());
		model.setStringaMeteo(soapModel.getStringaMeteo());
		model.setLink(soapModel.getLink());
		model.setUltimo(soapModel.isUltimo());
		model.setHash(soapModel.getHash());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Bollettino> toModels(BollettinoSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Bollettino> models = new ArrayList<Bollettino>(soapModels.length);

		for (BollettinoSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(
		allerta.bollettino.service.util.ServiceProps.get(
			"lock.expiration.time.it.eng.bollettino.model.Bollettino"));

	public BollettinoModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _bollettinoId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setBollettinoId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _bollettinoId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Bollettino.class;
	}

	@Override
	public String getModelClassName() {
		return Bollettino.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<Bollettino, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<Bollettino, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Bollettino, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((Bollettino)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<Bollettino, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<Bollettino, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(Bollettino)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<Bollettino, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<Bollettino, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static final Map<String, Function<Bollettino, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<Bollettino, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<Bollettino, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<Bollettino, Object>>();
		Map<String, BiConsumer<Bollettino, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<Bollettino, ?>>();

		attributeGetterFunctions.put(
			"uuid",
			new Function<Bollettino, Object>() {

				@Override
				public Object apply(Bollettino bollettino) {
					return bollettino.getUuid();
				}

			});
		attributeSetterBiConsumers.put(
			"uuid",
			new BiConsumer<Bollettino, Object>() {

				@Override
				public void accept(Bollettino bollettino, Object uuid) {
					bollettino.setUuid((String)uuid);
				}

			});
		attributeGetterFunctions.put(
			"bollettinoId",
			new Function<Bollettino, Object>() {

				@Override
				public Object apply(Bollettino bollettino) {
					return bollettino.getBollettinoId();
				}

			});
		attributeSetterBiConsumers.put(
			"bollettinoId",
			new BiConsumer<Bollettino, Object>() {

				@Override
				public void accept(Bollettino bollettino, Object bollettinoId) {
					bollettino.setBollettinoId((Long)bollettinoId);
				}

			});
		attributeGetterFunctions.put(
			"groupId",
			new Function<Bollettino, Object>() {

				@Override
				public Object apply(Bollettino bollettino) {
					return bollettino.getGroupId();
				}

			});
		attributeSetterBiConsumers.put(
			"groupId",
			new BiConsumer<Bollettino, Object>() {

				@Override
				public void accept(Bollettino bollettino, Object groupId) {
					bollettino.setGroupId((Long)groupId);
				}

			});
		attributeGetterFunctions.put(
			"companyId",
			new Function<Bollettino, Object>() {

				@Override
				public Object apply(Bollettino bollettino) {
					return bollettino.getCompanyId();
				}

			});
		attributeSetterBiConsumers.put(
			"companyId",
			new BiConsumer<Bollettino, Object>() {

				@Override
				public void accept(Bollettino bollettino, Object companyId) {
					bollettino.setCompanyId((Long)companyId);
				}

			});
		attributeGetterFunctions.put(
			"userId",
			new Function<Bollettino, Object>() {

				@Override
				public Object apply(Bollettino bollettino) {
					return bollettino.getUserId();
				}

			});
		attributeSetterBiConsumers.put(
			"userId",
			new BiConsumer<Bollettino, Object>() {

				@Override
				public void accept(Bollettino bollettino, Object userId) {
					bollettino.setUserId((Long)userId);
				}

			});
		attributeGetterFunctions.put(
			"userName",
			new Function<Bollettino, Object>() {

				@Override
				public Object apply(Bollettino bollettino) {
					return bollettino.getUserName();
				}

			});
		attributeSetterBiConsumers.put(
			"userName",
			new BiConsumer<Bollettino, Object>() {

				@Override
				public void accept(Bollettino bollettino, Object userName) {
					bollettino.setUserName((String)userName);
				}

			});
		attributeGetterFunctions.put(
			"createDate",
			new Function<Bollettino, Object>() {

				@Override
				public Object apply(Bollettino bollettino) {
					return bollettino.getCreateDate();
				}

			});
		attributeSetterBiConsumers.put(
			"createDate",
			new BiConsumer<Bollettino, Object>() {

				@Override
				public void accept(Bollettino bollettino, Object createDate) {
					bollettino.setCreateDate((Date)createDate);
				}

			});
		attributeGetterFunctions.put(
			"modifiedDate",
			new Function<Bollettino, Object>() {

				@Override
				public Object apply(Bollettino bollettino) {
					return bollettino.getModifiedDate();
				}

			});
		attributeSetterBiConsumers.put(
			"modifiedDate",
			new BiConsumer<Bollettino, Object>() {

				@Override
				public void accept(Bollettino bollettino, Object modifiedDate) {
					bollettino.setModifiedDate((Date)modifiedDate);
				}

			});
		attributeGetterFunctions.put(
			"stato",
			new Function<Bollettino, Object>() {

				@Override
				public Object apply(Bollettino bollettino) {
					return bollettino.getStato();
				}

			});
		attributeSetterBiConsumers.put(
			"stato",
			new BiConsumer<Bollettino, Object>() {

				@Override
				public void accept(Bollettino bollettino, Object stato) {
					bollettino.setStato((Integer)stato);
				}

			});
		attributeGetterFunctions.put(
			"idApprovatore",
			new Function<Bollettino, Object>() {

				@Override
				public Object apply(Bollettino bollettino) {
					return bollettino.getIdApprovatore();
				}

			});
		attributeSetterBiConsumers.put(
			"idApprovatore",
			new BiConsumer<Bollettino, Object>() {

				@Override
				public void accept(
					Bollettino bollettino, Object idApprovatore) {

					bollettino.setIdApprovatore((Long)idApprovatore);
				}

			});
		attributeGetterFunctions.put(
			"dataApprovazione",
			new Function<Bollettino, Object>() {

				@Override
				public Object apply(Bollettino bollettino) {
					return bollettino.getDataApprovazione();
				}

			});
		attributeSetterBiConsumers.put(
			"dataApprovazione",
			new BiConsumer<Bollettino, Object>() {

				@Override
				public void accept(
					Bollettino bollettino, Object dataApprovazione) {

					bollettino.setDataApprovazione((Date)dataApprovazione);
				}

			});
		attributeGetterFunctions.put(
			"numero",
			new Function<Bollettino, Object>() {

				@Override
				public Object apply(Bollettino bollettino) {
					return bollettino.getNumero();
				}

			});
		attributeSetterBiConsumers.put(
			"numero",
			new BiConsumer<Bollettino, Object>() {

				@Override
				public void accept(Bollettino bollettino, Object numero) {
					bollettino.setNumero((String)numero);
				}

			});
		attributeGetterFunctions.put(
			"progressivo",
			new Function<Bollettino, Object>() {

				@Override
				public Object apply(Bollettino bollettino) {
					return bollettino.getProgressivo();
				}

			});
		attributeSetterBiConsumers.put(
			"progressivo",
			new BiConsumer<Bollettino, Object>() {

				@Override
				public void accept(Bollettino bollettino, Object progressivo) {
					bollettino.setProgressivo((Integer)progressivo);
				}

			});
		attributeGetterFunctions.put(
			"anno",
			new Function<Bollettino, Object>() {

				@Override
				public Object apply(Bollettino bollettino) {
					return bollettino.getAnno();
				}

			});
		attributeSetterBiConsumers.put(
			"anno",
			new BiConsumer<Bollettino, Object>() {

				@Override
				public void accept(Bollettino bollettino, Object anno) {
					bollettino.setAnno((Integer)anno);
				}

			});
		attributeGetterFunctions.put(
			"dataEmissione",
			new Function<Bollettino, Object>() {

				@Override
				public Object apply(Bollettino bollettino) {
					return bollettino.getDataEmissione();
				}

			});
		attributeSetterBiConsumers.put(
			"dataEmissione",
			new BiConsumer<Bollettino, Object>() {

				@Override
				public void accept(
					Bollettino bollettino, Object dataEmissione) {

					bollettino.setDataEmissione((Date)dataEmissione);
				}

			});
		attributeGetterFunctions.put(
			"dataInizio",
			new Function<Bollettino, Object>() {

				@Override
				public Object apply(Bollettino bollettino) {
					return bollettino.getDataInizio();
				}

			});
		attributeSetterBiConsumers.put(
			"dataInizio",
			new BiConsumer<Bollettino, Object>() {

				@Override
				public void accept(Bollettino bollettino, Object dataInizio) {
					bollettino.setDataInizio((Date)dataInizio);
				}

			});
		attributeGetterFunctions.put(
			"dataFine",
			new Function<Bollettino, Object>() {

				@Override
				public Object apply(Bollettino bollettino) {
					return bollettino.getDataFine();
				}

			});
		attributeSetterBiConsumers.put(
			"dataFine",
			new BiConsumer<Bollettino, Object>() {

				@Override
				public void accept(Bollettino bollettino, Object dataFine) {
					bollettino.setDataFine((Date)dataFine);
				}

			});
		attributeGetterFunctions.put(
			"noteMeteo",
			new Function<Bollettino, Object>() {

				@Override
				public Object apply(Bollettino bollettino) {
					return bollettino.getNoteMeteo();
				}

			});
		attributeSetterBiConsumers.put(
			"noteMeteo",
			new BiConsumer<Bollettino, Object>() {

				@Override
				public void accept(Bollettino bollettino, Object noteMeteo) {
					bollettino.setNoteMeteo((String)noteMeteo);
				}

			});
		attributeGetterFunctions.put(
			"stringaMeteo",
			new Function<Bollettino, Object>() {

				@Override
				public Object apply(Bollettino bollettino) {
					return bollettino.getStringaMeteo();
				}

			});
		attributeSetterBiConsumers.put(
			"stringaMeteo",
			new BiConsumer<Bollettino, Object>() {

				@Override
				public void accept(Bollettino bollettino, Object stringaMeteo) {
					bollettino.setStringaMeteo((String)stringaMeteo);
				}

			});
		attributeGetterFunctions.put(
			"link",
			new Function<Bollettino, Object>() {

				@Override
				public Object apply(Bollettino bollettino) {
					return bollettino.getLink();
				}

			});
		attributeSetterBiConsumers.put(
			"link",
			new BiConsumer<Bollettino, Object>() {

				@Override
				public void accept(Bollettino bollettino, Object link) {
					bollettino.setLink((String)link);
				}

			});
		attributeGetterFunctions.put(
			"ultimo",
			new Function<Bollettino, Object>() {

				@Override
				public Object apply(Bollettino bollettino) {
					return bollettino.getUltimo();
				}

			});
		attributeSetterBiConsumers.put(
			"ultimo",
			new BiConsumer<Bollettino, Object>() {

				@Override
				public void accept(Bollettino bollettino, Object ultimo) {
					bollettino.setUltimo((Boolean)ultimo);
				}

			});
		attributeGetterFunctions.put(
			"hash",
			new Function<Bollettino, Object>() {

				@Override
				public Object apply(Bollettino bollettino) {
					return bollettino.getHash();
				}

			});
		attributeSetterBiConsumers.put(
			"hash",
			new BiConsumer<Bollettino, Object>() {

				@Override
				public void accept(Bollettino bollettino, Object hash) {
					bollettino.setHash((String)hash);
				}

			});

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		_columnBitmask |= UUID_COLUMN_BITMASK;

		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@JSON
	@Override
	public long getBollettinoId() {
		return _bollettinoId;
	}

	@Override
	public void setBollettinoId(long bollettinoId) {
		_bollettinoId = bollettinoId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return "";
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public int getStato() {
		return _stato;
	}

	@Override
	public void setStato(int stato) {
		_stato = stato;
	}

	@JSON
	@Override
	public long getIdApprovatore() {
		return _idApprovatore;
	}

	@Override
	public void setIdApprovatore(long idApprovatore) {
		_idApprovatore = idApprovatore;
	}

	@JSON
	@Override
	public Date getDataApprovazione() {
		return _dataApprovazione;
	}

	@Override
	public void setDataApprovazione(Date dataApprovazione) {
		_dataApprovazione = dataApprovazione;
	}

	@JSON
	@Override
	public String getNumero() {
		if (_numero == null) {
			return "";
		}
		else {
			return _numero;
		}
	}

	@Override
	public void setNumero(String numero) {
		_columnBitmask = -1L;

		if (_originalNumero == null) {
			_originalNumero = _numero;
		}

		_numero = numero;
	}

	public String getOriginalNumero() {
		return GetterUtil.getString(_originalNumero);
	}

	@JSON
	@Override
	public int getProgressivo() {
		return _progressivo;
	}

	@Override
	public void setProgressivo(int progressivo) {
		_progressivo = progressivo;
	}

	@JSON
	@Override
	public int getAnno() {
		return _anno;
	}

	@Override
	public void setAnno(int anno) {
		_anno = anno;
	}

	@JSON
	@Override
	public Date getDataEmissione() {
		return _dataEmissione;
	}

	@Override
	public void setDataEmissione(Date dataEmissione) {
		_dataEmissione = dataEmissione;
	}

	@JSON
	@Override
	public Date getDataInizio() {
		return _dataInizio;
	}

	@Override
	public void setDataInizio(Date dataInizio) {
		_dataInizio = dataInizio;
	}

	@JSON
	@Override
	public Date getDataFine() {
		return _dataFine;
	}

	@Override
	public void setDataFine(Date dataFine) {
		_dataFine = dataFine;
	}

	@JSON
	@Override
	public String getNoteMeteo() {
		if (_noteMeteo == null) {
			return "";
		}
		else {
			return _noteMeteo;
		}
	}

	@Override
	public void setNoteMeteo(String noteMeteo) {
		_noteMeteo = noteMeteo;
	}

	@JSON
	@Override
	public String getStringaMeteo() {
		if (_stringaMeteo == null) {
			return "";
		}
		else {
			return _stringaMeteo;
		}
	}

	@Override
	public void setStringaMeteo(String stringaMeteo) {
		_stringaMeteo = stringaMeteo;
	}

	@JSON
	@Override
	public String getLink() {
		if (_link == null) {
			return "";
		}
		else {
			return _link;
		}
	}

	@Override
	public void setLink(String link) {
		_link = link;
	}

	@JSON
	@Override
	public boolean getUltimo() {
		return _ultimo;
	}

	@JSON
	@Override
	public boolean isUltimo() {
		return _ultimo;
	}

	@Override
	public void setUltimo(boolean ultimo) {
		_ultimo = ultimo;
	}

	@JSON
	@Override
	public String getHash() {
		if (_hash == null) {
			return "";
		}
		else {
			return _hash;
		}
	}

	@Override
	public void setHash(String hash) {
		_hash = hash;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(
			PortalUtil.getClassNameId(Bollettino.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(), Bollettino.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Bollettino toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Bollettino)ProxyUtil.newProxyInstance(
				_classLoader, _escapedModelInterfaces,
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		BollettinoImpl bollettinoImpl = new BollettinoImpl();

		bollettinoImpl.setUuid(getUuid());
		bollettinoImpl.setBollettinoId(getBollettinoId());
		bollettinoImpl.setGroupId(getGroupId());
		bollettinoImpl.setCompanyId(getCompanyId());
		bollettinoImpl.setUserId(getUserId());
		bollettinoImpl.setUserName(getUserName());
		bollettinoImpl.setCreateDate(getCreateDate());
		bollettinoImpl.setModifiedDate(getModifiedDate());
		bollettinoImpl.setStato(getStato());
		bollettinoImpl.setIdApprovatore(getIdApprovatore());
		bollettinoImpl.setDataApprovazione(getDataApprovazione());
		bollettinoImpl.setNumero(getNumero());
		bollettinoImpl.setProgressivo(getProgressivo());
		bollettinoImpl.setAnno(getAnno());
		bollettinoImpl.setDataEmissione(getDataEmissione());
		bollettinoImpl.setDataInizio(getDataInizio());
		bollettinoImpl.setDataFine(getDataFine());
		bollettinoImpl.setNoteMeteo(getNoteMeteo());
		bollettinoImpl.setStringaMeteo(getStringaMeteo());
		bollettinoImpl.setLink(getLink());
		bollettinoImpl.setUltimo(isUltimo());
		bollettinoImpl.setHash(getHash());

		bollettinoImpl.resetOriginalValues();

		return bollettinoImpl;
	}

	@Override
	public int compareTo(Bollettino bollettino) {
		int value = 0;

		value = getNumero().compareTo(bollettino.getNumero());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Bollettino)) {
			return false;
		}

		Bollettino bollettino = (Bollettino)obj;

		long primaryKey = bollettino.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
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
		BollettinoModelImpl bollettinoModelImpl = this;

		bollettinoModelImpl._originalUuid = bollettinoModelImpl._uuid;

		bollettinoModelImpl._originalGroupId = bollettinoModelImpl._groupId;

		bollettinoModelImpl._setOriginalGroupId = false;

		bollettinoModelImpl._originalCompanyId = bollettinoModelImpl._companyId;

		bollettinoModelImpl._setOriginalCompanyId = false;

		bollettinoModelImpl._setModifiedDate = false;

		bollettinoModelImpl._originalNumero = bollettinoModelImpl._numero;

		bollettinoModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Bollettino> toCacheModel() {
		BollettinoCacheModel bollettinoCacheModel = new BollettinoCacheModel();

		bollettinoCacheModel.uuid = getUuid();

		String uuid = bollettinoCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			bollettinoCacheModel.uuid = null;
		}

		bollettinoCacheModel.bollettinoId = getBollettinoId();

		bollettinoCacheModel.groupId = getGroupId();

		bollettinoCacheModel.companyId = getCompanyId();

		bollettinoCacheModel.userId = getUserId();

		bollettinoCacheModel.userName = getUserName();

		String userName = bollettinoCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			bollettinoCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			bollettinoCacheModel.createDate = createDate.getTime();
		}
		else {
			bollettinoCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			bollettinoCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			bollettinoCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		bollettinoCacheModel.stato = getStato();

		bollettinoCacheModel.idApprovatore = getIdApprovatore();

		Date dataApprovazione = getDataApprovazione();

		if (dataApprovazione != null) {
			bollettinoCacheModel.dataApprovazione = dataApprovazione.getTime();
		}
		else {
			bollettinoCacheModel.dataApprovazione = Long.MIN_VALUE;
		}

		bollettinoCacheModel.numero = getNumero();

		String numero = bollettinoCacheModel.numero;

		if ((numero != null) && (numero.length() == 0)) {
			bollettinoCacheModel.numero = null;
		}

		bollettinoCacheModel.progressivo = getProgressivo();

		bollettinoCacheModel.anno = getAnno();

		Date dataEmissione = getDataEmissione();

		if (dataEmissione != null) {
			bollettinoCacheModel.dataEmissione = dataEmissione.getTime();
		}
		else {
			bollettinoCacheModel.dataEmissione = Long.MIN_VALUE;
		}

		Date dataInizio = getDataInizio();

		if (dataInizio != null) {
			bollettinoCacheModel.dataInizio = dataInizio.getTime();
		}
		else {
			bollettinoCacheModel.dataInizio = Long.MIN_VALUE;
		}

		Date dataFine = getDataFine();

		if (dataFine != null) {
			bollettinoCacheModel.dataFine = dataFine.getTime();
		}
		else {
			bollettinoCacheModel.dataFine = Long.MIN_VALUE;
		}

		bollettinoCacheModel.noteMeteo = getNoteMeteo();

		String noteMeteo = bollettinoCacheModel.noteMeteo;

		if ((noteMeteo != null) && (noteMeteo.length() == 0)) {
			bollettinoCacheModel.noteMeteo = null;
		}

		bollettinoCacheModel.stringaMeteo = getStringaMeteo();

		String stringaMeteo = bollettinoCacheModel.stringaMeteo;

		if ((stringaMeteo != null) && (stringaMeteo.length() == 0)) {
			bollettinoCacheModel.stringaMeteo = null;
		}

		bollettinoCacheModel.link = getLink();

		String link = bollettinoCacheModel.link;

		if ((link != null) && (link.length() == 0)) {
			bollettinoCacheModel.link = null;
		}

		bollettinoCacheModel.ultimo = isUltimo();

		bollettinoCacheModel.hash = getHash();

		String hash = bollettinoCacheModel.hash;

		if ((hash != null) && (hash.length() == 0)) {
			bollettinoCacheModel.hash = null;
		}

		return bollettinoCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<Bollettino, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<Bollettino, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Bollettino, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((Bollettino)this));
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
		Map<String, Function<Bollettino, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<Bollettino, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Bollettino, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((Bollettino)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader =
		Bollettino.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
		Bollettino.class, ModelWrapper.class
	};

	private String _uuid;
	private String _originalUuid;
	private long _bollettinoId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private int _stato;
	private long _idApprovatore;
	private Date _dataApprovazione;
	private String _numero;
	private String _originalNumero;
	private int _progressivo;
	private int _anno;
	private Date _dataEmissione;
	private Date _dataInizio;
	private Date _dataFine;
	private String _noteMeteo;
	private String _stringaMeteo;
	private String _link;
	private boolean _ultimo;
	private String _hash;
	private long _columnBitmask;
	private Bollettino _escapedModel;

}