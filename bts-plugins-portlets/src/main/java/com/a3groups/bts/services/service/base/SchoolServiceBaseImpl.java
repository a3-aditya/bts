package com.a3groups.bts.services.service.base;

import com.a3groups.bts.services.model.School;
import com.a3groups.bts.services.service.SchoolService;
import com.a3groups.bts.services.service.persistence.SchoolPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the school remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.a3groups.bts.services.service.impl.SchoolServiceImpl}.
 * </p>
 *
 * @author A3 Groups Inc.
 * @see com.a3groups.bts.services.service.impl.SchoolServiceImpl
 * @see com.a3groups.bts.services.service.SchoolServiceUtil
 * @generated
 */
public abstract class SchoolServiceBaseImpl extends BaseServiceImpl
    implements SchoolService, IdentifiableBean {
    @BeanReference(type = com.a3groups.bts.services.service.SchoolLocalService.class)
    protected com.a3groups.bts.services.service.SchoolLocalService schoolLocalService;
    @BeanReference(type = com.a3groups.bts.services.service.SchoolService.class)
    protected com.a3groups.bts.services.service.SchoolService schoolService;
    @BeanReference(type = SchoolPersistence.class)
    protected SchoolPersistence schoolPersistence;
    @BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
    protected com.liferay.counter.service.CounterLocalService counterLocalService;
    @BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
    protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
    @BeanReference(type = com.liferay.portal.service.UserLocalService.class)
    protected com.liferay.portal.service.UserLocalService userLocalService;
    @BeanReference(type = com.liferay.portal.service.UserService.class)
    protected com.liferay.portal.service.UserService userService;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;
    private String _beanIdentifier;
    private ClassLoader _classLoader;
    private SchoolServiceClpInvoker _clpInvoker = new SchoolServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link com.a3groups.bts.services.service.SchoolServiceUtil} to access the school remote service.
     */

    /**
     * Returns the school local service.
     *
     * @return the school local service
     */
    public com.a3groups.bts.services.service.SchoolLocalService getSchoolLocalService() {
        return schoolLocalService;
    }

    /**
     * Sets the school local service.
     *
     * @param schoolLocalService the school local service
     */
    public void setSchoolLocalService(
        com.a3groups.bts.services.service.SchoolLocalService schoolLocalService) {
        this.schoolLocalService = schoolLocalService;
    }

    /**
     * Returns the school remote service.
     *
     * @return the school remote service
     */
    public com.a3groups.bts.services.service.SchoolService getSchoolService() {
        return schoolService;
    }

    /**
     * Sets the school remote service.
     *
     * @param schoolService the school remote service
     */
    public void setSchoolService(
        com.a3groups.bts.services.service.SchoolService schoolService) {
        this.schoolService = schoolService;
    }

    /**
     * Returns the school persistence.
     *
     * @return the school persistence
     */
    public SchoolPersistence getSchoolPersistence() {
        return schoolPersistence;
    }

    /**
     * Sets the school persistence.
     *
     * @param schoolPersistence the school persistence
     */
    public void setSchoolPersistence(SchoolPersistence schoolPersistence) {
        this.schoolPersistence = schoolPersistence;
    }

    /**
     * Returns the counter local service.
     *
     * @return the counter local service
     */
    public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
        return counterLocalService;
    }

    /**
     * Sets the counter local service.
     *
     * @param counterLocalService the counter local service
     */
    public void setCounterLocalService(
        com.liferay.counter.service.CounterLocalService counterLocalService) {
        this.counterLocalService = counterLocalService;
    }

    /**
     * Returns the resource local service.
     *
     * @return the resource local service
     */
    public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
        return resourceLocalService;
    }

    /**
     * Sets the resource local service.
     *
     * @param resourceLocalService the resource local service
     */
    public void setResourceLocalService(
        com.liferay.portal.service.ResourceLocalService resourceLocalService) {
        this.resourceLocalService = resourceLocalService;
    }

    /**
     * Returns the user local service.
     *
     * @return the user local service
     */
    public com.liferay.portal.service.UserLocalService getUserLocalService() {
        return userLocalService;
    }

    /**
     * Sets the user local service.
     *
     * @param userLocalService the user local service
     */
    public void setUserLocalService(
        com.liferay.portal.service.UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }

    /**
     * Returns the user remote service.
     *
     * @return the user remote service
     */
    public com.liferay.portal.service.UserService getUserService() {
        return userService;
    }

    /**
     * Sets the user remote service.
     *
     * @param userService the user remote service
     */
    public void setUserService(
        com.liferay.portal.service.UserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the user persistence.
     *
     * @return the user persistence
     */
    public UserPersistence getUserPersistence() {
        return userPersistence;
    }

    /**
     * Sets the user persistence.
     *
     * @param userPersistence the user persistence
     */
    public void setUserPersistence(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    public void afterPropertiesSet() {
        Class<?> clazz = getClass();

        _classLoader = clazz.getClassLoader();
    }

    public void destroy() {
    }

    /**
     * Returns the Spring bean ID for this bean.
     *
     * @return the Spring bean ID for this bean
     */
    @Override
    public String getBeanIdentifier() {
        return _beanIdentifier;
    }

    /**
     * Sets the Spring bean ID for this bean.
     *
     * @param beanIdentifier the Spring bean ID for this bean
     */
    @Override
    public void setBeanIdentifier(String beanIdentifier) {
        _beanIdentifier = beanIdentifier;
    }

    @Override
    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        Thread currentThread = Thread.currentThread();

        ClassLoader contextClassLoader = currentThread.getContextClassLoader();

        if (contextClassLoader != _classLoader) {
            currentThread.setContextClassLoader(_classLoader);
        }

        try {
            return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
        } finally {
            if (contextClassLoader != _classLoader) {
                currentThread.setContextClassLoader(contextClassLoader);
            }
        }
    }

    protected Class<?> getModelClass() {
        return School.class;
    }

    protected String getModelClassName() {
        return School.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = schoolPersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}
