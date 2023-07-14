package simple_problems;
import java.util.Scanner;
public class AreaOfRectangle {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the value of width :");
    double width = scan.nextDouble();
    System.out.println("enter the value of length :");
    double length = scan.nextDouble();
    System.out.printf(" the value of area of rectangle %.0f", width*length);
}
}
