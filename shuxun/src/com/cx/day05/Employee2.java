package com.cx.day05;
/*
(Employee)员工类：包含工号(no)、姓名(name)、基本薪资(salary)，通过构造方法给属性赋值，计算月薪的方法   double calcSal(Employee emp);
 */
public class Employee2 {
    int no;
    String name;
    int salary;
    int found ;

    public Employee2(int no, String name, int salary) {
        this.no = no;
        this.name = name;
        this.salary = salary;
    }
    public double calcSal(Employee2 emp){
        return emp.salary+emp.found;

    }
}
