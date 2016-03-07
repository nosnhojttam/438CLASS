import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class VehicleTest extends TestCase{

	@Test
	public void testSetGetManufacturer(){
		Vehicle v = new Vehicle();
		v.setManufacturer("Vehicle 1");
		Vehicle v1 = new Vehicle();
		v1.setManufacturer("123$$$");
		Vehicle v2 = new Vehicle();
		v2.setManufacturer("^&*#(a2#bof$5%3#dks.,~~~~~~~~");
		
		assertEquals(v.getManufacturer(), "Vehicle 1");
		assertEquals(v1.getManufacturer(), "123$$$");
		assertEquals(v2.getManufacturer(), "^&*#(a2#bof$5%3#dks.,~~~~~~~~");
	}
	
	@Test
	public void testEquals(){
		Vehicle v = new Vehicle();
		v.setManufacturer("abc");
		v.setCylinders(2);
		Vehicle v1 = new Vehicle();
		v1.setManufacturer("abc");
		v1.setCylinders(2);
		Vehicle v2 = new Vehicle();
		v2.setManufacturer("abc");
		v2.setCylinders(4);
		Vehicle v3 = new Vehicle();
		v3.setManufacturer("abd");
		v3.setCylinders(2);
		
		assertEquals(v.equals(v1), true);
		assertNotEquals(v.equals(v2), true);
		assertNotEquals(v.equals(v3), true);
		assertNotEquals(v2.equals(v3), true);
	}
	
	@Test
	public void testSetGetCylinders(){
		Vehicle v = new Vehicle();
		v.setCylinders(2);
		Vehicle v1 = new Vehicle();
		v1.setCylinders(-4);
		Vehicle v2 = new Vehicle();
		v2.setCylinders(0);
		
		assertEquals(v.getCylinders(), 2);
		assertEquals(v1.getCylinders(), -4);
		assertEquals(v2.getCylinders(), 0);
		
	}
	
	@Test
	public void testTruckSetGetLoadCap(){
		Truck t = new Truck();
		t.setLoadCap(100.0);
		Truck t1 = new Truck();
		t1.setLoadCap(0);
		Truck t2 = new Truck();
		t2.setLoadCap(-5.0);
		Truck t3 = new Truck();
		t3.setLoadCap(Integer.MAX_VALUE);
		
		assertEquals(t.getLoadCap(), 100.0);
		assertEquals(t1.getLoadCap(), 0.0);
		assertEquals(t2.getLoadCap(), -5.0);
		assertEquals(t3.getLoadCap(), Integer.MAX_VALUE);
	}
	
	@Test
	public void testTruckSetGetTowingCap(){
		Truck t = new Truck();
		t.setTowingCap(10);
		Truck t1 = new Truck();
		t1.setTowingCap(0);
		Truck t2 = new Truck();
		t2.setTowingCap(-5);
		Truck t3 = new Truck();
		t3.setTowingCap(Integer.MAX_VALUE);

		assertEquals(t.getTowingCap(), 10);
		assertEquals(t1.getTowingCap(), 0);
		assertEquals(t2.getTowingCap(), -5);
		assertEquals(t3.getTowingCap(), Integer.MAX_VALUE);
	}
	
	
}
