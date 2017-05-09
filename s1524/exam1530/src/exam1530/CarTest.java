package exam1530;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CarTest {
	Car mycar;
	@Before
	public void setUp() throws Exception {
		mycar= new Car(100);
	}

	@Test
	public void test() {
		mycar.addcapacity(1000);
		assertEquals(1100,mycar.getCapacity());
	}

}
