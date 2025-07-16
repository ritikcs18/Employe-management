package com.example.employees.controller;
import com.example.employees.model.Employee;
import com.example.employees.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller
public class EmployeeController {
 private final EmployeeService service;
 public EmployeeController(EmployeeService service){this.service=service;}
 @GetMapping("/") public String home(Model m){m.addAttribute("listEmployees",service.listAll());return "index";}
 @GetMapping("/new") public String newForm(Model m){m.addAttribute("employee",new Employee());return "new_employee";}
 @PostMapping("/save") public String save(@ModelAttribute Employee e){service.save(e);return "redirect:/";}
 @GetMapping("/edit/{id}") public String edit(@PathVariable Long id,Model m){m.addAttribute("employee",service.get(id));return "edit_employee";}
 @PostMapping("/update/{id}") public String update(@PathVariable Long id,@ModelAttribute Employee e){
  Employee ex=service.get(id);
  if(ex!=null){
    ex.setName(e.getName());ex.setDepartment(e.getDepartment());ex.setEmail(e.getEmail());ex.setSalary(e.getSalary());
    ex.setDateOfJoining(e.getDateOfJoining());ex.setDateOfLeaving(e.getDateOfLeaving());
    ex.setAadharNumber(e.getAadharNumber());ex.setPassportNumber(e.getPassportNumber());ex.setPosition(e.getPosition());
    service.save(ex);
  }
  return "redirect:/";
 }
 @GetMapping("/delete/{id}") public String delete(@PathVariable Long id){service.delete(id);return "redirect:/";}
}
