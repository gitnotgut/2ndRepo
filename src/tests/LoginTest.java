package tests;
import junit.framework.Assert;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;


public class LoginTest {
	
	@Rule
	public ErrorCollector errCol = new ErrorCollector();
	
	@Test
	public void testAppTest(){
		
		
		/*System.out.println("A");
		Assert.assertEquals("Hello", "Hello123");
		System.out.println("B");*/
		
		
		System.out.println("A");
		
		try{
			
			Assert.assertEquals("Hello", "Hello");
			System.out.println("First error");
			Assert.assertTrue("error message", 3<1);
		}catch(Throwable t){
			
			//code to report the error
			errCol.addError(t);
			
			System.out.println("Error");
		}
		System.out.println("B");
		
		try{
		Assert.assertTrue("Link not present", true);
		}catch(Throwable t){
			errCol.addError(t);
		}
		System.out.println("Ending");
		
		
		
		
		
	}

}
