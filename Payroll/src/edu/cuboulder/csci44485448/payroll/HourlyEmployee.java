package edu.cuboulder.csci44485448.payroll;

public class HourlyEmployee extends Employee{

    private double hoursWorked;
    public HourlyEmployee(String name, double salary, int hoursWorked) {
        super(name, salary);
        this.hoursWorked=hoursWorked;
    }

    @Override
    public double getSalary() {
        return super.getSalary()*hoursWorked;
    }

    @Override
    public String toString() {
        return super.getName() + " " +getSalary();
    }
}
