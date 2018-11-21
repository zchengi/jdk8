package com.cheng.jdk8.function;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * @author cheng
 *         2018/11/18 19:43
 */
public class OptionalTest2 {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setName("cheng");

        Employee employee2 = new Employee();
        employee.setName("zhi");

        Company company = new Company();
        company.setName("haoqi");
//        company.setEmployees(Arrays.asList(employee, employee2));

        List<Employee> list = company.getEmployees();
        Optional<Company> optional = Optional.ofNullable(company);
//        optional.map(theCompany -> theCompany.getEmployees()).orElse(Collections.emptyList());
        System.out.println(optional.map(Company::getEmployees).orElse(Collections.emptyList()));
    }
}


class Employee {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Company {

    private String name;

    private List<Employee> employees;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
