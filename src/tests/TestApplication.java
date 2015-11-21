package tests;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assume;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


public class TestApplication {
	
	
	@AfterClass
	public static void closeDown(){
		
		Assume.assumeTrue(false);
		System.out.println("Closing the test environment");
		
	}
	
	@Before
	public void openBrowser(){
		
		
		System.out.println("Opening Browser");
		
		
	}
	
	@After
	public void closeBrowser(){
		
		
		System.out.println("Closing Browser");
		
		
	}
	
	//@Ignore
	@Test
	public void testLoginTest(){
		
		
		System.out.println("Testing Login");
		
		
	}
	
	
	@Test
	public void testRegistrationTest(){
		
		System.out.println("Testing registration");
	}
	
	@BeforeClass
	public static void init(){
		
		
		System.out.println("Initializing Test Environment");
		
	}
	
	

}
