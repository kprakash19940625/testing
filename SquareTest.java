import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {

	@Test
	public void test1() {
		JunitTesting test = new JunitTesting();
		int output = test.square(5);
		assertEquals(25,output);
	}
	@Test
	public void test2(){
		JunitTesting test = new JunitTesting();
		int output = test.square(6);
		assertEquals(36,output);
	}
	@Test
	public void test3(){
		JunitTesting test = new JunitTesting();
		int output = test.square(7);
		assertEquals(49,output);
	}

}
