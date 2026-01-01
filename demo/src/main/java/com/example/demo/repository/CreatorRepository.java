package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Creator;

public interface CreatorRepository extends JpaRepository<Creator,Long> {
    
}
