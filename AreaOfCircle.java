package simple_problems;
import java.util.*;
public class AreaOfCircle {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("enter the value of radius:");
		 float pi= (float) 3.14;
		 double radius = scan.nextDouble();
		 System.out.printf("the area of circle is %.0f" ,pi*radius*radius);
	}

}
