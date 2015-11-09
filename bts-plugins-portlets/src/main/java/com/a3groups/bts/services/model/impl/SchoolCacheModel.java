package com.a3groups.bts.services.model.impl;

import com.a3groups.bts.services.model.School;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing School in entity cache.
 *
 * @author A3 Groups Inc.
 * @see School
 * @generated
 */
public class SchoolCacheModel implements CacheModel<School>, Externalizable {
    public int id;
    public String name;
    public String address;
    public String district;
    public String city;
    public String state;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(13);

        sb.append("{id=");
        sb.append(id);
        sb.append(", name=");
        sb.append(name);
        sb.append(", address=");
        sb.append(address);
        sb.append(", district=");
        sb.append(district);
        sb.append(", city=");
        sb.append(city);
        sb.append(", state=");
        sb.append(state);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public School toEntityModel() {
        SchoolImpl schoolImpl = new SchoolImpl();

        schoolImpl.setId(id);

        if (name == null) {
            schoolImpl.setName(StringPool.BLANK);
        } else {
            schoolImpl.setName(name);
        }

        if (address == null) {
            schoolImpl.setAddress(StringPool.BLANK);
        } else {
            schoolImpl.setAddress(address);
        }

        if (district == null) {
            schoolImpl.setDistrict(StringPool.BLANK);
        } else {
            schoolImpl.setDistrict(district);
        }

        if (city == null) {
            schoolImpl.setCity(StringPool.BLANK);
        } else {
            schoolImpl.setCity(city);
        }

        if (state == null) {
            schoolImpl.setState(StringPool.BLANK);
        } else {
            schoolImpl.setState(state);
        }

        schoolImpl.resetOriginalValues();

        return schoolImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        id = objectInput.readInt();
        name = objectInput.readUTF();
        address = objectInput.readUTF();
        district = objectInput.readUTF();
        city = objectInput.readUTF();
        state = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(id);

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }

        if (address == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(address);
        }

        if (district == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(district);
        }

        if (city == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(city);
        }

        if (state == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(state);
        }
    }
}
