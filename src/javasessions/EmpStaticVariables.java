package javasessions;

public class EmpStaticVariables {
	static String ceoname = "Ramesh";
	static String companyname = "HP";
	int empcode;
	String empname;
	char deptgrade;
	String projectname;
	int totalprojects;
	int totaldept;
	int totalemp;
	int totalfaculty;

	public static void main(String[] args) {

		EmpStaticVariables var = new EmpStaticVariables();
		EmpStaticVariables var1 = new EmpStaticVariables();
		EmpStaticVariables var2 = new EmpStaticVariables();

		var.empname = "Rohit";
		System.out.println(EmpStaticVariables.companyname);
		System.out.println(EmpStaticVariables.ceoname);
		
		EmpStaticVariables.ceoname = "Naveen";
		System.out.println(EmpStaticVariables.ceoname);


		var1.totalfaculty = 100;
		System.out.println(var1.totalfaculty);

	}

}
