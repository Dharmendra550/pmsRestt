package com.pack.runner;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.pack.entity.Course;
import com.pack.entity.Student;
import com.pack.repository.StudentRepository;


@Component
public class MyRunner implements CommandLineRunner
{
  @Autowired
  ApplicationContext ctx;
	@Override
	public void run(String... args) throws Exception 
	{
		StudentRepository studentRepo=(StudentRepository)ctx.getBean("studentRepository");
		
        Student student=new Student(101,"Dharmendra",7674940936L);
       
		
		Course course1=new Course(1111,"Java",5000.0);
		Course course2=new Course(2222,"SpringBoot",4000.0);
		Course course3=new Course(3333,"MySql",3000.0);
		
		Set<Course> courses=new HashSet<Course>();
		courses.add(course1);
		courses.add(course2);
		courses.add(course3);
		student.setCourses(courses);
		
		
		 studentRepo.save(student);
		
		/*List<Object[]>list=studentRepo.readStudentwithCourses();
		list.forEach(obj->System.out.println(obj[0]+","+obj[1]+""+obj[2]+","+obj[3]));*/
       		

	}

}
