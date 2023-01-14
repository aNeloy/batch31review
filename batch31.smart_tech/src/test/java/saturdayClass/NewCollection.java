package saturdayClass;

import java.util.ArrayList;

public class NewCollection {

	public static void main(String[] args) {

		int abc[] = new int[5];
		abc[0]=34;
		abc[1]=10;
		abc[2]=56;
		abc[3]=67;
		abc[4]=15;
		
		String name[] = new String[4];
		name[0] = "hussain";
		name[1] = "farhan";
		name[2] = "nadira";
		name[3] = "rajia";
		for(int i = 0; i<name.length;i++) {
			System.out.println(name[i]);
		}
		
		//System.out.println(name[2]);
		
		int[][] orange = new int[3][2];
		orange[1][0] = 3;
		
	//	Object[][] item = new String[3][];
		//item [1] = new Integer[] {1,2,4};
	//	System.out.println(item[1][1]);
		
		ArrayList<String> obj1 =  new ArrayList<String>();
		obj1.add("Hussain");
		obj1.add("William");
		obj1.add("Khalil");
		obj1.add("Rajia");
		
		for(int i = 0; i<obj1.size(); i++) {
			System.out.println(obj1.get(i));
			
		
		}
		
	}

}
