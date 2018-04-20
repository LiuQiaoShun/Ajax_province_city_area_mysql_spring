package online.qsx.service;


import online.qsx.model.Area;
import online.qsx.model.City;

import java.util.List;

/**
 * city
 */
public interface AreaService {
    /**
     * 查询所有省份
     * @param father
     * @return
     */
    List<Area> queryAreaByCityId(Integer father);

}
