package org.spring.springboot.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.springboot.dao.CityDao;
import org.spring.springboot.domain.City;
import org.spring.springboot.exceptions.TishiException;
import org.spring.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 城市业务逻辑实现类
 *
 * Created by bysocket on 07/02/2017.
 */
@Service
public class CityServiceImpl implements CityService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    /**
     * 缓存的key
     */
    public static final String THING_ALL_KEY   = "\"thing_all\"";
    /**
     * value属性表示使用哪个缓存策略，缓存策略在ehcache.xml
     */
    public static final String DEMO_CACHE_NAME = "demo";

    @Autowired
    private CityDao cityDao;

    @Cacheable(value = DEMO_CACHE_NAME,key = "#cityName")
    public City findCityByName(String cityName) {
        return cityDao.findByName(cityName);
    }

    public City findCityById(Integer id) {
        return cityDao.findById(id);
    }

    public void addOne(City city) {
         cityDao.addOne(city);
         logger.info("添加了一次:  " + city );
//         throw new TishiException("这是提示信息，看到就行了");
    }

}
