import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myNum = 5;
		String website =  "Rahul_shetty";
		char letter = 'r';
		double dec = 5.99;
		boolean myCard = true;
		System.out.println(myNum +","+ website+","+ letter+","+ myCard );
		 //Arrays store multiple value but with fixed Data type
		int[] array=new int[5];
		array[0]=1;
		array[1]=2;
		array[2]=3;
		array[3]=4;
		array[4]=5;
		
		int [] arr= {5,6,7,8,9};
		//System.out.println("Arrays value "+ arr[2]);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Arrays value "+ arr[i]);
		}
		
		for(int i=1;i<array.length;i++) {
			System.out.println("Arrays value "+ array[i]);
		}
	
		String [] name= {"rahul","shetty","selenium"};
		
		/*
		 * for(int i=0;i<name.length;i++) {
		 * 
		 * System.out.println("String Values "+ name[i]); }
		 */
		
		for(String s : name) {
			System.out.println(s);
		}
		
		
		//if else
		
		int [ ] arr2= {1,2,3,4,5,6,67,8,9,34,42,56,57,55,87};
		for(int i=1;i<arr2.length;i++) {
			
			if(arr2[i]%2==0) {
				System.out.println( arr2[i]);
				break;
			}
			
			else {
				System.out.println( arr2[i] + " not multiple of 2");
			}
		}
		
		//ArrayList
		ArrayList<String> a=new ArrayList<String>();
		//Create object
		
		a.add("rahul");
		a.add("Monu");
		
		a.add("rahul");
		a.add("Sonu");
		System.out.println(a);
		System.out.println(a.get(3));
		
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		
		
		System.out.println("*********************************");
		for(String val :a) {
			System.out.println(val);
		}
		
		//item is present in ArrayList
		
		System.out.println(a.contains("rahul"));
		
		
		//Convert Array to ArrayList
		String [] name2= {"rahul","shetty","selenium"};
		List<String> nameArrayList = Arrays.asList(name2);
		
		for(String Arrlist : nameArrayList) {
			System.out.println(Arrlist);
		}
		System.out.println(nameArrayList.contains(2));

	}

}
