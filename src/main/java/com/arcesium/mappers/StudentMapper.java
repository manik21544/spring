package com.arcesium.mappers;

import java.util.List;

import com.arcesium.entry.Student;

public interface StudentMapper {

	public Student getStudentById(int id);
	public List<Student> getAllStudents();
	public void insertStudent(Student student);
	public void updateStudent(Student student);
	public void deleteStudent(int id);
}