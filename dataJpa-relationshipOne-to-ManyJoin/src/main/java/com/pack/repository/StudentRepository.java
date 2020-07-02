package com.pack.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pack.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>
{
/*@Query("select s.studentid,s.studentname,c.coursename,c.fees from Student s join s.courses c")   //Inner Join//
List<Object[]>readStudentwithCourses();*/
	
	
/*@Query("select s.studentid,s.studentname,c.coursename,c.fees from Student s left outer join s.courses c")  //left outer join//
List<Object[]>readStudentwithCourses();*/
	


/*@Query("select s.studentid,s.studentname,c.coursename,c.fees from Student s right outer join s.courses c")  //right outer join//
List<Object[]>readStudentwithCourses();*/
	
/*@Query("select s.studentid,s.studentname,c.coursename,c.fees from Student s full join s.courses c")  //full join//
List<Object[]>readStudentwithCourses();*/
}
