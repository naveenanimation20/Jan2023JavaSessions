package OOP_Abstract;

public abstract class Page {

	// can not create the object of abst... class
	// but can create the const... of abstract class
	// and this const.. will be called when we create the object of child class
	
	//100% abstraction
	//0% abstraction
	//partial abstraction

	public Page() {
		System.out.println("page const...");
	}
	
	public Page(int i ) {
		System.out.println("one param page const..."+i);
	}

	public abstract void title();

	public abstract void url();

	public void pageTimeLoadTimeOut() {
		System.out.println("page time out -- 10 secs");
	}

	public final void displayLogo() {
		System.out.println("display logo");
	}

	public static void footer() {
		System.out.println("page footer");
	}

}
