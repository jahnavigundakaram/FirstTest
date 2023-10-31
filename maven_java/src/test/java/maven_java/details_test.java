package maven_java;

import static org.junit.Assert.*;
import org.junit.Test;

class details_test {

	@Test 
	public void test_details() { 
		boolean n = details.validate("Ram", "3025"); 
		System.out.println("1 Welcome");	
	} 
	
	@Test public void test_invaliddetails() { 
		boolean n = details.validate("Harsh", "SomePass"); 
		System.out.println("Not Authorized");
		}

}
