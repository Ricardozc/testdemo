package com.example.demo.service;

import com.example.demo.dao.TestDao;
import com.example.demo.pojo.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    @Autowired
    private TestDao testDao;

    public List<Test> getAll(){
        return testDao.findAll();
    }
}
