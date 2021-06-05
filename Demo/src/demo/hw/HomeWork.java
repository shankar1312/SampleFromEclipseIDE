package demo.hw;

import java.util.Scanner;

public class HomeWork 
{
	
	public static void main(String[] args)
	{
		
		//Factorial for given number
		
		int fact = 1;  
		int number = 5;	//It is the number to calculate factorial    
		
		for(int i=1;i<=number;i++)
		{    
			fact=fact*i;    
		}    
		System.out.println("Factorial of "+number+" is: "+fact);
		
		//Fibonacci series
		
		int n1=0;
		int n2=1;
		int n3;
		int count=5;    
		System.out.print("Fibonacci series for "+count+" is: " +n1+" "+n2);//printing 0 and 1    
		    
		for(int i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
		{    
			n3=n1+n2;    
			System.out.print(" "+n3);    
			n1=n2;    
			n2=n3;    
		} 
		
		System.out.println();
		
		//Even or odd number?
		
		int num = 5;
				
		if ( num % 2 == 0 )
	        System.out.println("Entered number is even");
	    else
	        System.out.println("Entered number is odd");
		
		//Sum of given number
		
		int sum = 0;
        int n = 123;
        while (n != 0)
        {
            sum = sum + n % 10;
            n = n/10;
        }
        System.out.println(sum);
        
        //Palindrome
        
        String original = "MAM";
        String reverse = ""; // Objects of String class  
          
        int length = original.length(); 
        
        for ( int i = length - 1; i >= 0; i-- )  
           reverse = reverse + original.charAt(i);
        
        if (original.equals(reverse))  
           System.out.println("Entered string/number is a palindrome.");  
        else  
           System.out.println("Entered string/number isn't a palindrome.");
        
        //Reverse the string without String method	
        
        String str = "Shankar";  
        
        System.out.print("After reverse string is: ");  
        for(int i=str.length(); i>0 ;--i)                //i is the length of the string  
        {  
        System.out.print(str.charAt(i-1));            	 //printing the character at index i-1  
        }  

        //Scanner class
        System.out.println();
        String str1 = "";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value : ");
        str1 = sc.nextLine();
        System.out.println(str1);
        }

	/*
	 * Scanner sc=new Scanner(System.in); 
	 * System.out.print("Enter a String: ");
	 * s=sc.nextLine(); //reading string from user
	 */	
}
