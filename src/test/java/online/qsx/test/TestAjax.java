package online.qsx.test;

import online.qsx.mapper.AreaMapper;
import online.qsx.model.Area;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:applicationContext-mybatis.xml"})
public class TestAjax {

    @Autowired
    private AreaMapper areaMapper;

    @Test
    public void testArea(){
        List<Area> areas=areaMapper.queryAreaByCityId(110100);
        areas.stream().forEach(student -> System.out.println(student));
    }
}
