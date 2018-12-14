package org.spring.springboot.dao;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.City;
import org.springframework.transaction.annotation.Transactional;

/**
 * 城市 DAO 接口类
 *
 * Created by bysocket on 07/02/2017.
 */
public interface CityDao {

    /**
     * 根据城市名称，查询城市信息
     *
     * @param cityName 城市名
     */
    City findByName(@Param("cityName") String cityName);
    City findById(Integer cityName);
    void addOne(City city);
}
