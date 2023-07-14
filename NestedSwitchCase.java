package simple_problems;

public class NestedSwitchCase {
	public static void main(String[] args) {
		int tech = 2;
		int course = 2;

		switch(tech){
		case 1:
		 System.out.println("python");
		 break;
		 case 2:
		 //nested SwitchCase 
		 switch(course){
		   case 1:
		   System.out.println("Java");
		   break;
		   case 2:
		   System.out.println("advance java");
		 }
		 } 
	}

}
