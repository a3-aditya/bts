package com.a3groups.bts.services.service.persistence;

import com.a3groups.bts.services.model.School;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the school service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author A3 Groups Inc.
 * @see SchoolPersistenceImpl
 * @see SchoolUtil
 * @generated
 */
public interface SchoolPersistence extends BasePersistence<School> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link SchoolUtil} to access the school persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the schools where district = &#63; and city = &#63; and state = &#63;.
    *
    * @param district the district
    * @param city the city
    * @param state the state
    * @return the matching schools
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.a3groups.bts.services.model.School> findByDistrictAndCityAndState(
        java.lang.String district, java.lang.String city, java.lang.String state)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.a3groups.bts.services.model.School> findByDistrictAndCityAndState(
        java.lang.String district, java.lang.String city,
        java.lang.String state, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.a3groups.bts.services.model.School> findByDistrictAndCityAndState(
        java.lang.String district, java.lang.String city,
        java.lang.String state, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.a3groups.bts.services.model.School findByDistrictAndCityAndState_First(
        java.lang.String district, java.lang.String city,
        java.lang.String state,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.a3groups.bts.services.NoSuchSchoolException,
            com.liferay.portal.kernel.exception.SystemException;

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
    public com.a3groups.bts.services.model.School fetchByDistrictAndCityAndState_First(
        java.lang.String district, java.lang.String city,
        java.lang.String state,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.a3groups.bts.services.model.School findByDistrictAndCityAndState_Last(
        java.lang.String district, java.lang.String city,
        java.lang.String state,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.a3groups.bts.services.NoSuchSchoolException,
            com.liferay.portal.kernel.exception.SystemException;

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
    public com.a3groups.bts.services.model.School fetchByDistrictAndCityAndState_Last(
        java.lang.String district, java.lang.String city,
        java.lang.String state,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.a3groups.bts.services.model.School[] findByDistrictAndCityAndState_PrevAndNext(
        int id, java.lang.String district, java.lang.String city,
        java.lang.String state,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.a3groups.bts.services.NoSuchSchoolException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the schools where district = &#63; and city = &#63; and state = &#63; from the database.
    *
    * @param district the district
    * @param city the city
    * @param state the state
    * @throws SystemException if a system exception occurred
    */
    public void removeByDistrictAndCityAndState(java.lang.String district,
        java.lang.String city, java.lang.String state)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of schools where district = &#63; and city = &#63; and state = &#63;.
    *
    * @param district the district
    * @param city the city
    * @param state the state
    * @return the number of matching schools
    * @throws SystemException if a system exception occurred
    */
    public int countByDistrictAndCityAndState(java.lang.String district,
        java.lang.String city, java.lang.String state)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the school in the entity cache if it is enabled.
    *
    * @param school the school
    */
    public void cacheResult(com.a3groups.bts.services.model.School school);

    /**
    * Caches the schools in the entity cache if it is enabled.
    *
    * @param schools the schools
    */
    public void cacheResult(
        java.util.List<com.a3groups.bts.services.model.School> schools);

    /**
    * Creates a new school with the primary key. Does not add the school to the database.
    *
    * @param id the primary key for the new school
    * @return the new school
    */
    public com.a3groups.bts.services.model.School create(int id);

    /**
    * Removes the school with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the school
    * @return the school that was removed
    * @throws com.a3groups.bts.services.NoSuchSchoolException if a school with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.a3groups.bts.services.model.School remove(int id)
        throws com.a3groups.bts.services.NoSuchSchoolException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.a3groups.bts.services.model.School updateImpl(
        com.a3groups.bts.services.model.School school)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the school with the primary key or throws a {@link com.a3groups.bts.services.NoSuchSchoolException} if it could not be found.
    *
    * @param id the primary key of the school
    * @return the school
    * @throws com.a3groups.bts.services.NoSuchSchoolException if a school with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.a3groups.bts.services.model.School findByPrimaryKey(int id)
        throws com.a3groups.bts.services.NoSuchSchoolException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the school with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the school
    * @return the school, or <code>null</code> if a school with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.a3groups.bts.services.model.School fetchByPrimaryKey(int id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the schools.
    *
    * @return the schools
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.a3groups.bts.services.model.School> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.a3groups.bts.services.model.School> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.a3groups.bts.services.model.School> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the schools from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of schools.
    *
    * @return the number of schools
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
