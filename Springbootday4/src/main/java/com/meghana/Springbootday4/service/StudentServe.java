package com.meghana.Springbootday4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meghana.Springbootday4.model.*;
import com.meghana.Springbootday4.repository.*;
@Service
public class StudentServe {
	@Autowired
	StudentRepo repo;
	
	public Student saveInformation(Student stud)
	{
		return repo.save(stud);
	}
	public List<Student> showInformation()
	{
		return repo.findAll();
	}
	public Optional<Student> Additional(int id)
	{
		return repo.findById(id);
	}
	public String changeInformationById(int id,Student stud)
	{
		repo.saveAndFlush(stud);
		if(repo.existsById(id))
		{
			return "Updated Successfully !!!";
		}
		else
		{
			return "Enter the valid Student Id";
		}
	}
	public void deleteId(int id)
	{
		repo.deleteById(id);
	}
}
