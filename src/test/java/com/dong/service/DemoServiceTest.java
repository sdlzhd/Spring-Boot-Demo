package com.dong.service;

import com.dong.domain.Demo;
import com.dong.service.DemoService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by dongdong on 17-7-9.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoServiceTest {

    @Autowired
    private DemoService demoService;

    @Test
    public void testFindOne() {
        Demo demo = demoService.testFindOne(1);
        Assert.assertEquals("demo1",demo.getContent());
    }
}
