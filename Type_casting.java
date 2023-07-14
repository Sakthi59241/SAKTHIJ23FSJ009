package simple_problems;

public class Type_casting {
	public static void main(String[] args) {
		
		byte a =20;
		short b = a ;
		int c = b;
		long d  = c;
		
		//int e = d ; // throws an error  
	    //can over come by convertion 
		int f = (int)d;
		byte x= 10 ;
		byte y =30;
		int  sum = (int) (x*y);
		System.out.println(sum);
		
		//can't able to do arithmetic operations in byte because the range of byte is -128 to 127 
	}

}
