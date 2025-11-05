package org.example.employee;

import java.util.*;
import java.util.stream.Collector;

public class CompanyApplication {
    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
                new Employee(1L,25000L,"Sales"),
                new Employee(2L,35000L,"Sales"),
                new Employee(3L,55000L,"Marketing"),
                new Employee(4L,75000L,"HR"),
                new Employee(5L,15000L,"Marketing"),
                new Employee(6L,95000L,"HR")
        );

        //Find all employees whose salary is greater than 50,000.
        List<Employee> employees = empList.stream().filter(e -> e.getSalary() > 50000L).toList();
        employees.forEach(e -> System.out.println(e.getEmpId() +" | "+ e.getSalary()));

        //Get a list of all department names.
        List<String> distinctDepartment = empList.stream().map(Employee::getDepartment).distinct().toList();
        System.out.println(distinctDepartment);

        //Count employees working in the “HR” department.
        Long empCount = empList.stream().filter(e -> e.getDepartment().equals("HR")).count();
        System.out.println("Number of Employee work in HR : " + empCount);

        //Sort ASC employees by salary (ascending).
        List<Employee> ascEmps = empList.stream()
                .sorted(Comparator.comparingLong(Employee::getSalary)
        ).toList();
        ascEmps.stream().forEach(e -> System.out.print(e.getEmpId() +" "+ e.getSalary()));

        //Sort ASC employees by salary (ascending/descending).
        List<Employee> descEmps = empList.stream()
                .sorted(Comparator.comparingLong(Employee::getSalary).reversed()).toList();
        descEmps.forEach(e -> System.out.print(e.getEmpId() +" : "+e.getSalary()));


    }
}
