package simple_problems;
import java.util.Scanner;
public class ReverseNumber {
public static void main(String[] args) {
	int num=0;
	int reversenum =0;
	 System.out.println("Input your number and press enter: "); 
	 Scanner scan = new Scanner(System.in);
	 //store the value to num 
	 num = scan.nextInt();
	 // reverse a number using whileLoop 
	 while( num != 0 )
	 {
	 reversenum = reversenum * 10;
	 reversenum = reversenum + num%10;
	 num = num/10;
	 }
	 System.out.println("Reverse of input number is: "+reversenum);
}
}
