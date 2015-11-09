package com.a3groups.bts.services.service.persistence;

import com.a3groups.bts.services.NoSuchSchoolException;
import com.a3groups.bts.services.model.School;
import com.a3groups.bts.services.model.impl.SchoolImpl;
import com.a3groups.bts.services.model.impl.SchoolModelImpl;
import com.a3groups.bts.services.service.persistence.SchoolPersistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the school service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author A3 Groups Inc.
 * @see SchoolPersistence
 * @see SchoolUtil
 * @generated
 */
public class SchoolPersistenceImpl extends BasePersistenceImpl<School>
    implements SchoolPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link SchoolUtil} to access the school persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = SchoolImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SchoolModelImpl.ENTITY_CACHE_ENABLED,
            SchoolModelImpl.FINDER_CACHE_ENABLED, SchoolImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SchoolModelImpl.ENTITY_CACHE_ENABLED,
            SchoolModelImpl.FINDER_CACHE_ENABLED, SchoolImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SchoolModelImpl.ENTITY_CACHE_ENABLED,
            SchoolModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DISTRICTANDCITYANDSTATE =
        new FinderPath(SchoolModelImpl.ENTITY_CACHE_ENABLED,
            SchoolModelImpl.FINDER_CACHE_ENABLED, SchoolImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByDistrictAndCityAndState",
            new String[] {
                String.class.getName(), String.class.getName(),
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DISTRICTANDCITYANDSTATE =
        new FinderPath(SchoolModelImpl.ENTITY_CACHE_ENABLED,
            SchoolModelImpl.FINDER_CACHE_ENABLED, SchoolImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findByDistrictAndCityAndState",
            new String[] {
                String.class.getName(), String.class.getName(),
                String.class.getName()
            },
            SchoolModelImpl.DISTRICT_COLUMN_BITMASK |
            SchoolModelImpl.CITY_COLUMN_BITMASK |
            SchoolModelImpl.STATE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_DISTRICTANDCITYANDSTATE = new FinderPath(SchoolModelImpl.ENTITY_CACHE_ENABLED,
            SchoolModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByDistrictAndCityAndState",
            new String[] {
                String.class.getName(), String.class.getName(),
                String.class.getName()
            });
    private static final String _FINDER_COLUMN_DISTRICTANDCITYANDSTATE_DISTRICT_1 =
        "school.district IS NULL AND ";
    private static final String _FINDER_COLUMN_DISTRICTANDCITYANDSTATE_DISTRICT_2 =
        "school.district = ? AND ";
    private static final String _FINDER_COLUMN_DISTRICTANDCITYANDSTATE_DISTRICT_3 =
        "(school.district IS NULL OR school.district = '') AND ";
    private static final String _FINDER_COLUMN_DISTRICTANDCITYANDSTATE_CITY_1 = "school.city IS NULL AND ";
    private static final String _FINDER_COLUMN_DISTRICTANDCITYANDSTATE_CITY_2 = "school.city = ? AND ";
    private static final String _FINDER_COLUMN_DISTRICTANDCITYANDSTATE_CITY_3 = "(school.city IS NULL OR school.city = '') AND ";
    private static final String _FINDER_COLUMN_DISTRICTANDCITYANDSTATE_STATE_1 = "school.state IS NULL";
    private static final String _FINDER_COLUMN_DISTRICTANDCITYANDSTATE_STATE_2 = "school.state = ?";
    private static final String _FINDER_COLUMN_DISTRICTANDCITYANDSTATE_STATE_3 = "(school.state IS NULL OR school.state = '')";
    private static final String _SQL_SELECT_SCHOOL = "SELECT school FROM School school";
    private static final String _SQL_SELECT_SCHOOL_WHERE = "SELECT school FROM School school WHERE ";
    private static final String _SQL_COUNT_SCHOOL = "SELECT COUNT(school) FROM School school";
    private static final String _SQL_COUNT_SCHOOL_WHERE = "SELECT COUNT(school) FROM School school WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "school.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No School exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No School exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(SchoolPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "id", "state"
            });
    private static School _nullSchool = new SchoolImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<School> toCacheModel() {
                return _nullSchoolCacheModel;
            }
        };

    private static CacheModel<School> _nullSchoolCacheModel = new CacheModel<School>() {
            @Override
            public School toEntityModel() {
                return _nullSchool;
            }
        };

    public SchoolPersistenceImpl() {
        setModelClass(School.class);
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
    @Override
    public List<School> findByDistrictAndCityAndState(String district,
        String city, String state) throws SystemException {
        return findByDistrictAndCityAndState(district, city, state,
            QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<School> findByDistrictAndCityAndState(String district,
        String city, String state, int start, int end)
        throws SystemException {
        return findByDistrictAndCityAndState(district, city, state, start, end,
            null);
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
    @Override
    public List<School> findByDistrictAndCityAndState(String district,
        String city, String state, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DISTRICTANDCITYANDSTATE;
            finderArgs = new Object[] { district, city, state };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DISTRICTANDCITYANDSTATE;
            finderArgs = new Object[] {
                    district, city, state,
                    
                    start, end, orderByComparator
                };
        }

        List<School> list = (List<School>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (School school : list) {
                if (!Validator.equals(district, school.getDistrict()) ||
                        !Validator.equals(city, school.getCity()) ||
                        !Validator.equals(state, school.getState())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(5 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(5);
            }

            query.append(_SQL_SELECT_SCHOOL_WHERE);

            boolean bindDistrict = false;

            if (district == null) {
                query.append(_FINDER_COLUMN_DISTRICTANDCITYANDSTATE_DISTRICT_1);
            } else if (district.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_DISTRICTANDCITYANDSTATE_DISTRICT_3);
            } else {
                bindDistrict = true;

                query.append(_FINDER_COLUMN_DISTRICTANDCITYANDSTATE_DISTRICT_2);
            }

            boolean bindCity = false;

            if (city == null) {
                query.append(_FINDER_COLUMN_DISTRICTANDCITYANDSTATE_CITY_1);
            } else if (city.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_DISTRICTANDCITYANDSTATE_CITY_3);
            } else {
                bindCity = true;

                query.append(_FINDER_COLUMN_DISTRICTANDCITYANDSTATE_CITY_2);
            }

            boolean bindState = false;

            if (state == null) {
                query.append(_FINDER_COLUMN_DISTRICTANDCITYANDSTATE_STATE_1);
            } else if (state.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_DISTRICTANDCITYANDSTATE_STATE_3);
            } else {
                bindState = true;

                query.append(_FINDER_COLUMN_DISTRICTANDCITYANDSTATE_STATE_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(SchoolModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindDistrict) {
                    qPos.add(district);
                }

                if (bindCity) {
                    qPos.add(city);
                }

                if (bindState) {
                    qPos.add(state);
                }

                if (!pagination) {
                    list = (List<School>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<School>(list);
                } else {
                    list = (List<School>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public School findByDistrictAndCityAndState_First(String district,
        String city, String state, OrderByComparator orderByComparator)
        throws NoSuchSchoolException, SystemException {
        School school = fetchByDistrictAndCityAndState_First(district, city,
                state, orderByComparator);

        if (school != null) {
            return school;
        }

        StringBundler msg = new StringBundler(8);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("district=");
        msg.append(district);

        msg.append(", city=");
        msg.append(city);

        msg.append(", state=");
        msg.append(state);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchSchoolException(msg.toString());
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
    @Override
    public School fetchByDistrictAndCityAndState_First(String district,
        String city, String state, OrderByComparator orderByComparator)
        throws SystemException {
        List<School> list = findByDistrictAndCityAndState(district, city,
                state, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public School findByDistrictAndCityAndState_Last(String district,
        String city, String state, OrderByComparator orderByComparator)
        throws NoSuchSchoolException, SystemException {
        School school = fetchByDistrictAndCityAndState_Last(district, city,
                state, orderByComparator);

        if (school != null) {
            return school;
        }

        StringBundler msg = new StringBundler(8);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("district=");
        msg.append(district);

        msg.append(", city=");
        msg.append(city);

        msg.append(", state=");
        msg.append(state);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchSchoolException(msg.toString());
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
    @Override
    public School fetchByDistrictAndCityAndState_Last(String district,
        String city, String state, OrderByComparator orderByComparator)
        throws SystemException {
        int count = countByDistrictAndCityAndState(district, city, state);

        if (count == 0) {
            return null;
        }

        List<School> list = findByDistrictAndCityAndState(district, city,
                state, count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public School[] findByDistrictAndCityAndState_PrevAndNext(int id,
        String district, String city, String state,
        OrderByComparator orderByComparator)
        throws NoSuchSchoolException, SystemException {
        School school = findByPrimaryKey(id);

        Session session = null;

        try {
            session = openSession();

            School[] array = new SchoolImpl[3];

            array[0] = getByDistrictAndCityAndState_PrevAndNext(session,
                    school, district, city, state, orderByComparator, true);

            array[1] = school;

            array[2] = getByDistrictAndCityAndState_PrevAndNext(session,
                    school, district, city, state, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected School getByDistrictAndCityAndState_PrevAndNext(Session session,
        School school, String district, String city, String state,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_SCHOOL_WHERE);

        boolean bindDistrict = false;

        if (district == null) {
            query.append(_FINDER_COLUMN_DISTRICTANDCITYANDSTATE_DISTRICT_1);
        } else if (district.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_DISTRICTANDCITYANDSTATE_DISTRICT_3);
        } else {
            bindDistrict = true;

            query.append(_FINDER_COLUMN_DISTRICTANDCITYANDSTATE_DISTRICT_2);
        }

        boolean bindCity = false;

        if (city == null) {
            query.append(_FINDER_COLUMN_DISTRICTANDCITYANDSTATE_CITY_1);
        } else if (city.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_DISTRICTANDCITYANDSTATE_CITY_3);
        } else {
            bindCity = true;

            query.append(_FINDER_COLUMN_DISTRICTANDCITYANDSTATE_CITY_2);
        }

        boolean bindState = false;

        if (state == null) {
            query.append(_FINDER_COLUMN_DISTRICTANDCITYANDSTATE_STATE_1);
        } else if (state.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_DISTRICTANDCITYANDSTATE_STATE_3);
        } else {
            bindState = true;

            query.append(_FINDER_COLUMN_DISTRICTANDCITYANDSTATE_STATE_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(SchoolModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindDistrict) {
            qPos.add(district);
        }

        if (bindCity) {
            qPos.add(city);
        }

        if (bindState) {
            qPos.add(state);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(school);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<School> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the schools where district = &#63; and city = &#63; and state = &#63; from the database.
     *
     * @param district the district
     * @param city the city
     * @param state the state
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByDistrictAndCityAndState(String district, String city,
        String state) throws SystemException {
        for (School school : findByDistrictAndCityAndState(district, city,
                state, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(school);
        }
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
    @Override
    public int countByDistrictAndCityAndState(String district, String city,
        String state) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_DISTRICTANDCITYANDSTATE;

        Object[] finderArgs = new Object[] { district, city, state };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(4);

            query.append(_SQL_COUNT_SCHOOL_WHERE);

            boolean bindDistrict = false;

            if (district == null) {
                query.append(_FINDER_COLUMN_DISTRICTANDCITYANDSTATE_DISTRICT_1);
            } else if (district.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_DISTRICTANDCITYANDSTATE_DISTRICT_3);
            } else {
                bindDistrict = true;

                query.append(_FINDER_COLUMN_DISTRICTANDCITYANDSTATE_DISTRICT_2);
            }

            boolean bindCity = false;

            if (city == null) {
                query.append(_FINDER_COLUMN_DISTRICTANDCITYANDSTATE_CITY_1);
            } else if (city.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_DISTRICTANDCITYANDSTATE_CITY_3);
            } else {
                bindCity = true;

                query.append(_FINDER_COLUMN_DISTRICTANDCITYANDSTATE_CITY_2);
            }

            boolean bindState = false;

            if (state == null) {
                query.append(_FINDER_COLUMN_DISTRICTANDCITYANDSTATE_STATE_1);
            } else if (state.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_DISTRICTANDCITYANDSTATE_STATE_3);
            } else {
                bindState = true;

                query.append(_FINDER_COLUMN_DISTRICTANDCITYANDSTATE_STATE_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindDistrict) {
                    qPos.add(district);
                }

                if (bindCity) {
                    qPos.add(city);
                }

                if (bindState) {
                    qPos.add(state);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the school in the entity cache if it is enabled.
     *
     * @param school the school
     */
    @Override
    public void cacheResult(School school) {
        EntityCacheUtil.putResult(SchoolModelImpl.ENTITY_CACHE_ENABLED,
            SchoolImpl.class, school.getPrimaryKey(), school);

        school.resetOriginalValues();
    }

    /**
     * Caches the schools in the entity cache if it is enabled.
     *
     * @param schools the schools
     */
    @Override
    public void cacheResult(List<School> schools) {
        for (School school : schools) {
            if (EntityCacheUtil.getResult(
                        SchoolModelImpl.ENTITY_CACHE_ENABLED, SchoolImpl.class,
                        school.getPrimaryKey()) == null) {
                cacheResult(school);
            } else {
                school.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all schools.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(SchoolImpl.class.getName());
        }

        EntityCacheUtil.clearCache(SchoolImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the school.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(School school) {
        EntityCacheUtil.removeResult(SchoolModelImpl.ENTITY_CACHE_ENABLED,
            SchoolImpl.class, school.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<School> schools) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (School school : schools) {
            EntityCacheUtil.removeResult(SchoolModelImpl.ENTITY_CACHE_ENABLED,
                SchoolImpl.class, school.getPrimaryKey());
        }
    }

    /**
     * Creates a new school with the primary key. Does not add the school to the database.
     *
     * @param id the primary key for the new school
     * @return the new school
     */
    @Override
    public School create(int id) {
        School school = new SchoolImpl();

        school.setNew(true);
        school.setPrimaryKey(id);

        return school;
    }

    /**
     * Removes the school with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the school
     * @return the school that was removed
     * @throws com.a3groups.bts.services.NoSuchSchoolException if a school with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public School remove(int id) throws NoSuchSchoolException, SystemException {
        return remove((Serializable) id);
    }

    /**
     * Removes the school with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the school
     * @return the school that was removed
     * @throws com.a3groups.bts.services.NoSuchSchoolException if a school with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public School remove(Serializable primaryKey)
        throws NoSuchSchoolException, SystemException {
        Session session = null;

        try {
            session = openSession();

            School school = (School) session.get(SchoolImpl.class, primaryKey);

            if (school == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchSchoolException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(school);
        } catch (NoSuchSchoolException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected School removeImpl(School school) throws SystemException {
        school = toUnwrappedModel(school);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(school)) {
                school = (School) session.get(SchoolImpl.class,
                        school.getPrimaryKeyObj());
            }

            if (school != null) {
                session.delete(school);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (school != null) {
            clearCache(school);
        }

        return school;
    }

    @Override
    public School updateImpl(com.a3groups.bts.services.model.School school)
        throws SystemException {
        school = toUnwrappedModel(school);

        boolean isNew = school.isNew();

        SchoolModelImpl schoolModelImpl = (SchoolModelImpl) school;

        Session session = null;

        try {
            session = openSession();

            if (school.isNew()) {
                session.save(school);

                school.setNew(false);
            } else {
                session.merge(school);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !SchoolModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((schoolModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DISTRICTANDCITYANDSTATE.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        schoolModelImpl.getOriginalDistrict(),
                        schoolModelImpl.getOriginalCity(),
                        schoolModelImpl.getOriginalState()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DISTRICTANDCITYANDSTATE,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DISTRICTANDCITYANDSTATE,
                    args);

                args = new Object[] {
                        schoolModelImpl.getDistrict(), schoolModelImpl.getCity(),
                        schoolModelImpl.getState()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DISTRICTANDCITYANDSTATE,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DISTRICTANDCITYANDSTATE,
                    args);
            }
        }

        EntityCacheUtil.putResult(SchoolModelImpl.ENTITY_CACHE_ENABLED,
            SchoolImpl.class, school.getPrimaryKey(), school);

        return school;
    }

    protected School toUnwrappedModel(School school) {
        if (school instanceof SchoolImpl) {
            return school;
        }

        SchoolImpl schoolImpl = new SchoolImpl();

        schoolImpl.setNew(school.isNew());
        schoolImpl.setPrimaryKey(school.getPrimaryKey());

        schoolImpl.setId(school.getId());
        schoolImpl.setName(school.getName());
        schoolImpl.setAddress(school.getAddress());
        schoolImpl.setDistrict(school.getDistrict());
        schoolImpl.setCity(school.getCity());
        schoolImpl.setState(school.getState());

        return schoolImpl;
    }

    /**
     * Returns the school with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the school
     * @return the school
     * @throws com.a3groups.bts.services.NoSuchSchoolException if a school with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public School findByPrimaryKey(Serializable primaryKey)
        throws NoSuchSchoolException, SystemException {
        School school = fetchByPrimaryKey(primaryKey);

        if (school == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchSchoolException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return school;
    }

    /**
     * Returns the school with the primary key or throws a {@link com.a3groups.bts.services.NoSuchSchoolException} if it could not be found.
     *
     * @param id the primary key of the school
     * @return the school
     * @throws com.a3groups.bts.services.NoSuchSchoolException if a school with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public School findByPrimaryKey(int id)
        throws NoSuchSchoolException, SystemException {
        return findByPrimaryKey((Serializable) id);
    }

    /**
     * Returns the school with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the school
     * @return the school, or <code>null</code> if a school with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public School fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        School school = (School) EntityCacheUtil.getResult(SchoolModelImpl.ENTITY_CACHE_ENABLED,
                SchoolImpl.class, primaryKey);

        if (school == _nullSchool) {
            return null;
        }

        if (school == null) {
            Session session = null;

            try {
                session = openSession();

                school = (School) session.get(SchoolImpl.class, primaryKey);

                if (school != null) {
                    cacheResult(school);
                } else {
                    EntityCacheUtil.putResult(SchoolModelImpl.ENTITY_CACHE_ENABLED,
                        SchoolImpl.class, primaryKey, _nullSchool);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(SchoolModelImpl.ENTITY_CACHE_ENABLED,
                    SchoolImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return school;
    }

    /**
     * Returns the school with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param id the primary key of the school
     * @return the school, or <code>null</code> if a school with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public School fetchByPrimaryKey(int id) throws SystemException {
        return fetchByPrimaryKey((Serializable) id);
    }

    /**
     * Returns all the schools.
     *
     * @return the schools
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<School> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<School> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<School> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<School> list = (List<School>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_SCHOOL);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_SCHOOL;

                if (pagination) {
                    sql = sql.concat(SchoolModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<School>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<School>(list);
                } else {
                    list = (List<School>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the schools from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (School school : findAll()) {
            remove(school);
        }
    }

    /**
     * Returns the number of schools.
     *
     * @return the number of schools
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_SCHOOL);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    @Override
    protected Set<String> getBadColumnNames() {
        return _badColumnNames;
    }

    /**
     * Initializes the school persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.a3groups.bts.services.model.School")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<School>> listenersList = new ArrayList<ModelListener<School>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<School>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(SchoolImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
