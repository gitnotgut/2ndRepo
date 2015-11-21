package tests;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class SecondTest {
	
	public String bankName;
	public int accNum;
	
	public SecondTest(String bankName,int accNum){
		
		System.out.println("Calling Constructor");
		this.bankName = bankName;
		this.accNum = accNum;
		
	}
	
	@Test
	public void checkBalanceTest(){
		
		System.out.println("Executing the test with "+bankName+" -- "+accNum);
	}
	
	@Parameters
	public static Collection<Object []> getData(){
		
		System.out.println("In parameters method");
		Object data[][] = new Object[2][2];
		
		//1st row
		data[0][0] = "HSBC";
		data[0][1] = 1234;
		
		//2nd row
		data[1][0] = "CITI";
		data[1][1] = 2222;
		
		return Arrays.asList(data);
		
	}

}
