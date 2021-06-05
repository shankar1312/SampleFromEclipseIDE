package demo.test;

public class PersonsObj {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person();
		
		person1.setName("ABC");
		person1.age = 70;
		person1.gender = 'M';
		person1.city = "Delhi";
		person1.isAlive = true;
		person1.hasMouth = true;
		person1.hasHand = true;
		person1.hasLeg = true;
		
		person1.Alive();
		person1.speak();
		person1.eat();
		person1.walk();
		
		
	}

}
