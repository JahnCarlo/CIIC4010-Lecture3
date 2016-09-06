import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Test;

public class MutableCarTests {

	@Test
	public void test() {
		MutableCar theCar = new MutableCar(1.0, 2.0, Color.BLUE);
		assertNotNull("Reference is null", theCar);
		assertTrue("X Position is incorrect",theCar.getXPos() == 1.0 );
	}
	
	@Test
	public void testSetLocation(){
		MutableCar theCar = new MutableCar(1.0, 2.0, Color.BLUE);
		theCar.setPosition(3.0, 5.0);
		assertTrue("X Position is incorrect",theCar.getXPos() == 3.0 );
		assertTrue("Y Position is incorrect",theCar.getYPos() == 5.0 );
	}
	
	

}
