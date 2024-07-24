public class User {
    private int userId;
    private String userName;

    // default constructor
    public User() {
    }

    // constructor wit 2 userArguments
    public User(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    // this is user if employee want to show UserId then this can be used.
    public int getUserId() {
        return userId;
    }

    // this is user if employee want to set userId then this can be used.
    public void setUserId(int userId) {
        this.userId = userId;
    }

    // this is user if employee want to showUserName then this can be used.
    public String getUserName() {
        return userName;
    }

    // // this is user if employee want to add userName then this can be used.
    public void setUserName(String userName) {
        this.userName = userName;
    }
}

class Employee extends User {
    double salary;

    // Employee constructor with 2 input
    public Employee(int id, String name) {
        super(id, name);
    }

    // Employee constructor with three input
    public Employee(int userId, String userName, double salary) {
        super(userId, userName);
        this.salary = salary;
    }

    // main method starts here
    public static void main(String[] args) {
        Employee emp = new Employee(1, "john", 2000);
        emp.calculateAnnualSalary();


    }

    // this is user if employee want to show salary when it will be used.
    public double getSalary() {
        return salary;
    }

    // this is user if employee want to add salary then this can be used.
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // this method calculate employee 12 month salary
    private void calculateAnnualSalary() {
        double yearSalary = salary * 12;
        empDetails();
        System.out.println("Your calculated 12 month salary: " + yearSalary);

    }

    // this method print employee all details
    private void empDetails() {
        System.out.print("Employee details \nid: " + getUserId() + "\nname: " + getUserName() + "\nsalary: " + getSalary() + " p.m." + "\n");

    }
}
