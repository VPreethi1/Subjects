package com.example.Subjects.controller;

import java.util.List;
import java.util.Optional;

import javax.security.auth.Subject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Subjects.model.Subjects;
import com.example.Subjects.repository.SubjectRepository;

@RestController
@RequestMapping("/subject")
public class SubjectController {
	@Autowired
	SubjectRepository subjectrepository;
	//@GetMapping("/save")
	@PostMapping("insert")
	public Subjects saveDetails(@RequestBody Subjects subject){
		/*Subjects s = new Subjects();
		s.setSubejctAuthor("a");
		s.setSubjectName("english");*/
		return subjectrepository.save(subject);
	}
	@GetMapping("/getAll")
	public List<Subjects> getAll(){
		return subjectrepository.findAll();
		
	}
	@DeleteMapping("/delete")
	public void delete(){
		subjectrepository.deleteById(28);
	}
	@PutMapping("/update/{id}")
	public Subjects updateval(@PathVariable int id,@RequestBody Subjects subject){
			
		Optional<Subjects> s=subjectrepository.findById(id);
		if(s!=null)
			return subjectrepository.save(subject);
		return null;
	}
	@GetMapping("/subjectnames")
	public List<String> subjects(){
		return subjectrepository.getAllSubjectNames();
	}
	
	@GetMapping("/count")
	public int count(){
		return subjectrepository.getCount();
	}
	@GetMapping("/order")
	public List<String>orderBy(){
		return subjectrepository.orderBy();
	}
	
	
}
