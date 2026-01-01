package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Design;

public interface DesignRepository extends JpaRepository<Design,Long> {
    
}
