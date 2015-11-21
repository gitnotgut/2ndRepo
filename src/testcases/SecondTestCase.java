package testcases;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assume;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class SecondTestCase {
	
	
	public static boolean checkLogin(){
		
		return false; // true when successful and false when failure
	}
	
	
	@BeforeClass
	public static void beginning(){
		
		System.out.println("**************beginning**************");
		//Assume.assumeTrue(checkLogin());
	}
	
	@AfterClass
	public static void ending(){
		
		System.out.println("***************closing***************");
	}
	
	
	@After
	public void closeBrowser(){
		
		System.out.println("Closing Browser");
	}
	
	@Before
	public void openBrowser(){
		
		System.out.println("Opening Browser");
	}
	
	
	@Test
	public void sendEmailTest(){
		
		System.out.println("Testing Sending Email");
	}
	
	@Test
	public void sendMessageTest(){
		
		System.out.println("Testing Sending Message");
	}

}
