package com.arcesium.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.arcesium.entry.Student;
import com.arcesium.service.StudentService;

@Controller
public class ListController {
	
	@GetMapping("/showStudents")
	public String showStudents(Model model)
	{
		List<Student> students = new StudentService().getAllStudents();
		model.addAttribute("students",students);
		return "listofstudents";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model) {
		model.addAttribute("student",new Student());
		return "studentform";
		
	}
	
	@PostMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("student") Student student,BindingResult result) {
		
		if(result.hasErrors())
		{
			return "studentform";
		}
		else if(student.getId()==null)
		{
			StudentService studentService=new StudentService();
			studentService.insertStudent(student);
			return "redirect:/showStudents";
		}
		else
		{
			new StudentService().updateStudent(student);
			return "redirect:/showStudents";
		}
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("theId")int id,Model model)
	{
		Student stud = new StudentService().getStudentById(id);
		model.addAttribute("student",stud);
		return "studentform";
	}
	
	@GetMapping("/deleteStudent")
	public String deleteStudent(@RequestParam("theId")int id)
	{
		new StudentService().deleteStudent(id);
		return "redirect:/showStudents";
	}
	
}
