package simple_problems;
import java.util.Scanner;
public class ArrayInput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 int[] array = new int[10]; //array initialize
		 int sum = 0;
		 System.out.println("Enter the elements:");
		 for (int i=0; i<10; i++) // storing values into array 
		 {
		 array[i] = scanner.nextInt();
		 }
		 for( int num : array) {   // enhanced forLoop
		 sum = sum+num;            
		 }
		 System.out.println("Sum of array elements is:"+sum);
	}

}
