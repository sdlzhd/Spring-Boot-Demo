package com.dong.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMultipartHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.Assert.*;

/**
 * Created by dongdong on 17-7-9.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class DemoControllerTest {

    @Autowired
    private MockMvc mvc;

    /**
     * 测试 Htpp 返回码
     *
     * @throws Exception
     */
    @Test
    public void getDemo() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/demo")).andExpect(MockMvcResultMatchers.status().isOk());
    }

    /**
     * 测试返回内容
     *
     * @throws Exception
     */
    @Test
    public void getDemoById() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/demo")).andExpect(MockMvcResultMatchers.content().string("abc"));
    }

}