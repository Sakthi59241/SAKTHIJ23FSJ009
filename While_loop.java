package simple_problems;
import java.util.*;
public class While_loop {
	public static void main(String[] args) {
		int  sum = 0;
		 Scanner scan = new Scanner(System.in);

		 System.out.println(" Please Enter any integer Value below 10: ");  
		 int number = scan.nextInt();

		 while(number <=10) {
		 sum = sum + number;
		 number++;
		 }
		 System.out.format(" Sum of the Numbers From the While Loop is: %d ", sum); 
		
		
	}

}
