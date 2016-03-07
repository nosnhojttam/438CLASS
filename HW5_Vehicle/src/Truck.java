/*
 * Title: Truck.java
 * Abstract: Creates a truck, which is a vehicle, with load cap and towing cap
 * Author: Matt Johnson
 * ID: 4722
 * Date: 10/21/2015
 */


public class Truck extends Vehicle {
	double loadCap;
	int towingCap;
	
	public Truck(){
		super();
		loadCap = 0;
		towingCap = 0;
	}
	
	public void setLoadCap(double d) {
		loadCap = d;
	}

	public void setTowingCap(int i) {
		towingCap = i;
	}
	
	public double getLoadCap(){
		return loadCap;
	}
	
	public int getTowingCap(){
		return towingCap;
	}

	public String toString(){
		return("Manufacturer: " + manufacturer + ", Cylinders: " + cylinders +
				", Owner: " + owner.getName() +
				"Load Cap: " + loadCap + ", Towing Cap: " + towingCap);
	}
	
	public boolean equals(Object other){
		if(other instanceof Truck){
			if(loadCap == ((Truck) other).getLoadCap() &&
				towingCap == ((Truck) other).getTowingCap()){
				return true;
			}
			else{
				return false;
			}
		}
		return false;
	}
}
