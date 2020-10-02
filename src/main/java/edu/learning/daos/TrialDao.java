package edu.learning.daos;

import edu.learning.model.Trial;
public interface TrialDao {
	public void openAcc(Trial trial);
	public void updateAcc(Trial trial);
	public void withdraw(int accNo, double amt);
	public void deposit(int accNo, double amt);
	public void deleteAcc(int accNo);
	public void transferAcc(int accOne, int accTwo);
	public double getAccBal(int accNo);
	public String getAccStatus(int accNo);
}
