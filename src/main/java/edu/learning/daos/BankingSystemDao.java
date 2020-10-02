package edu.learning.daos;

import edu.learning.model.BankingSystem;
public interface BankingSystemDao {
	public void openAcc(BankingSystem trial);
	public void updateAcc(BankingSystem trial);
	public void withdraw(int accNo, double amt);
	public void deposit(int accNo, double amt);
	public void deleteAcc(int accNo);
	public void transferAcc(int accOne, int accTwo);
	public double getAccBal(int accNo);
	public String getAccStatus(int accNo);
}
