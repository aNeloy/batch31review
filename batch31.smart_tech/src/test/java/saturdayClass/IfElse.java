package saturdayClass;

public class IfElse {

	public static void main(String[] args) {
		
		
		
	}
	
	static void grading(int grade) {
		
		if(grade<65) {
			System.out.println("failed");
		}
		else if(grade>64 && grade <76) {
			System.out.println("D");
		}
		else if(grade>75 && grade <86) {
			System.out.println("C");
		}
		else if(grade>84 && grade <96) {
			System.out.println("B");
		}
		else {System.out.println("A");}
		
		}

}
