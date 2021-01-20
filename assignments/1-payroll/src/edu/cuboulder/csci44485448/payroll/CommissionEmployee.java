package edu.cuboulder.csci44485448.payroll;

public class CommissionEmployee extends Employee{
    private double percent;
    public CommissionEmployee(String name, double salary, double percentRecieved) {
        super(name, salary);
        this.percent=percentRecieved;
    }

    @Override
    public double getSalary() {
        return super.getSalary()*this.percent*.01;
    }

    @Override
    public String toString() {
        return super.getName() + " " +getSalary();
    }
}
