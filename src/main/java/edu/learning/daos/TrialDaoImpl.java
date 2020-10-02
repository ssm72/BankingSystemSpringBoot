package edu.learning.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import edu.learning.model.Trial;
public class TrialDaoImpl implements TrialDao {
	private DataSource dataSource;

	public TrialDaoImpl() {
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void openAcc(Trial trail) {
		// TODO Auto-generated method stub
		// INSERT
		Connection con = null;
		PreparedStatement ppst = null;
		try {
			//Establish Connection
			con = dataSource.getConnection();
			
			//Prepare Query
			ppst = con.prepareStatement("INSERT INTO bank VALUES(?,CURRENT_TIMESTAMP,?,?,?,?,?,?,?)");
			ppst.setInt(1, 1001);
			ppst.setString(2, "John");
			ppst.setString(3, "Doe");
			ppst.setString(4, "Checking");
			ppst.setDouble(5, 1000.00);
			ppst.setString(6, "Open_Account");
			ppst.setDouble(7, 1000.00);
			ppst.setString(8, "Active");
			//Execute the query
			ppst.execute();
			System.out.println("Opened Account Successfully");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.print("Error Opening Account");
		}finally {
			try{
				ppst.close();
				con.close();
			}catch(Exception e) {
				e.printStackTrace();
				System.out.print("Error Closing Connection!!");
			}
		}
		
	}

	public void updateAcc(Trial trial) {
		// TODO Auto-generated method stub
		// UPDATE
	}

	public void withdraw(int accNo, double amt) {
		// TODO Auto-generated method stub
		// UPDATE

	}

	public void deposit(int accNo, double amt) {
		// TODO Auto-generated method stub
		// UPDATE
	}

	public void deleteAcc(int accNo) {
		// TODO Auto-generated method stub
		// UPDATE
	}

	public void transferAcc(int accOne, int accTwo) {
		// TODO Auto-generated method stub
		// UPDATE
	}

	public double getAccBal(int accNo) {
		// TODO Auto-generated method stub
		// SELECT
		return 0.00;
	}

	public String getAccStatus(int accNo) {
		// TODO Auto-generated method stub
		// SELECT
		return null;
	}

}
