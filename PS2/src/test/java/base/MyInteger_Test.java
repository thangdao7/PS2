package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

//Set static constructors (c ; odd :: d ; even)
	static MyInteger c;
	static MyInteger d;
	
//Set static integers (evenNum ; even :: oddNum ; odd)	
	static int evenNum;
	static int oddNum;
//**************************************************************************************************
	

//Variables set before each @Test
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	c = new MyInteger(3);
	d = new MyInteger(4);
	evenNum = 4;
	oddNum = 13;
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
//**************************************************************************************************

	//Test isEven()
	@Test
	public void test_isEven_true(){
			assertTrue(d.isEven());
	}
	
	@Test
	public void test_isEven_false(){
			assertFalse(c.isEven());
	}
//**************************************************************************************************	

	//Test isOdd()
	@Test
	public void test_isOdd_true(){
			assertTrue(c.isOdd());
	}
	
	@Test
	public void test_isOdd_false(){
			assertFalse(d.isOdd());
	}
//**************************************************************************************************	

	//Test isPrime()
	@Test
	public void test_isPrime_true(){
			assertTrue(c.isPrime());
	}
	
	@Test
	public void test_isPrime_false(){
			assertFalse(d.isPrime());
	}
//**************************************************************************************************
	
	//Test isEven(int)
	@Test
	public void test_isEven_WithInt_true(){
			assertTrue(c.isEven(evenNum));
	}

	@Test
	public void test_isEven_WithInt_false(){
			assertFalse(c.isEven(oddNum));
	}
//**************************************************************************************************	

	//Test isOdd(int)
	@Test
	public void test_isOdd_WithInt_true(){
			assertTrue(c.isOdd(oddNum));
	}

	@Test
	public void test_isOdd_WithInt_false(){
			assertFalse(c.isOdd(evenNum));
	}
	
//**************************************************************************************************
	//Test isPrime(int)
	@Test
	public void test_isPrime_WithInt_true(){
			assertTrue(c.isPrime(oddNum));
	}

	@Test
	public void test_isPrime_WithInt_false(){
			assertFalse(c.isPrime(evenNum));
	}
	
//**************************************************************************************************	
	//Test isPrime(MyInteger)
	@Test
	public void test_isEven_WithMyInt_true(){
			assertTrue(d.isEven(d));
	}
	
	@Test
	public void test_isEven_WithMyInt_false(){
			assertFalse(c.isEven(c));
	}
	
//**************************************************************************************************
	//Test isOdd(MyInteger)
	@Test
	public void test_isOdd_WithMyInt_true(){
			assertTrue(c.isOdd(c));
	}

	@Test
	public void test_isOdd_WithMyInt_false(){
			assertFalse(d.isOdd(d));
	}
	
//**************************************************************************************************	
	//Test isPrime(MyInteger)
	@Test
	public void test_isPrime_WithMyInt_true(){
			assertTrue(c.isPrime(c));
	}
	
	@Test
	public void test_isPrime_WithMyInt_false(){
			assertFalse(d.isPrime(d));
	}
	
//**************************************************************************************************	
	//Test equals(int)
	@Test
	public void test_equals_true(){
			assertTrue(d.equals(evenNum));
	}
	
	@Test
	public void test_equals_false(){
			assertFalse(c.equals(evenNum));
	}

//**************************************************************************************************	
	//Test equals(MyInteger)
	@Test
	public void test_equals_WithMyInt_true(){
			assertTrue(d.equals(d));
	}

	@Test
	public void test_equals_WithMyInt_false(){
			assertFalse(c.equals(oddNum));
	}
}
