package base;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {
// set a value used to test
	MyInteger i;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		 // give i a value before test
		MyInteger i = new MyInteger(17);
		 
	}
// test i as MyInteger to see if it is even	   
	public void testisEven(MyInteger i){
	    	boolean a = i.isEven();
	    	assertEquals(false,a);
	    }
// test i as MyInteger to see if it is odd	 
	public void testisOdd(MyInteger i){
    	boolean a = i.isEven();
    	assertEquals(true,a);
    }
// test i as MyInteger to see if it is prime	 	
	public void testisPrime(MyInteger i){
    	boolean a = i.isEven();
    	assertEquals(true,a);
    }
// test i is equal to the given value	
	public void testequals(MyInteger i){
		boolean a = i.equals(i);
		assertEquals(true,a);
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		// clear i's value
		MyInteger i = null;
	
	}
 
	
	
	@Before
	public void setUp() throws Exception {
		// set i's value to 18
		int i = 18;
	}
	// test if isEven works when iValue is 18
   public void testisEven(){
	   boolean b = i.isEven();
	   assertEquals(true,b);
   }
   // test if isOdd works when iValue is 18
   public void testisOdd(){
	   boolean b = i.isOdd();
	   assertEquals(false,b);
   }
  // test if isPrime works when iValue is 18  
   public void testisPrime(){
	   boolean b = i.isPrime();
	   assertEquals(false,b);
   }
   

	@After
	public void tearDown() throws Exception {
		
	}


}
