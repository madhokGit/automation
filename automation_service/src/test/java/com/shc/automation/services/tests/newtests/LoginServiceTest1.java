package com.shc.automation.services.tests.newtests;

import static org.testng.Assert.assertEquals;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import com.shc.annotations.TestOwner;
import com.shc.automation.services.impl.LoginServiceImpl;
import com.shc.utils.*;
import com.shc.utils.TestUtils.TestStepType;

public class LoginServiceTest1 {
	private LoginServiceImpl service;
			
	@TestOwner("smadhok")
	@Test(groups={"loginFailureTestGroup"})
	public void testUserFailureLoginScenario()
	{
		service = new LoginServiceImpl();
		Logger.log("Verify username and password: ", TestStepType.VERIFICATION_STEP);
		Logger.log("Invalid username/password ", TestStepType.VERIFICATION_RESULT);
		assertEquals(service.login("smadhok", "hello2"), true,"UserName/Password incorrect...");
		
		
	}
	
}
