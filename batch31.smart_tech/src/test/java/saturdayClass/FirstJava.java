package saturdayClass;

public class FirstJava {

	public static void main(String[] args) {
		int a = 10;
		int x = 9;
		int y = 8;
		String b = "Abu";
		/*
		 * System.out.println("Hello Java");
		 
		System.out.println("test");
		System.out.println(a);
		System.out.println(b);
		*/
		Orange fanta = new Orange();
		fanta.peel();
		Orange.crush(); //We don't need to declare an object to use this method because the method is a static method
		System.out.println(fanta.divide());
		
		fanta.dog(4,3);
		fanta.cat(10, 8);
		fanta.cat(x, y);
		
		
		

	}

}
