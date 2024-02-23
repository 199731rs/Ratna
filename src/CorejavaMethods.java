
public class CorejavaMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CorejavaMethods cm=new CorejavaMethods();
		cm.getData();
		System.out.println(cm.getStringdata());
		
		CorejavaString ca = new CorejavaString();
		ca.anotherData();
		getStringdata2();
		
				
	}
	
	public void getData() {
		System.out.println("hello world");
	}
	
	public String getStringdata() {
		return "RohitShetty";
	}

	public static void getStringdata2() {
		System.out.println("This is static Methods");
	}
}
