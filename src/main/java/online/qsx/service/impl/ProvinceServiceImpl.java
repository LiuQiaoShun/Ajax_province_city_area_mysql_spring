package online.qsx.service.impl;

import online.qsx.mapper.ProvinceMapper;
import online.qsx.model.Province;
import online.qsx.model.ProvinceCriteria;
import online.qsx.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinceServiceImpl implements ProvinceService {

    @Autowired
    private ProvinceMapper provinceMapper;

    @Override
    public List<Province> queryAllProvince(Province province) {
        ProvinceCriteria provinceCriteria=new ProvinceCriteria();

        return provinceMapper.selectByExample(provinceCriteria);
    }

}
