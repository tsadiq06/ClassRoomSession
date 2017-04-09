package testcases;

import org.junit.Test;

import wrappers.GenericWrappers;

public class Login extends GenericWrappers {

	@Test
	public void login() throws Exception{
		
		invokeApp("chrome", "http://leaftaps.com");
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		//clickByClassName("decorativeSubmit");
		
		clickByLink("CRM/SFA");
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName","Apple");
		enterById("createLeadForm_firstName","SteveJobs6");
		enterById("createLeadForm_lastName","Jobs");
		
		clickById("createLeadForm_dataSourceId");
		
		//selecting dropdown
		selectVisibileTextById("createLeadForm_dataSourceId", "Employee");
		
		
		clickByClassName("smallSubmit");
		
		
		
	}
	
}
