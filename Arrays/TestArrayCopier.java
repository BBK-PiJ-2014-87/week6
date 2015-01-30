package Arrays;

import static org.junit.Assert.*;

import org.junit.Test;

import recursionTest.PaperSize;

public class TestArrayCopier {

	@Test
	public void testEqualArrays() {
		int[] src = {22,33,44,55,66};
		int[] dst = new int[5];
		ArrayCopier ar = new AraryCopier(src, dst);
		String input = "A00000";
		int output = p.convertInputToSteps(input);
		int expected = 4;
		assertEquals(output, expected);
	}

}
