package com.example.demo.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository//This annotation will be used for class which is dealing with database.
public interface StudentRepository extends JpaRepository<Student,Integer> {
	//first parameter name of entity and second parameter datatype of primary key 

}

/*
 * We have two interfaces which can be used for database operatios
 * CrudRepository-it is dealing with all the datbase basic operations like insert,delete
 * update and view
 * 
 * JpaRepository-is the sub interface of Crud Respository which provides u additional features
 * like pagination 
 */