package com.example.Subjects.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Subjects {
	@Id
	@GeneratedValue
	private int subjectId;
	@NotNull
	private String subjectName;
	private String subejctAuthor;
	public int getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getSubejctAuthor() {
		return subejctAuthor;
	}
	public void setSubejctAuthor(String subejctAuthor) {
		this.subejctAuthor = subejctAuthor;
	}
	
	
}
