package com.meghana.Springbootday4.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.meghana.Springbootday4.service.*;
import com.meghana.Springbootday4.model.*;

@RestController
public class ApiController {
	@Autowired
    StudentServe s;
    
    @PostMapping("save")
    public Student add(@RequestBody Student stud)
    {
 	   return s.saveInformation(stud);
    }
    @GetMapping("show")
    public List<Student>show()
    {
 	   return s.showInformation();
    }
    @GetMapping("get/{id}")
    public Optional<Student>getInfo(@PathVariable int id)
    {
 	   return s.Additional(id);
    }
    @PutMapping("update/{id}")
    public String modifyById(@PathVariable int id,@RequestBody Student stud)
	{
		return s.changeInformationById(id,stud);
	}
    @DeleteMapping("delete/{id}")
    public  void deletebyId(@PathVariable int id)
    {
   	  s.deleteId(id);
    }
}
