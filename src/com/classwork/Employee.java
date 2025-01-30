package com.classwork;

public class Employee {
    abstract class employees{
        private String name;
        private double salary;

        public employees(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }
        public String getDetails() {
            return "Name: " + name + ", Salary: " + salary;
        }
    }
    class Manager extends employees{
        private int teamsize;

        public Manager(String name, double salary,int teamsize ){
            super(name,salary);
            this.teamsize=teamsize;
        }
        @Override
        public String getDetails(){
            return super.getDetails() + ", Teamsize: " + teamsize;
        }
    }
    class Intern extends employees{
        private String universityname;

        public Intern(String name, double salary,String universityname ){
            super(name,salary);
            this.universityname=universityname;
        }
        @Override
        public String getDetails(){
            return super.getDetails() + ", University Name: " + universityname;
        }
    }
}
