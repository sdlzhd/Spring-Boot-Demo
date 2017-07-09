package com.dong.controller;

import com.dong.properties.DemoProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by dongdong on 17-7-8.
 */
@Controller
public class HelloController {

    /**
     * mvc 控制器，返回一个 HTML 模板
     *
     * @return
     */
    @GetMapping("hi")
    public String hi() {
        return "hi";
    }
}
