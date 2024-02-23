
public class CorejavaString {

	public static void main(String[] args) {
		// string is an object
		
		String s = "rahul shetty selenium";
		
		s.split(" ");
		
		String[] ss =s.split("shetty");
		
		System.out.println(ss[0]);
		System.out.println(ss[1]);
		System.out.println(ss[1].trim());
		
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}		
		

	}
	
	public void anotherData() {
		System.out.println("I am in different class");
	}
}
