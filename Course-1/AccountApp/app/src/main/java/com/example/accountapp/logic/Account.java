package com.example.accountapp.logic;

import com.example.accountapp.ui.OutputInterface;

/**
 * This file defines the Account class.  It provides the basis for a
 * series of improvements you'll need to make as you progress through
 * the lessons in Module 6.
 */
public class Account {
    /**
     * This is the variable that stores our OutputInterface instance.
     * <p/>
     * This is how we will interact with the User Interface
     * [MainActivity.java].
     * </p>
     * This was renamed to 'mOut' from 'out', as it is in the video
     * lessons, to better match Android/Java naming guidelines.
     */
    LogicInterface mLogic;
    OutputInterface mOut;

    /**
     * Name of the account holder.
     */
     private String name;

    /**
     * Number of the account.
     */
    private int number;

    /**
     * Current balance in the account.
     */
    private double balance;

    /**
     * Constructor initializes the field
     */
//    public Account(OutputInterface out) {
//        mOut = out;
//    }
    public Account(String newName) {
        name = newName;
        number = buildAcctnumber();
    }
    public Account(String newName, double initialBalance) {
        this(newName);
        balance = initialBalance;
    }

    /**
     * Deposit @a amount into the account.
     */
    public void deposit(double amount) {
        balance += amount;
    }

    /**
     * Withdraw @a amount from the account.  Prints "Insufficient
     * Funds" if there's not enough money in the account.
     */
//    public void withdrawal(double amount) {
//        if (balance > amount)
//            balance -= amount;
//        else
//            mOut.println("Insufficient Funds");
//    }

    public boolean withdrawal(double amount){
        if(balance>amount){
            balance = balance - amount;
            return (true);
        }
        else{
            return (false);
        }
    }

    /**
     * Display the current @a amount in the account.
     */
    public void displayBalance() {
        mOut.println("The balance on account " 
                     + number
                     + " is " 
                     + balance);
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Account{" +
                "mOut=" + mOut +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", balance=" + balance +
                '}';
    }
}
