package org.spring.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.springboot.domain.City;
import org.spring.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

/**
 * Created by bysocket on 07/02/2017.
 */
@RestController
public class CityRestController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/api/city", method = RequestMethod.GET)
    public City findOneCity(@RequestParam(value = "cityName", required = false) String cityName) {
        City one = cityService.findCityByName(cityName);
//        logger.info(one.toString());
//        City one = cityService.findCityById(1);
        return one;
    }
    @GetMapping(value = "/add")
    @Transactional
    public City addOne(){
        City city = new City();
        city.setProvinceId("安徽省");
        city.setCityName("合肥市");
        city.setDescription("这是一个SB一样的城市！");
        cityService.addOne(city);
        City addCity = cityService.findCityByName(city.getCityName());
        if (addCity != null)
            city.setId(addCity.getId());
//        city.setId(id);
        return city;
    }

}
