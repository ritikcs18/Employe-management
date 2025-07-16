package com.example.employees.service;
import com.example.employees.model.Employee;
import com.example.employees.repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class EmployeeService {
 private final EmployeeRepository repo;
 public EmployeeService(EmployeeRepository repo){this.repo=repo;}
 public List<Employee> listAll(){return repo.findAll();}
 public void save(Employee e){repo.save(e);}
 public Employee get(Long id){return repo.findById(id).orElse(null);}
 public void delete(Long id){repo.deleteById(id);}
}
