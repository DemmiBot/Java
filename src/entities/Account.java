package entities;

public class Account {
	private int accountId;
	private String accountName;
	private double balance;
	
	/*Construtores*/
	
	public Account(int accountId, String accountName, double initialDeposit){
		this.accountId = accountId;
		this.accountName = accountName;
		Deposit(initialDeposit);
	}
	
	public Account(int accountId, String accountName){
		this.accountId = accountId;
		this.accountName = accountName;
	}
	
	/*getters e setters */
	
	public int getAccountNumber() {
		return accountId;
	}
	
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	
	public String getAccountName() {
		return accountName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	/* Funcoes de saldo */
	
	public void Withdraw(double value) {
		balance -= value + 5.0;
	}
	public void Deposit(double value) {
		balance += value;
	}
	
	public String toString() {
		return String.format("Account ID: %d\nHolder: %s\nAccount balance: %.2fBTC\n", accountId, accountName, balance);
	}
	
}