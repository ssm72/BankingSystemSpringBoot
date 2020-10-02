package edu.learning.config;

import javax.sql.DataSource;

//import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import edu.learning.daos.TrialDao;
import edu.learning.daos.TrialDaoImpl;

@Configuration
public class BankingSystemConfig {
	@Bean
	public DataSource dataSource() {
		// BasicDataSource bds = new BasicDataSource();
		DriverManagerDataSource bds = new DriverManagerDataSource();
		bds.setDriverClassName("com.mysql.jdbc.Driver");
		bds.setUrl("jdbc:mysql://localhost:3306/onlineitguru");
		bds.setUsername("root");
		bds.setPassword("password");
		return bds;
	}

	@Bean(name = "trialdao", autowire = Autowire.NO)
	public TrialDao trialDao(DataSource ds) {
		TrialDaoImpl td = new TrialDaoImpl();
		td.setDataSource(ds);
		return td;
	}

}
