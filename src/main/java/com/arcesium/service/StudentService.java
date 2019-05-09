package com.arcesium.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.arcesium.entry.Student;
import com.arcesium.mappers.StudentMapper;
import com.arcesium.utils.MybatisUtil;

public class StudentService {
	
	public Student getStudentById(int id)
	{
		SqlSession session = MybatisUtil.getSqlSessionFactory().openSession();
		try {
			StudentMapper studentMapper = session.getMapper(StudentMapper.class);
			return studentMapper.getStudentById(id);
		}finally {
			session.close();
		}
	}
	
	public List<Student> getAllStudents()
	{
		SqlSession session = MybatisUtil.getSqlSessionFactory().openSession();
		try {
			StudentMapper studentMapper = session.getMapper(StudentMapper.class);
			return studentMapper.getAllStudents();
		}finally {
			session.close();
		}
	}
	
	public void insertStudent(Student student)
	{
		SqlSession session = MybatisUtil.getSqlSessionFactory().openSession();
		try {
			StudentMapper studentMapper = session.getMapper(StudentMapper.class);
			studentMapper.insertStudent(student);
			session.commit();
		}finally {
			session.close();
		}
	}
	
	public void updateStudent(Student student)
	{
		SqlSession session = MybatisUtil.getSqlSessionFactory().openSession();
		try {
			StudentMapper studentMapper = session.getMapper(StudentMapper.class);
			studentMapper.updateStudent(student);
			session.commit();
		}finally {
			session.close();
		}
	}
	
	public void deleteStudent(int id)
	{
		SqlSession session = MybatisUtil.getSqlSessionFactory().openSession();
		try {
			StudentMapper studentMapper = session.getMapper(StudentMapper.class);
			studentMapper.deleteStudent(id);
			session.commit();
		}finally {
			session.close();
		}
	}
	
}
