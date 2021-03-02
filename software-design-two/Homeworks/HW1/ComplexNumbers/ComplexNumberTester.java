import static org.junit.Assert.*;
import org.junit.*;

public class ComplexNumberTester{
	
	//test fixture
	private ComplexNumber n1;
	private ComplexNumber n2; 
	private ComplexNumber n3;
	private ComplexNumber n4;
	private ComplexNumber n5; 
	
	@Before
	public void setup(){
		n1 = new ComplexNumber(2.5f,3.2f);
		n2 = new ComplexNumber(17.3f,14.5f);
		n3 = new ComplexNumber(-25.1f,15.3f);
		n4 = new ComplexNumber(-2.2f,4.8f);
		n5 = new ComplexNumber(3.4f,5.6f);
		
	}
	
	@Test
	public void testConstruction(){
		assertTrue(2.5f==n1.getA());
		assertTrue(3.2f == n1.getB());
	}
	
	@Test
	public void testEquals(){
		ComplexNumber n6 = new ComplexNumber(-2.2f,4.8f);
		assertTrue(n4.equals(n6));
	}
	
	@Test 
	public void testString(){
		System.out.print(n1.toString());
	}
	
	@Test 
	public void testAddition(){
		ComplexNumber tempNum = new ComplexNumber(19.8f,17.7f);
		assertEquals(tempNum.getA(), n1.add(n2).getA(), 0.01);
		assertEquals(tempNum.getB(), n1.add(n2).getB(), 0.01);
	}
	
	@Test 
	public void testSubtraction(){
		ComplexNumber tempNum = new ComplexNumber(-22.9f,10.5f);
		assertEquals(tempNum.getA(), n3.subtract(n4).getA(), 0.01);
		assertEquals(tempNum.getB(), n3.subtract(n4).getB(), 0.01);
	}
	
	@Test 
	public void testMultiply(){
		ComplexNumber tempNum = new ComplexNumber(-34.36f,4.0f);
		assertEquals(tempNum.getA(), n4.multiply(n5).getA(), 0.01);
		assertEquals(tempNum.getB(), n4.multiply(n5).getB(), 0.01);
	}
	
	@Test
	public void testDivision(){
		boolean testException = false;
		ComplexNumber badNum = new ComplexNumber(0,0);
		
		try{
			n5.divide(badNum);
		}
		catch(ArithmeticException a){
			testException = true;
		}
		
		assertTrue(testException); 
		
		ComplexNumber tempNum = new ComplexNumber(5.44f,-1.16f);
		assertEquals(tempNum.getA(), n2.divide(n1).getA(),0.01);
		assertEquals(tempNum.getB(), n2.divide(n1).getB(),0.01);
	}
}










