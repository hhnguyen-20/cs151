package org.example.exercise1;

import java.util.Arrays;
import java.util.List;

public class Employee {
    private String firstName;
    private String lastName;

    private float salary;

    public Employee(String firstName, String lastName, float salary, Company company) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.company = company;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public float getSalary() {
        return salary;
    }

    public Company getCompany() {
        return company;
    }

    private Company company;

    public static void main(String[] args) {
        Company apple = new Company("Apple", "Cupertino, CA");
        Company amazon = new Company("Amazon", "Seattle, WA");
        Company adobe = new Company("Adobe", "San Jose, CA");
        Company google = new Company("Google", "Mountain View, CA");
        Company microsoft = new Company("Microsoft", "Redmond, WA");
        Company facebook = new Company("Meta", "Menlo Park, CA");

        List<Company> companies = Arrays.asList(apple, amazon, adobe, google, microsoft, facebook);

        Employee e1 = new Employee("Alex", "Smith", 100000, apple);
        Employee e2 = new Employee("John", "Doe", 90000, adobe);
        Employee e3 = new Employee("Emily", "Johnson", 95000, google);
        Employee e4 = new Employee("Michael", "Brown", 85000, apple);
        Employee e5 = new Employee("Sarah", "Williams", 88000, amazon);
        Employee e6 = new Employee("Alex", "Smith", 100000, apple);
        Employee e7 = new Employee("John", "Doe", 90000, microsoft);
        Employee e8 = new Employee("Emily", "Johnson", 95000, google);
        Employee e9 = new Employee("Michael", "Brown", 85000, facebook);
        Employee e10 = new Employee("Sarah", "Williams", 88000, amazon);
        Employee e11 = new Employee("Alex", "Johnson", 92000, google);
        Employee e12 = new Employee("John", "Smith", 87000, apple);
        Employee e13 = new Employee("Emily", "Doe", 92000, microsoft);
        Employee e14 = new Employee("Michael", "Smith", 91000, apple);
        Employee e15 = new Employee("Sarah", "Brown", 89000, facebook);
        Employee e16 = new Employee("John", "Doe", 120000, adobe);

        List<Employee> employees = Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13,e14,e15,e16);

        // TODO 1: Override the toString() method in Employee and Company

        // TODO 2: Sort the employees list by:
        // 1. Fisrt Name - Ascending
        // 2. Last Name - Ascending
        // 3. Salary - Descending
        // and print the employee details using a foreach loop

        // TODO 3: Sort the companies by
        // 1. Name - Ascending
        // 2. Address - Ascending based on the state
        // and print the company details using a foreach loop

        // TODO 4: Sort the employees by
        // 1. First Name - Ascending
        // 2. Company Name - Descending
        // and print the employee AND company details using a foreach loop

        // TODO 5: Which design pattern did you just use?

    }
}

class Company {

    private String name;
    private String address;

    public Company(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
