package clk;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import org.junit.Test;

public class JunitTest {

	Junit a = new Junit();

	@Test
	public void testWithNegativeNumber() {
		boolean[] sieveOfEratosthenes = null;
		try {
			sieveOfEratosthenes = a.sieveOfEratosthenes(-14);
			fail();
		} catch (NegativeArraySizeException e) {
			assertNull(sieveOfEratosthenes);
		}
	}
	@Test
	public void testWithNumber4() {
		boolean[] sieveOfEratosthenes = null;
		sieveOfEratosthenes = a.sieveOfEratosthenes(4);
		assertArrayEquals(new boolean[] { true, true, true, true, false }, sieveOfEratosthenes);
	}

	@Test
	public void testWirhNumber10() {
		boolean[] sieveOfEratosthenes = null;
		sieveOfEratosthenes = a.sieveOfEratosthenes(10);
		assertArrayEquals(new boolean[] { true, true, true, true, false, true, false, true, false, false, false },
				sieveOfEratosthenes);

	}

}
