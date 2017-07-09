package com.dong.repository;

import com.dong.domain.Demo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by dongdong on 17-7-9.
 */
public interface DemoRepository extends JpaRepository<Demo, Integer> {
    /**
     * 通过姓名查询
     *
     * @param name 姓名
     * @return 查询结果列表
     */
    public List<Demo> findByName(String name);
}
