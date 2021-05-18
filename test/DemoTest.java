import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DemoTest {

	@Test
	void testCompareString() {
		Demo demo = new Demo();
		// "Hello" vs. "hello" => true
		assertTrue(demo.compareString("Hello", "helLo"));
		
		// "Hello" vs "World" => false
		assertFalse(demo.compareString("Hello", "World"), "Hello != World");
		
		// "String" vs. "STRING" => true
		assertTrue(demo.compareString("String", "STRING"), "String == STRING is failing");
	}

	@Test
	void testConcatenateString() {
		Demo demo = new Demo();
		
		// "Hello" + "World" == "HelloWorld"
			assertEquals("HelloWorld", demo.concatenateString("Hello", "World"));
		
		
		// "Hello" + "World" != "helloworld"
		assertNotEquals("helloworld", demo.concatenateString("Hello", "World"), "Capital and small cases");
	}
	
	@Test
	void testAddOne2Array() {
		Demo demo = new Demo();
		
		// {1,2,3,4,5} => {2,3,4,5,6}
		assertArrayEquals(new int[] {2,3,4,5,6}, demo.addOne2Array(new int[] {1,2,3,4,5}));
		
		// {-1, 0, 1} => {0, 1, 2}
		assertArrayEquals(new int[] {0,1,2}, demo.addOne2Array(new int[] {-1,0,1}));
	
	}

}
