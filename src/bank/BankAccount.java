package bank;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class BankAccount{
    private String name;
    private String accountNumber;
    private float balance;
    private List<String> transactions;
    private boolean isClosed;
    private String dateCreated;
    private String dateClosed;

    public BankAccount(String name){
        this.name = name;
        this.accountNumber = Integer.toString(new Random().nextInt(1000,9999));
        this.balance = 0;
        this.transactions = new LinkedList<>();
        this.isClosed = false;
        this.dateCreated = "";
        this.dateClosed = "";
    }

    public BankAccount(String name, float balance){
        this.name = name;
        this.accountNumber = Integer.toString(new Random().nextInt(1000,9999));
        this.balance = balance;
        this.transactions = new LinkedList<>();
        this.isClosed = false;
        this.dateCreated = "";
        this.dateClosed = "";
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public float getBalance() {
        return balance;
    }

    public List<String> getTransactions() {
        return transactions;
    }

    public boolean isAccountClosed() {
        return isClosed;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public String getDateClosed() {
        return dateClosed;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void setTransactions(List<String> transactions) {
        this.transactions = transactions;
    }

    public void setAccountClosed(boolean accountClosed) {
        this.isClosed = accountClosed;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setDateClosed(String dateClosed) {
        this.dateClosed = dateClosed;
    }

    // Methods

    public void deposit(float amount){
        if (amount > 0 && !isClosed){
            this.transactions.add(String.format("deposit $%.2f at %s", amount, LocalDateTime.now()));
            this.balance += amount;

        } else {
            throw new IllegalArgumentException("Amount incorrect or account is closed");
        }

    }

    public void withdraw(float amount){
        if (amount > 0 && !isClosed){
            if(this.balance >= amount){
                this.transactions.add(String.format("withdraw $%.2f at %s", amount, LocalDateTime.now()));
                this.balance -= amount;
            } else {
                System.out.println("Insufficient funds in account");
            }
        } else {
            throw new IllegalArgumentException("Incorrect amount or account closed\n");
        }

    }
    
}