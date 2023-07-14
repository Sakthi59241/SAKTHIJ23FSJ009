package simple_problems;
import java.util.Scanner;

public class Mulptiply_two_numbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner ( System.in);
		System.out.println("enter value of a :");
		int a = scan.nextInt();
		System.out.println("enter value of b :");
		int b = scan.nextInt();
		// multiply a and b 
		int multiply = a * b;
		System.out.println("the value is :"+multiply);
		
	}

}
