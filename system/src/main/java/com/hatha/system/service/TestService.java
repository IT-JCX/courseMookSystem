package com.hatha.system.service;

import com.hatha.system.domain.Test;
import com.hatha.system.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: IT-JCX
 * @time: 2020/8/22 18:53
 */
@Service
public class TestService {

    @Resource
    private TestMapper testMapper;

    public List<Test> list(){
        return testMapper.list();
    }





}
