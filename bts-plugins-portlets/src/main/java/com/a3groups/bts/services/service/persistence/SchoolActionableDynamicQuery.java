package com.a3groups.bts.services.service.persistence;

import com.a3groups.bts.services.model.School;
import com.a3groups.bts.services.service.SchoolLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author A3 Groups Inc.
 * @generated
 */
public abstract class SchoolActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public SchoolActionableDynamicQuery() throws SystemException {
        setBaseLocalService(SchoolLocalServiceUtil.getService());
        setClass(School.class);

        setClassLoader(com.a3groups.bts.services.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("id");
    }
}
