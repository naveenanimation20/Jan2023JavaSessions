package javasessions;

public class Browsers {

	String name;
	static String hq = "Bangalore";

	public int getBrowserVersion() {
		System.out.println("get browser version");
		return 100;
	}

	public static String getBroserVendor() {
		System.out.println("get browser vendor");
		return "Mozilla";
	}

	//entry point of execution
	//runner method
	//calling method
	//like a user for me
	public static void main(String[] args) {

		Browsers obj = new Browsers();
		System.out.println(obj.name);
		System.out.println(hq);//directly
		System.out.println(Browsers.hq);//using class name
		
		obj.getBrowserVersion();
		
		getBroserVendor();
		Browsers.getBroserVendor();
		
		obj.name = "Naveen";
		obj.hq = "Pune";
		obj.getBroserVendor();
		
		//object can not hold static properties (var, method)
		//static will be stored in CMA - Perm Gen - Metaspace
		//Object can call/access static properties but with a warning
		//you should alwys call static with the class name.
		//10 Objects --> static copies = 1
		//non static copies = 10
		
		//Perm Gen -vs- Metaspace (JDK 1.8)
		
		

	}

}
