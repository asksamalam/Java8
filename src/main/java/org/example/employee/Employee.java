package org.example.employee;

public class Employee{
    Long empId;
    Long salary;
    String department;

    public Employee(Long empId, Long salary, String department ) {
        this.empId = empId;
        this.salary = salary;
        this.department = department;
    }

    public String getDepartment(){
        return department;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }
}
