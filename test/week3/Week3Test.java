package week3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Week3Test {
	
	@Test
	public void testMax() {
		assertEquals(3,Week3.max(-10,3));
		assertEquals(0,Week3.max(-5,0));
		assertEquals(3,Week3.max(2,3));
		assertEquals(4,Week3.max(4,-9));
		assertEquals(1,Week3.max(1,1));
		assertEquals(-10,Week3.max(-10,-10));
	}
	
	@Test
	public void testMinOfArray() {
		int array[]= {1,2,3,-3,0};
		assertEquals(-3,Week3.minOfArray(array));
		int array1[] = {10,20,30,40,2,-10};
		assertEquals(-10,Week3.minOfArray(array1));
		int array2[]= {-3,4,5,-2,0,1,3};
		assertEquals(-3,Week3.minOfArray(array2));
		int array3[]= {1,1,1,1,1,1,1,1,0};
		assertEquals(0,Week3.minOfArray(array3));
		int array4[]= {-10,-10,20,-10,2};
		assertEquals(-10,Week3.minOfArray(array4));
	}
	
	@Test
	public void testCalculateBMI() {
		assertEquals("Binh thuong",Week3.calculateBMI(40,1.4));
		assertEquals("Thieu can",Week3.calculateBMI(40,1.5));
		assertEquals("Beo phi",Week3.calculateBMI(60,1.4));
		assertEquals("Binh thuong",Week3.calculateBMI(50,1.5));
		assertEquals("Thua can",Week3.calculateBMI(60,1.6));
	}
		
}
