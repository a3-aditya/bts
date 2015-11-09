package com.a3groups.bts.services.service.persistence;

import com.a3groups.bts.services.model.School;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the school service. This utility wraps {@link SchoolPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author A3 Groups Inc.
 * @see SchoolPersistence
 * @see SchoolPersistenceImpl
 * @generated
 */
public class SchoolUtil {
    private static SchoolPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(School school) {
        getPersistence().clearCache(school);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<School> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<School> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<School> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static School update(School school) throws SystemException {
        return getPersistence().update(school);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static School update(School school, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(school, serviceContext);
    }

    /**
    * Returns all the schools where district = &#63; and city = &#63; and state = &#63;.
    *
    * @param district the district
    * @param city the city
    * @param state the state
    * @return the matching schools
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.a3groups.bts.services.model.School> findByDistrictAndCityAndState(
        java.lang.String district, java.lang.String city, java.lang.String state)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByDistrictAndCityAndState(district, city, state);
    }

    /**
    * Returns a range of all the schools where district = &#63; and city = &#63; and state = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.a3groups.bts.services.model.impl.SchoolModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param district the district
    * @param city the city
    * @param state the state
    * @param start the lower bound of the range of schools
    * @param end the upper bound of the range of schools (not inclusive)
    * @return the range of matching schools
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.a3groups.bts.services.model.School> findByDistrictAndCityAndState(
        java.lang.String district, java.lang.String city,
        java.lang.String state, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByDistrictAndCityAndState(district, city, state, start,
            end);
    }

    /**
    * Returns an ordered range of all the schools where district = &#63; and city = &#63; and state = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.a3groups.bts.services.model.impl.SchoolModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param district the district
    * @param city the city
    * @param state the state
    * @param start the lower bound of the range of schools
    * @param end the upper bound of the range of schools (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching schools
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.a3groups.bts.services.model.School> findByDistrictAndCityAndState(
        java.lang.String district, java.lang.String city,
        java.lang.String state, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByDistrictAndCityAndState(district, city, state, start,
            end, orderByComparator);
    }

    /**
    * Returns the first school in the ordered set where district = &#63; and city = &#63; and state = &#63;.
    *
    * @param district the district
    * @param city the city
    * @param state the state
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching school
    * @throws com.a3groups.bts.services.NoSuchSchoolException if a matching school could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.a3groups.bts.services.model.School findByDistrictAndCityAndState_First(
        java.lang.String district, java.lang.String city,
        java.lang.String state,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.a3groups.bts.services.NoSuchSchoolException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByDistrictAndCityAndState_First(district, city, state,
            orderByComparator);
    }

    /**
    * Returns the first school in the ordered set where district = &#63; and city = &#63; and state = &#63;.
    *
    * @param district the district
    * @param city the city
    * @param state the state
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching school, or <code>null</code> if a matching school could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.a3groups.bts.services.model.School fetchByDistrictAndCityAndState_First(
        java.lang.String district, java.lang.String city,
        java.lang.String state,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByDistrictAndCityAndState_First(district, city, state,
            orderByComparator);
    }

    /**
    * Returns the last school in the ordered set where district = &#63; and city = &#63; and state = &#63;.
    *
    * @param district the district
    * @param city the city
    * @param state the state
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching school
    * @throws com.a3groups.bts.services.NoSuchSchoolException if a matching school could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.a3groups.bts.services.model.School findByDistrictAndCityAndState_Last(
        java.lang.String district, java.lang.String city,
        java.lang.String state,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.a3groups.bts.services.NoSuchSchoolException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByDistrictAndCityAndState_Last(district, city, state,
            orderByComparator);
    }

    /**
    * Returns the last school in the ordered set where district = &#63; and city = &#63; and state = &#63;.
    *
    * @param district the district
    * @param city the city
    * @param state the state
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching school, or <code>null</code> if a matching school could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.a3groups.bts.services.model.School fetchByDistrictAndCityAndState_Last(
        java.lang.String district, java.lang.String city,
        java.lang.String state,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByDistrictAndCityAndState_Last(district, city, state,
            orderByComparator);
    }

    /**
    * Returns the schools before and after the current school in the ordered set where district = &#63; and city = &#63; and state = &#63;.
    *
    * @param id the primary key of the current school
    * @param district the district
    * @param city the city
    * @param state the state
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next school
    * @throws com.a3groups.bts.services.NoSuchSchoolException if a school with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.a3groups.bts.services.model.School[] findByDistrictAndCityAndState_PrevAndNext(
        int id, java.lang.String district, java.lang.String city,
        java.lang.String state,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.a3groups.bts.services.NoSuchSchoolException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByDistrictAndCityAndState_PrevAndNext(id, district,
            city, state, orderByComparator);
    }

    /**
    * Removes all the schools where district = &#63; and city = &#63; and state = &#63; from the database.
    *
    * @param district the district
    * @param city the city
    * @param state the state
    * @throws SystemException if a system exception occurred
    */
    public static void removeByDistrictAndCityAndState(
        java.lang.String district, java.lang.String city, java.lang.String state)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByDistrictAndCityAndState(district, city, state);
    }

    /**
    * Returns the number of schools where district = &#63; and city = &#63; and state = &#63;.
    *
    * @param district the district
    * @param city the city
    * @param state the state
    * @return the number of matching schools
    * @throws SystemException if a system exception occurred
    */
    public static int countByDistrictAndCityAndState(
        java.lang.String district, java.lang.String city, java.lang.String state)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .countByDistrictAndCityAndState(district, city, state);
    }

    /**
    * Caches the school in the entity cache if it is enabled.
    *
    * @param school the school
    */
    public static void cacheResult(
        com.a3groups.bts.services.model.School school) {
        getPersistence().cacheResult(school);
    }

    /**
    * Caches the schools in the entity cache if it is enabled.
    *
    * @param schools the schools
    */
    public static void cacheResult(
        java.util.List<com.a3groups.bts.services.model.School> schools) {
        getPersistence().cacheResult(schools);
    }

    /**
    * Creates a new school with the primary key. Does not add the school to the database.
    *
    * @param id the primary key for the new school
    * @return the new school
    */
    public static com.a3groups.bts.services.model.School create(int id) {
        return getPersistence().create(id);
    }

    /**
    * Removes the school with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the school
    * @return the school that was removed
    * @throws com.a3groups.bts.services.NoSuchSchoolException if a school with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.a3groups.bts.services.model.School remove(int id)
        throws com.a3groups.bts.services.NoSuchSchoolException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(id);
    }

    public static com.a3groups.bts.services.model.School updateImpl(
        com.a3groups.bts.services.model.School school)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(school);
    }

    /**
    * Returns the school with the primary key or throws a {@link com.a3groups.bts.services.NoSuchSchoolException} if it could not be found.
    *
    * @param id the primary key of the school
    * @return the school
    * @throws com.a3groups.bts.services.NoSuchSchoolException if a school with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.a3groups.bts.services.model.School findByPrimaryKey(
        int id)
        throws com.a3groups.bts.services.NoSuchSchoolException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(id);
    }

    /**
    * Returns the school with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the school
    * @return the school, or <code>null</code> if a school with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.a3groups.bts.services.model.School fetchByPrimaryKey(
        int id) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(id);
    }

    /**
    * Returns all the schools.
    *
    * @return the schools
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.a3groups.bts.services.model.School> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the schools.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.a3groups.bts.services.model.impl.SchoolModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of schools
    * @param end the upper bound of the range of schools (not inclusive)
    * @return the range of schools
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.a3groups.bts.services.model.School> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the schools.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.a3groups.bts.services.model.impl.SchoolModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of schools
    * @param end the upper bound of the range of schools (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of schools
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.a3groups.bts.services.model.School> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the schools from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of schools.
    *
    * @return the number of schools
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static SchoolPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (SchoolPersistence) PortletBeanLocatorUtil.locate(com.a3groups.bts.services.service.ClpSerializer.getServletContextName(),
                    SchoolPersistence.class.getName());

            ReferenceRegistry.registerReference(SchoolUtil.class, "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(SchoolPersistence persistence) {
    }
}
