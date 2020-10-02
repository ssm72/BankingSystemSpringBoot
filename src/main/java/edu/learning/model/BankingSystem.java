package edu.learning.model;

public class BankingSystem {

	private int 	accNo;
	private String 	firstName;
	private String 	lastName;
	private double	balance;
	private String 	transType;
	private double	transAmt;
	private String 	accStatus;
	
	public BankingSystem() {
		super();
		// TODO Auto-generated constructor stub
	}

	private int getAccNo() {
		return accNo;
	}

	private void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	private String getFirstName() {
		return firstName;
	}

	private void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	private String getLastName() {
		return lastName;
	}

	private void setLastName(String lastName) {
		this.lastName = lastName;
	}

	private double getBalance() {
		return balance;
	}

	private void setBalance(double balance) {
		this.balance = balance;
	}

	private String getTransType() {
		return transType;
	}

	private void setTransType(String transType) {
		this.transType = transType;
	}

	private double getTransAmt() {
		return transAmt;
	}

	private void setTransAmt(double transAmt) {
		this.transAmt = transAmt;
	}

	private String getAccStatus() {
		return accStatus;
	}

	private void setAccStatus(String accStatus) {
		this.accStatus = accStatus;
	}
	
	
	
}
