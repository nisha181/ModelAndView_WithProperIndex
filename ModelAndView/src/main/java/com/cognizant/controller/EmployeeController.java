package com.cognizant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cognizant.model.Employee;
import com.cognizant.service.EmployeeService;
import com.cognizant.service.EmployeeServiceImpl;

@Controller
public class EmployeeController {
    @Autowired
	EmployeeService es=new EmployeeServiceImpl();
   
 @RequestMapping(value="insert",method=RequestMethod.GET)
 public ModelAndView insertpage() {
	 ModelAndView mv=new ModelAndView("insert");
	 Employee e=new Employee();
	 mv.addObject("employee",e);
	 return mv;
 }
 @RequestMapping(value="insert",method=RequestMethod.POST)
 public ModelAndView insert(@ModelAttribute("employee") Employee e ) {
	 System.out.println("Model Attribute:"+e);
	 String res=es.insert(e);
		List<Employee> list = es.getAll();
		ModelAndView mv = new ModelAndView("getAll");
		mv.addObject("msg",res);
		mv.addObject("list",list);
		return mv;
 }
 @RequestMapping(value="/", method=RequestMethod.GET)
 public ModelAndView getAllpage() {
	 List<Employee> list=es.getAll();
	 System.out.println(list);
	 ModelAndView mv=new ModelAndView("getAll");
	 mv.addObject("list",list);
	 return mv;
 }
 @RequestMapping(value="update",method=RequestMethod.GET)
 public ModelAndView updatepage() {
	 ModelAndView mv=new ModelAndView("update");
	 Employee e=new Employee();
	 mv.addObject("employee",e);
	 return mv;
 }
 @RequestMapping(value="update",method=RequestMethod.POST)
 public ModelAndView update(@ModelAttribute("employee") Employee e) {
	 System.out.println(e);
	 String res=es.update(e);
		List<Employee> list = es.getAll();
		ModelAndView mv = new ModelAndView("getAll");
		mv.addObject("msg",res);
		mv.addObject("list",list);
		return mv; 
 }
 @RequestMapping(value="delete",method=RequestMethod.GET)
 public ModelAndView deletepage() {
	 ModelAndView mv=new ModelAndView("delete");
	 Employee e=new Employee();
	 mv.addObject("employee",e);
	 return mv;
 }
 @RequestMapping(value="delete",method=RequestMethod.POST)
 public ModelAndView delete(@ModelAttribute("employee") Employee e) {
	 System.out.println(e);
	 String res=es.delete(e);
		List<Employee> list = es.getAll();
		ModelAndView mv = new ModelAndView("getAll");
		mv.addObject("msg",res);
		mv.addObject("list",list);
		return mv;
 }
 
 
}
