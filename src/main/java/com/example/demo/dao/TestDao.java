package com.example.demo.dao;

import com.example.demo.pojo.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestDao extends JpaRepository<Test,String> {
}
