package com.dong.service;

import com.dong.Exception.DemoException;
import com.dong.domain.Demo;
import com.dong.enums.ResultEnum;
import com.dong.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by dongdong on 17-7-9.
 */
@Service
public class DemoService {

    @Autowired
    private DemoRepository demoRepository;

    /**
     * 带有事务的插入
     */
    @Transactional
    public void insertTwo() {
        Demo demo10 = new Demo();
        Demo demo11 = new Demo();

        demo10.setName("d");
        demo11.setName("demo11");
        demo10.setContent("demo10101010");
        demo11.setContent("demo11111111");

        demoRepository.save(demo10);
        demoRepository.save(demo11);

    }

    public void testName(Integer id) throws Exception {
        Demo demo = demoRepository.findOne(id);
        String name = demo.getName();
        if (name.length() > 10) {
            throw new DemoException(ResultEnum.DEMO_ERROR);
        } else {
            // 仅仅为了测试异常捕获情况
            throw new Exception("===");
        }
    }

    /**
     * 测试使用
     */
    public Demo testFindOne(Integer id){
        return demoRepository.findOne(id);
    }
}
