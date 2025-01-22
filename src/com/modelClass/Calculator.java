package com.modelClass;

public class Calculator {
    //private field for result
    private double result;

    //Function to add the two numbers and get the result
    public double Add(double a,double b){
        result=a+b;
        return result;
    }

    //Function to subtract the two numbers and get the result
    public double Sub(double a,double b){
        result=a-b;
        return result;
    }

    //Function to multiply the two numbers and get the result
    public double Multiply(double a,double b){
        result=a*b;
        return result;
    }

    //Function to divide the two numbers and get the result
    public double Div(double a,double b){
        result=a/b;
        //give the message and displays 0 if the b is 0
        if(b==0){
            result=0;
            System.out.println("Can't Divide by 0 ");
            return result;
        }
        else{
            return result;
        }
    }
}
