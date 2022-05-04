package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name="Student_data")
public class Student {
	
	@Id
	private int student_id;
	
	@Column (name="Student_name")
	private String name;
	
	@Column(name="Student_score")
	private double score;
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
}
