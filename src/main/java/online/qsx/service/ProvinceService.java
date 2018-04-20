package online.qsx.service;


import online.qsx.model.Province;

import java.util.List;

/**
 * province
 */
public interface ProvinceService {
    /**
     * 查询所有省份
     * @param province
     * @return
     */
    List<Province> queryAllProvince(Province province);

}
