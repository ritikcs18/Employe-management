package com.example.employees.model;
import jakarta.persistence.*;
import java.time.LocalDate;
@Entity
public class Employee {
 @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String name;
 private String department;
 private String email;
 private Double salary;
 private LocalDate dateOfJoining;
 private LocalDate dateOfLeaving;
 private String aadharNumber;
 private String passportNumber;
 private String position;
 public Employee() {}
 public Employee(String n,String d,String e,Double s,LocalDate j,LocalDate l,String a,String p,String pos){
  this.name=n;this.department=d;this.email=e;this.salary=s;
  this.dateOfJoining=j;this.dateOfLeaving=l;this.aadharNumber=a;this.passportNumber=p;this.position=pos;
 }
 public Long getId(){return id;} public void setId(Long id){this.id=id;}
 public String getName(){return name;} public void setName(String v){this.name=v;}
 public String getDepartment(){return department;} public void setDepartment(String v){this.department=v;}
 public String getEmail(){return email;} public void setEmail(String v){this.email=v;}
 public Double getSalary(){return salary;} public void setSalary(Double v){this.salary=v;}
 public LocalDate getDateOfJoining(){return dateOfJoining;} public void setDateOfJoining(LocalDate v){this.dateOfJoining=v;}
 public LocalDate getDateOfLeaving(){return dateOfLeaving;} public void setDateOfLeaving(LocalDate v){this.dateOfLeaving=v;}
 public String getAadharNumber(){return aadharNumber;} public void setAadharNumber(String v){this.aadharNumber=v;}
 public String getPassportNumber(){return passportNumber;} public void setPassportNumber(String v){this.passportNumber=v;}
 public String getPosition(){return position;} public void setPosition(String v){this.position=v;}
}
