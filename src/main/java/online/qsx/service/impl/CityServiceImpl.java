package online.qsx.service.impl;

import online.qsx.mapper.CityMapper;
import online.qsx.model.City;
import online.qsx.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityMapper cityMapper;

    @Override
    public List<City> queryCityByProvinceId(Integer provinceid) {
        return cityMapper.queryCityByProvinceId(provinceid);
    }
}
