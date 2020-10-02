package edu.learning.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.learning.config.BankingSystemConfig;
import edu.learning.daos.TrialDao;
import edu.learning.model.Trial;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = BankingSystemConfig.class)

public class TrialTest {
	@Autowired
	ApplicationContext context;
	
	@Test
	public void trailTest() {

		System.out.println("Successw");
		TrialDao td = (TrialDao)context.getBean("trialdao");

		System.out.println("Success1");
		Trial tr = new Trial();
		
		td.openAcc(tr);
		
		System.out.println("Success");
	}
}
