package online.qsx.service;


import online.qsx.model.City;

import java.util.List;

/**
 * city
 */
public interface CityService {
    /**
     * 查询所有省份
     * @param provinceid
     * @return
     */
    List<City> queryCityByProvinceId(Integer provinceid);

}
