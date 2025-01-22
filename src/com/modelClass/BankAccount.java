package com.modelClass;

public class BankAccount {
    //Fields
    public String accountholder;
    public double balance;

    //Constructor for Bank Account
    public BankAccount(String accountholder, double balance)
    {
        this.accountholder = accountholder;
        this.balance = balance;
    }

    //Function for Depositing ammount in bank
    public void Deposit(double amount)
    {
        if (amount > 0)
        {
            balance += amount;
        }
        else
        {
            System.out.println("Please enter the amount greater than zero!");
        }
    }

    //Function for withdrawing ammount in bank
    public boolean Withdraw(double amount)
    {
        if (amount > 0 && amount<=balance)
        {
            balance -= amount;
            return true;
        }
        else
        {
            System.out.println("Please enter the amount greater than zero less than ypur current balance ( " + balance + " )");
            return false;
        }
    }
    //Getter for the balance amount
    public double GetBalance() { return balance;}
}
