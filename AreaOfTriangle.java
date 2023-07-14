package simple_problems;
import java.util.*;
public class AreaOfTriangle {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the value of base:");
	 double base = scan.nextDouble();
	 System.out.println("enter the value of  height :");
	 double height = scan.nextDouble();
    System.out.printf("the area of triangle is %.0f" , base * height /2);
}
}
