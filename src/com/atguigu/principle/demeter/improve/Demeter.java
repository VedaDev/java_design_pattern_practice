package com.atguigu.principle.demeter.improve;

import java.util.ArrayList;
import java.util.List;

public class Demeter {

    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());
    }
}

class Employee {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String id;

}

class SchoolManager {
    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<>();

        for(int i = 0; i < 5; i++) {
            Employee emp = new Employee();
            emp.setId("id" + i);
            list.add(emp);
        }
        return list;
    }

    void printAllEmployee(CollegeManager sub) {
        sub.getAllCollegeEmployee();

        List<Employee> list2 = this.getAllEmployee();
        System.out.println("-----total employees at school");
        for(Employee e :list2) {
            System.out.println(e.getId());
        }
    }
}

class CollegeEmployee {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String id;
}

class CollegeManager {
    public List<CollegeEmployee> getAllEmployee() {
        List<CollegeEmployee> list = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("id" + i);
            list.add(emp);
        }
        return list;
    }

    public void getAllCollegeEmployee() {
        List<CollegeEmployee> list1 = this.getAllEmployee();

        // this is a problem
        System.out.println("----feng company employee");
        for(CollegeEmployee e : list1) {
            System.out.println(e.getId());
        }
    }
}
