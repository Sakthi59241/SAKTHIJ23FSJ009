package simple_problems;
import java.util.Scanner;
public class AreaOfSquare {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the value of radius:");
	 double side = scan.nextDouble();
	 System.out.printf("the area of square is %.0f" ,side * side  );
}
}
