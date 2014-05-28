package ch;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestApp {

	private Fibo fibo;

	@Before
	public void setUp() throws Exception {
		
		fibo = new Fibo();
	}

	@Test
	public void itShouldReturn1when2entred() {
		assertEquals(1, fibo.process(2));
	}
	
	
	@Test
	public void itShouldReturn2when3entred() {
		assertEquals(2, fibo.process(3));
	}

}
