/*
 * Title: Person.java
 * Abstract: Creates a person with a name
 * Author: Matt Johnson
 * ID: 4722
 * Date: 10/21/2015
 */


public class Person {
	private String name;
	
	public Person()
	{
		 name = "Unknown";
	}
	
	public Person (String theName)
	{
		name = theName;
	}
	
	public Person(Person p1) {
		name = p1.getName();
	}

	public String getName ( )
	{
		return name;
	}
	
	public void setName (String theName)
	{
		name = theName;
	}
	
	public String toString ( )
	{
		return(name);
	}
	
	public boolean equals (Object other)
	{
		if(other instanceof Person){
			if(name.equals(((Person) other).getName())){
				return true;
			}
			else{
				return false;
			}
		}
		return false;
	} 
}
