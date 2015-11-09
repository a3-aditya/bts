package com.a3groups.bts.services.model;

import com.a3groups.bts.services.service.ClpSerializer;
import com.a3groups.bts.services.service.SchoolLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class SchoolClp extends BaseModelImpl<School> implements School {
    private int _id;
    private String _name;
    private String _address;
    private String _district;
    private String _city;
    private String _state;
    private BaseModel<?> _schoolRemoteModel;

    public SchoolClp() {
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
    public int getPrimaryKey() {
        return _id;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        setId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Integer) primaryKeyObj).intValue());
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

    @Override
    public int getId() {
        return _id;
    }

    @Override
    public void setId(int id) {
        _id = id;

        if (_schoolRemoteModel != null) {
            try {
                Class<?> clazz = _schoolRemoteModel.getClass();

                Method method = clazz.getMethod("setId", int.class);

                method.invoke(_schoolRemoteModel, id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getName() {
        return _name;
    }

    @Override
    public void setName(String name) {
        _name = name;

        if (_schoolRemoteModel != null) {
            try {
                Class<?> clazz = _schoolRemoteModel.getClass();

                Method method = clazz.getMethod("setName", String.class);

                method.invoke(_schoolRemoteModel, name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getAddress() {
        return _address;
    }

    @Override
    public void setAddress(String address) {
        _address = address;

        if (_schoolRemoteModel != null) {
            try {
                Class<?> clazz = _schoolRemoteModel.getClass();

                Method method = clazz.getMethod("setAddress", String.class);

                method.invoke(_schoolRemoteModel, address);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDistrict() {
        return _district;
    }

    @Override
    public void setDistrict(String district) {
        _district = district;

        if (_schoolRemoteModel != null) {
            try {
                Class<?> clazz = _schoolRemoteModel.getClass();

                Method method = clazz.getMethod("setDistrict", String.class);

                method.invoke(_schoolRemoteModel, district);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getCity() {
        return _city;
    }

    @Override
    public void setCity(String city) {
        _city = city;

        if (_schoolRemoteModel != null) {
            try {
                Class<?> clazz = _schoolRemoteModel.getClass();

                Method method = clazz.getMethod("setCity", String.class);

                method.invoke(_schoolRemoteModel, city);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getState() {
        return _state;
    }

    @Override
    public void setState(String state) {
        _state = state;

        if (_schoolRemoteModel != null) {
            try {
                Class<?> clazz = _schoolRemoteModel.getClass();

                Method method = clazz.getMethod("setState", String.class);

                method.invoke(_schoolRemoteModel, state);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getSchoolRemoteModel() {
        return _schoolRemoteModel;
    }

    public void setSchoolRemoteModel(BaseModel<?> schoolRemoteModel) {
        _schoolRemoteModel = schoolRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _schoolRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_schoolRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            SchoolLocalServiceUtil.addSchool(this);
        } else {
            SchoolLocalServiceUtil.updateSchool(this);
        }
    }

    @Override
    public School toEscapedModel() {
        return (School) ProxyUtil.newProxyInstance(School.class.getClassLoader(),
            new Class[] { School.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        SchoolClp clone = new SchoolClp();

        clone.setId(getId());
        clone.setName(getName());
        clone.setAddress(getAddress());
        clone.setDistrict(getDistrict());
        clone.setCity(getCity());
        clone.setState(getState());

        return clone;
    }

    @Override
    public int compareTo(School school) {
        int primaryKey = school.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof SchoolClp)) {
            return false;
        }

        SchoolClp school = (SchoolClp) obj;

        int primaryKey = school.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(13);

        sb.append("{id=");
        sb.append(getId());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", address=");
        sb.append(getAddress());
        sb.append(", district=");
        sb.append(getDistrict());
        sb.append(", city=");
        sb.append(getCity());
        sb.append(", state=");
        sb.append(getState());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(22);

        sb.append("<model><model-name>");
        sb.append("com.a3groups.bts.services.model.School");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>address</column-name><column-value><![CDATA[");
        sb.append(getAddress());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>district</column-name><column-value><![CDATA[");
        sb.append(getDistrict());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>city</column-name><column-value><![CDATA[");
        sb.append(getCity());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>state</column-name><column-value><![CDATA[");
        sb.append(getState());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
