package demo.test;

public class Person
{
	
// Class & Object
	
//state - name, age, gender, city, Married
	private String name;
	int age;
	char gender;
	String city;
	boolean isAlive;
	boolean hasMouth;
	boolean hasHand;
	boolean hasLeg;
	
//encapsulation
	//setProperty
	public void setName(String name)
	{
		this.name = name;
	}
	//getProperty
	public String getName() 
	{
		return name;
	}
	
	
//behaviour - Speak, Walk, Eat, Sleep
	void Alive()
	{
		
		if(isAlive)
			System.out.println(name + " is Alive");
		else
			System.out.println(name + " is not Alive");
	}
	
	void speak() 
	{
		if(hasMouth)
			System.out.println(name + " is able to speak");
		else
			System.out.println(name + " is not able to speak");
	}
	
	void walk() 
	{
		if(hasLeg)
			System.out.println(name + " is able to walk");
		else
			System.out.println(name + " is not able to walk");
	}
	
	void eat() 
	{
		if(hasHand)
			System.out.println(name + " is able to eat");
		else 
			System.out.println(name + " is not able to eat");
	}
	
}
