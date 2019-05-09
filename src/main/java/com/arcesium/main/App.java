package com.arcesium.main;

import java.util.List;

import com.arcesium.entry.Student;
import com.arcesium.service.StudentService;

public class App {
	public static void main(String[] args)
	{
		StudentService service = new StudentService();
		Student student = new Student();
		student.setFirstName("newFirstName");
	    student.setLastName("newLastName");
	    student.setPasses(5);
	    service.insertStudent(student);
	    
	    List<Student> students=service.getAllStudents();
	    for(Student stud:students)
	    {
	    	System.out.println(stud.toString());
	    }
	    
	    Student temp = new Student();
	    temp.setFirstName("a");
	    temp.setId(3);
	    temp.setLastName("b");
	    temp.setPasses(3);
	    service.updateStudent(temp);
	    
	    Student stud = service.getStudentById(3);
	    System.out.println(stud.toString());
	    
	    service.deleteStudent(1);
	    
	    
	}
}
