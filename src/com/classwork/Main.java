package com.classwork;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        getValidintedInt.getValidatedInt(scanner,"Enetr an int","Error try again",0,10);
        scanner.close();
    }
}
