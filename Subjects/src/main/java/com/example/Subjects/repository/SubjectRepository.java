package com.example.Subjects.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Subjects.model.Subjects;

@Repository
public interface SubjectRepository extends JpaRepository<Subjects, Integer> {

//@Query("select subjectName from Subjects")//1.Customized method ,his is called 
//as jpql query,this is one method to create customized methods.
	
	@Query("select count(subjectName) from Subjects")
	public int getCount();
	@Query("select subjectName from Subjects")
	public List<String> getAllSubjectNames();
	@Query("select subjectId from Subjects order by(subjectId)desc")
	public List<String>orderBy();
	
}
