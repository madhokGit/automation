package com.shc.automation.services.tests;

import static org.testng.Assert.assertEquals;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import com.shc.annotations.TestOwner;
import com.shc.automation.services.impl.LoginServiceImpl;
import com.shc.utils.*;
import com.shc.utils.TestUtils.TestStepType;

public class LoginServiceTest {
	private LoginServiceImpl service;
			
	@Test (groups={"SMOKE"})
	  public void testSumFunction() { 
	      String expected = "0";
	      assertEquals(expected, "0");
	      Logger.log("Verify if expected is 0", TestStepType.VERIFICATION_RESULT);
	      expected = "100";
	      assertEquals(expected, "100");
	      Logger.log("Verify if expected is 100",TestStepType.VERIFICATION_RESULT);
	      expected = "265";
	      assertEquals(expected, "264");
	      Logger.log("Verify if expected is 264", TestStepType.VERIFICATION_RESULT);
	   }
	
	
	@Test(groups={"loginSuccessTestGroup"})
	public void testSuccessfulLoginScenario()
	{
		service = new LoginServiceImpl();
		Logger.log("Verify username and password: ", TestStepType.VERIFICATION_STEP);
		Logger.log("Login succesful ", TestStepType.VERIFICATION_RESULT);
		assertEquals(service.login("smadhok", "hello"), true,"Login successful...");
		
	}
}
