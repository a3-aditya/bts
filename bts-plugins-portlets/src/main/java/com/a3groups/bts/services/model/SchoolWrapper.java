package com.a3groups.bts.services.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link School}.
 * </p>
 *
 * @author A3 Groups Inc.
 * @see School
 * @generated
 */
public class SchoolWrapper implements School, ModelWrapper<School> {
    private School _school;

    public SchoolWrapper(School school) {
        _school = school;
    }

    @Override
    public Class<?> getModelClass() {
        return School.class;
    }

    @Override
    public String getModelClassName() {
        return School.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("name", getName());
        attributes.put("address", getAddress());
        attributes.put("district", getDistrict());
        attributes.put("city", getCity());
        attributes.put("state", getState());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer id = (Integer) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        String address = (String) attributes.get("address");

        if (address != null) {
            setAddress(address);
        }

        String district = (String) attributes.get("district");

        if (district != null) {
            setDistrict(district);
        }

        String city = (String) attributes.get("city");

        if (city != null) {
            setCity(city);
        }

        String state = (String) attributes.get("state");

        if (state != null) {
            setState(state);
        }
    }

    /**
    * Returns the primary key of this school.
    *
    * @return the primary key of this school
    */
    @Override
    public int getPrimaryKey() {
        return _school.getPrimaryKey();
    }

    /**
    * Sets the primary key of this school.
    *
    * @param primaryKey the primary key of this school
    */
    @Override
    public void setPrimaryKey(int primaryKey) {
        _school.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the ID of this school.
    *
    * @return the ID of this school
    */
    @Override
    public int getId() {
        return _school.getId();
    }

    /**
    * Sets the ID of this school.
    *
    * @param id the ID of this school
    */
    @Override
    public void setId(int id) {
        _school.setId(id);
    }

    /**
    * Returns the name of this school.
    *
    * @return the name of this school
    */
    @Override
    public java.lang.String getName() {
        return _school.getName();
    }

    /**
    * Sets the name of this school.
    *
    * @param name the name of this school
    */
    @Override
    public void setName(java.lang.String name) {
        _school.setName(name);
    }

    /**
    * Returns the address of this school.
    *
    * @return the address of this school
    */
    @Override
    public java.lang.String getAddress() {
        return _school.getAddress();
    }

    /**
    * Sets the address of this school.
    *
    * @param address the address of this school
    */
    @Override
    public void setAddress(java.lang.String address) {
        _school.setAddress(address);
    }

    /**
    * Returns the district of this school.
    *
    * @return the district of this school
    */
    @Override
    public java.lang.String getDistrict() {
        return _school.getDistrict();
    }

    /**
    * Sets the district of this school.
    *
    * @param district the district of this school
    */
    @Override
    public void setDistrict(java.lang.String district) {
        _school.setDistrict(district);
    }

    /**
    * Returns the city of this school.
    *
    * @return the city of this school
    */
    @Override
    public java.lang.String getCity() {
        return _school.getCity();
    }

    /**
    * Sets the city of this school.
    *
    * @param city the city of this school
    */
    @Override
    public void setCity(java.lang.String city) {
        _school.setCity(city);
    }

    /**
    * Returns the state of this school.
    *
    * @return the state of this school
    */
    @Override
    public java.lang.String getState() {
        return _school.getState();
    }

    /**
    * Sets the state of this school.
    *
    * @param state the state of this school
    */
    @Override
    public void setState(java.lang.String state) {
        _school.setState(state);
    }

    @Override
    public boolean isNew() {
        return _school.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _school.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _school.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _school.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _school.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _school.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _school.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _school.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _school.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _school.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _school.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new SchoolWrapper((School) _school.clone());
    }

    @Override
    public int compareTo(School school) {
        return _school.compareTo(school);
    }

    @Override
    public int hashCode() {
        return _school.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<School> toCacheModel() {
        return _school.toCacheModel();
    }

    @Override
    public School toEscapedModel() {
        return new SchoolWrapper(_school.toEscapedModel());
    }

    @Override
    public School toUnescapedModel() {
        return new SchoolWrapper(_school.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _school.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _school.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _school.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof SchoolWrapper)) {
            return false;
        }

        SchoolWrapper schoolWrapper = (SchoolWrapper) obj;

        if (Validator.equals(_school, schoolWrapper._school)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public School getWrappedSchool() {
        return _school;
    }

    @Override
    public School getWrappedModel() {
        return _school;
    }

    @Override
    public void resetOriginalValues() {
        _school.resetOriginalValues();
    }
}
