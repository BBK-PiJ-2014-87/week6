package Arrays;

import static org.junit.Assert.*;

import org.junit.Test;


public class TestArrayCopier {

	@Test
	public void testEqualArrays() {
		int[] src = {22,33,44,55,66};
		int[] dst = new int[5];
		ArrayCopier ar = new ArrayCopier(src, dst);
		ar.run();
		int[] output = ar.getNewArray();
		int[] expected = {22,33,44,55,66};
		assertArrayEquals(output, expected);
	}
	
	@Test
	public void testOneSizeArray() {
		int[] src = {22};
		int[] dst = new int[1];
		ArrayCopier ar = new ArrayCopier(src, dst);
		ar.run();
		int[] output = ar.getNewArray();
		int[] expected = {22};
		assertArrayEquals(output, expected);
	}
	
	@Test
	public void testLongerArray() {
		int[] src = {1,2,3,4,5,6};
		int[] dst = new int[4];
		ArrayCopier ar = new ArrayCopier(src, dst);
		ar.run();
		int[] output = ar.getNewArray();
		int[] expected = {1,2,3,4};
		assertArrayEquals(output, expected);
	}
	
	@Test
	public void testShorterArray() {
		int[] src = {1,2,3,4};
		int[] dst = new int[6];
		ArrayCopier ar = new ArrayCopier(src, dst);
		ar.run();
		int[] output = ar.getNewArray();
		int[] expected = {1,2,3,4,0,0};
		assertArrayEquals(output, expected);
	}

}
