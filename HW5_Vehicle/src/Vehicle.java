/*
 * Title: Vehicle.java
 * Abstract: Creates a vehicle with a manufacturer, owner, and cylinders
 * Author: Matt Johnson
 * ID: 4722
 * Date: 10/21/2015
 */


public class Vehicle {
	String manufacturer;
	int cylinders;
	Person owner;
	

	public Vehicle(Vehicle v1) {
		manufacturer = v1.getManufacturer();
		cylinders = v1.getCylinders();
		owner = new Person(v1.getOwner());
	}

	public Vehicle() {
		manufacturer = "Unknown";
		cylinders = 0;
		owner = new Person();
	}

	public void setManufacturer(String string) {
		manufacturer = string;
	}

	public void setCylinders(int i) {
		cylinders = i;	
	}

	public void setOwner(Person person) {
		owner = person;
		
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public int getCylinders() {
		return cylinders;
	}

	public String getOwner() {
		return(owner.getName());
	}
	
	public boolean equals(Object other){
		if(other instanceof Vehicle){
			if(manufacturer.equals(((Vehicle) other).getManufacturer())
				&& cylinders == ((Vehicle) other).getCylinders()){
				return true;
			}
			else{
				return false;
			}
		}
		return false;
	}
	
	public String toString(){
		return("Manufacturer: " + manufacturer + ", Cylinders: " + cylinders +
				", Owner: " + owner.getName());
	}
	
}
