package com.dong.controller;

import com.dong.domain.Demo;
import com.dong.domain.Result;
import com.dong.repository.DemoRepository;
import com.dong.service.DemoService;
import com.dong.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by dongdong on 17-7-9.
 */
@RestController
public class DemoController {

    @Autowired
    private DemoRepository demoRepository;

    @Autowired
    private DemoService demoService;

    /**
     * 获取所有结果集
     *
     * @return
     */
    @GetMapping("/demo")
    public List<Demo> getDemo() {
        return demoRepository.findAll();
    }


    /**
     * 获取指定 id 的记录
     *
     * @param id id
     * @return
     */
    @GetMapping("/demo/{id}")
    public Demo getDemoById(@PathVariable("id") Integer id) {
        return demoRepository.findOne(id);
    }

    /**
     * 添加一条 demo 记录
     * 验证名称长度
     *
     * @param demo Demo
     * @return
     */
    @PostMapping("/demo")
    public Result addDemo(@Valid Demo demo, BindingResult bindingResult) {
        // 如果验证出现错误
        if (bindingResult.hasErrors()) {
            return ResultUtil.error(500000, bindingResult.getFieldError().getDefaultMessage());
        }
        demo.setName(demo.getName());
        demo.setContent(demo.getContent());

        return ResultUtil.success(demoRepository.save(demo));
    }

    /**
     * 更新指定 id 的信息
     *
     * @param id      id
     * @param name    name
     * @param content content
     * @return
     */
    @PutMapping("/demo/{id}")
    public Demo updateDemo(@PathVariable("id") Integer id,
                           @RequestParam("name") String name,
                           @RequestParam("content") String content) {
        Demo demo = new Demo();
        demo.setId(id);
        demo.setName(name);
        demo.setContent(content);

        return demoRepository.save(demo);
    }

    /**
     * 删除指定 id 的记录
     *
     * @param id id
     */
    @DeleteMapping("/demo/{id}")
    public void deleteDemoById(@PathVariable("id") Integer id) {
        demoRepository.delete(id);
    }

    /**
     * 通过 name 获取记录
     * 自定义查询
     *
     * @param name name
     * @return
     */
    @GetMapping("/name/{name}")
    public List<Demo> getDemoByName(@PathVariable("name") String name) {
        return demoRepository.findByName(name);
    }

    /**
     * 事务管理
     */
    @GetMapping("/test")
    public void test() {
        demoService.insertTwo();
    }

    @GetMapping("/testname/{id}")
    public void testName(@PathVariable("id") Integer id) throws Exception {
        demoService.testName(id);
    }

}
