package testcases;
import junit.framework.Assert;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;


public class UnderstandingAssertions {
	
	@Rule
	public ErrorCollector errCollector = new ErrorCollector();
	
	@Test
	public void testFriendListFacebook(){
		
		int expected_list = 100; // generally comes from xls file
		int actual_list = 101; // generally comes from selenium code
		
		/*
		if(expected_list == actual_list){
			
			System.out.println("PASS");
		}else{
			
			System.out.println("FAIL");
			// report the error
		}*/
		
		System.out.println("A");
		try{
			Assert.assertEquals(expected_list, actual_list);
		}catch(Throwable t){
			System.out.println("ERROR ENCOUNTERED");
			errCollector.addError(t);
		}
		System.out.println("B");
		
	}

}
