package simple_problems;

public class SumArrayValues {
 public static void main(String[] args) {
	 int[] array = {10, 20, 30, 40, 50, 10};
	 int sum = 0;
	 //enhanced forLoop
	 for( int num : array) {
	  sum = sum+num;
	  }
	  System.out.println("Sum of array elements is:"+sum);
}
}
