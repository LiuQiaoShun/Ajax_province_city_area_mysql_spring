package online.qsx.service.impl;

import online.qsx.mapper.AreaMapper;
import online.qsx.mapper.CityMapper;
import online.qsx.model.Area;
import online.qsx.model.City;
import online.qsx.service.AreaService;
import online.qsx.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaMapper areaMapper;

    @Override
    public List<Area> queryAreaByCityId(Integer father) {
        return areaMapper.queryAreaByCityId(father);
    }
}
