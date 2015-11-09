package com.a3groups.bts.services.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.a3groups.bts.services.service.http.SchoolServiceSoap}.
 *
 * @author A3 Groups Inc.
 * @see com.a3groups.bts.services.service.http.SchoolServiceSoap
 * @generated
 */
public class SchoolSoap implements Serializable {
    private int _id;
    private String _name;
    private String _address;
    private String _district;
    private String _city;
    private String _state;

    public SchoolSoap() {
    }

    public static SchoolSoap toSoapModel(School model) {
        SchoolSoap soapModel = new SchoolSoap();

        soapModel.setId(model.getId());
        soapModel.setName(model.getName());
        soapModel.setAddress(model.getAddress());
        soapModel.setDistrict(model.getDistrict());
        soapModel.setCity(model.getCity());
        soapModel.setState(model.getState());

        return soapModel;
    }

    public static SchoolSoap[] toSoapModels(School[] models) {
        SchoolSoap[] soapModels = new SchoolSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static SchoolSoap[][] toSoapModels(School[][] models) {
        SchoolSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new SchoolSoap[models.length][models[0].length];
        } else {
            soapModels = new SchoolSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static SchoolSoap[] toSoapModels(List<School> models) {
        List<SchoolSoap> soapModels = new ArrayList<SchoolSoap>(models.size());

        for (School model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new SchoolSoap[soapModels.size()]);
    }

    public int getPrimaryKey() {
        return _id;
    }

    public void setPrimaryKey(int pk) {
        setId(pk);
    }

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        _id = id;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getAddress() {
        return _address;
    }

    public void setAddress(String address) {
        _address = address;
    }

    public String getDistrict() {
        return _district;
    }

    public void setDistrict(String district) {
        _district = district;
    }

    public String getCity() {
        return _city;
    }

    public void setCity(String city) {
        _city = city;
    }

    public String getState() {
        return _state;
    }

    public void setState(String state) {
        _state = state;
    }
}
