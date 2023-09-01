package com.meghana.Springbootday4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meghana.Springbootday4.model.*;


public interface StudentRepo extends JpaRepository<Student,Integer> 
{

}