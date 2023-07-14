package simple_problems;

public class Reverse_pyramid {
public static void main(String[] args) {
	System.out.println("reverse pyramid example ");
	// reverse pyramid 
	   int term=6;
	    for(int i=1;i<=term;i++){
	       for(int j=term;j>=i;j--)
	        {
	         System.out.print("* ");
	       }
	    System.out.println();//new line
	 } 
}
}
