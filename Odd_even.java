package simple_problems;

import java.util.Scanner;

public class Odd_even {
	public static void main(String[] args) {
		Scanner scan = new Scanner ( System.in);
		System.out.println("enter a number");
		int a = scan.nextInt();
		if(a%2==0){
			System.out.println("It is even number");
		}
		else {
			System.out.println("it is odd number");
		}
	}

}
