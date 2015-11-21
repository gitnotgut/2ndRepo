package testcases;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;



@RunWith(Parameterized.class)
public class ParameterizedTestCase {

	
	String userName;
	String password;
	int pin;
	
	public ParameterizedTestCase(String userName, String password, int pin){
		
		System.out.println("Inside Constructor");
		this.userName = userName;
		this.password = password;
		this.pin = pin;
	}
	
	@Parameters
	public static Collection<Object []> getData(){
		
		
		System.out.println("Inside Parameters");
		Object[][] data = new Object[2][3];
		
		data[0][0] = "testuser1";
		data[0][1] = "password1";
		data[0][2] = 123;
		
		data[1][0] = "testuser2";
		data[1][1] = "password2";
		data[1][2] = 1234;
		
		return Arrays.asList(data);
		
	}
	
	
	@Test
	public void testRegister(){
		
		System.out.println("Testing registering the user with "+userName+" -- "+password+" -- "+pin);
	}
	
	
	
}
