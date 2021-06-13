package demo.test;

public class AboutString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//use escape character
		System.out.println("Shankar is from \"Coimbatore\"");
				
		//Declaring String  => jre path : java.base - java.lang - String.class
		//(Press F4 to see .class file to explore the hierarchy)
		//(Press F3 to explore the class in jre)
		
		String st = new String();
		//String str; should be initilized to use
		String str = null;  
		System.out.println("Default of String : " + str);
		
		//Assigning value
		str = "Hello"; // "12345"
		System.out.println("Default of String : " + str);
		
		//Can Assign any value
		str = "12345";
		System.out.println("Default of String : " + str);
		
		//Type cast
			//int num = (int)str1;
		int num1 = Integer.parseInt(str);
		System.out.println(num1);
		
		//few commonly used String methods
		str = "Hello, this is our session 3 on java";
		
		System.out.println("Length : " + str.length());
		System.out.println("Upper Case : " + str.toUpperCase());   	
		System.out.println("Lower case : " + str.toLowerCase());   	
		System.out.println("Index of given letter or word : " + str.indexOf("of")); 
		
		StringBuilder str1 = new StringBuilder();

		System.out.println("Reverse the string : " + str1.reverse());
		System.out.println("Append the string : " + str1.append("IDIOT"));
		
		//String concatenation
		String firstName = "Shankar";
		String lastName = "Narayanasamy";
		System.out.println(firstName + " " + lastName);
		//or
		System.out.println(firstName.concat(lastName));
		
		
		
					
	
	}
	
/*	
	String str = "25";
    try{
        int number = Integer.parseInt(str);
        System.out.println(number); // output = 25
    }
    catch (NumberFormatException ex){
        ex.printStackTrace();
    }
*/
	
}
