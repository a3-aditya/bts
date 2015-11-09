package com.a3groups.bts.services.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SchoolService}.
 *
 * @author A3 Groups Inc.
 * @see SchoolService
 * @generated
 */
public class SchoolServiceWrapper implements SchoolService,
    ServiceWrapper<SchoolService> {
    private SchoolService _schoolService;

    public SchoolServiceWrapper(SchoolService schoolService) {
        _schoolService = schoolService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _schoolService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _schoolService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _schoolService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public SchoolService getWrappedSchoolService() {
        return _schoolService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedSchoolService(SchoolService schoolService) {
        _schoolService = schoolService;
    }

    @Override
    public SchoolService getWrappedService() {
        return _schoolService;
    }

    @Override
    public void setWrappedService(SchoolService schoolService) {
        _schoolService = schoolService;
    }
}
