package simple_problems;

public class Swap {
	public static void main(String[] args) {
		
		
	   float a = 8.293f;
	   float b = 82394.9234f;
	   System.out.println("before swapping");
	   System.out.println("value of a :"+ a);
	   System.out.println("value of b :"+ b);
	   
	   // swapping 
	   float temporary = a;
	   a= b;
	   b = temporary;
	   
	   System.out.println("after  swapping");
	   System.out.println("value of a :"+ a);
	   System.out.println("value of b :"+ b);
	   
		
	}

}
