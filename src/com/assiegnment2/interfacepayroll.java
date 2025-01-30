package com.assiegnment2;

import java.util.ArrayList;
import java.util.List;

public class interfacepayroll {
    public interface Payable {
        double calculatePay();
    }

    // Implement the Employee class
    public class Employee implements Payable {
        private String name;
        private double salary;

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        @Override
        public double calculatePay() {
            return salary;
        }

        public String getName() {
            return name;
        }
    }

    // Implement the Freelancer class
    public class Freelancer implements Payable {
        private String name;
        private double hoursWorked;
        private double hourlyRate;

        public Freelancer(String name, double hoursWorked, double hourlyRate) {
            this.name = name;
            this.hoursWorked = hoursWorked;
            this.hourlyRate = hourlyRate;
        }

        @Override
        public double calculatePay() {
            return hoursWorked * hourlyRate; // Pay based on hours worked and hourly rate
        }

        public String getName() {
            return name;
        }
    }
}
