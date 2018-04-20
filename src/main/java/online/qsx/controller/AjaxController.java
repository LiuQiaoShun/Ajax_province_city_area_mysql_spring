package online.qsx.controller;

import online.qsx.model.Area;
import online.qsx.model.City;
import online.qsx.model.Province;
import online.qsx.service.AreaService;
import online.qsx.service.CityService;
import online.qsx.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AjaxController {

    @Autowired
    private ProvinceService provinceService;

    @Autowired
    private CityService cityService;

    @Autowired
    private AreaService areaService;

    @RequestMapping(value = "province",method = RequestMethod.GET)
    public ModelAndView queryAllProvince(ModelAndView mav,Province province){
        mav.addObject("province",provinceService.queryAllProvince(province));
        mav.setViewName("province");
        return mav;
    }


    @RequestMapping(value = "queryCityByProvinceId",method = {RequestMethod.POST,RequestMethod.GET})
    @ResponseBody
    public List<City> queryCityByProvinceId(Integer provinceid){
        System.out.println(cityService.queryCityByProvinceId(provinceid));
        return cityService.queryCityByProvinceId(provinceid);
    }

    @RequestMapping(value = "queryAreaByCityId",method = {RequestMethod.POST,RequestMethod.GET})
    @ResponseBody
    public List<Area> queryAreaByCityId(Integer father){
        System.out.println(areaService.queryAreaByCityId(father));
        return areaService.queryAreaByCityId(father);
    }
}
