package simple_problems;

import java.util.Scanner;

public class Quotient_remainder {
	public static void main(String[] args) {
		int dividend = 100;
		int divisor = 50;
		
		int quotient = dividend /divisor ;
		int remainder = dividend % divisor;
		System.out.println(quotient);
		System.out.println(remainder);
		
	  // to find odd or even
		Scanner scan = new Scanner ( System.in);
		System.out.println("enter a number:");
		int number = scan.nextInt();
		
		//using ternery operator 
		String result = (number%2==0) ? "The given number is even" : "The given number is odd ";
		System.out.println(result);
 }

}
