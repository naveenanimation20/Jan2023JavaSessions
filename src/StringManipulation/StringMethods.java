package StringManipulation;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {

		String s = "hello This is my java code i am so happy";
		
		int len = s.length();
		System.out.println(len);
		
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(19));
		//System.out.println(s.charAt(20));//SIOB
		//System.out.println(s.charAt(-1));//SIOB

		System.out.println(s.indexOf('T'));
		System.out.println(s.indexOf('i'));//1st occurrence of i
		System.out.println(s.indexOf('i', s.indexOf('i')+1));//2nd occurrence of i

		System.out.println(s.indexOf("java"));
		System.out.println(s.indexOf("testing"));
		
		String mesg = "admin welcome";
		if(mesg.indexOf("admin") == 8) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}

		
		//not a good validation
		if(mesg.indexOf("admin") >=0) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
		
		//
		String test = "    hello world   ";
		System.out.println(test.trim());
		
		//
		String t = "hello this is a java code";
		System.out.println(t.toUpperCase());
		System.out.println(t.toLowerCase());
		
		//
		String dob = "01-01-1990"; //01/01/1990
		System.out.println(dob.replace('-', '/'));
		
		String test1 = "    hello world   ";
		System.out.println(test1.replace(" ", ""));
		
		//
		String st = "hello world";
		String st1 = "hello World ";
		
		System.out.println(st == st1);
		System.out.println(st.equals(st1));
		System.out.println(st.equalsIgnoreCase(st1));
		
		String browser = "  Chrome ";
		if(browser.trim().equalsIgnoreCase("chrome")) {
			System.out.println("PASS");
		}
		
		//
		String p = "this is selenium testing";
		System.out.println(p.contains("selenium"));
		
		//
		//split:
		String lang = "JAVA_PYTHON_DOTNET_RUBY";
		String l[] = lang.split("_");
		
		System.out.println(l[0]);
		System.out.println(l[1]);

		System.out.println(Arrays.toString(l));
		
		
		String pop = "xXseleniumxXXtestingXxXJavaXxXpythonX";
		String d[] = pop.split("xX");
		System.out.println(d[0].length());
		System.out.println(d[1]);
		System.out.println(d[2]);
		System.out.println(d[3]);
		System.out.println(d[4]);
		System.out.println(Arrays.toString(d));
		
		
		//
		String empInfo = "madhav|singh|pune|india|ibm|sdet";
		String emp[] = empInfo.split("\\|");
		for(String e : emp) {
			System.out.println(e);
		}
		
		//
		String x = "100";
		System.out.println(x+20);
		
		//string to int:
		int i = Integer.parseInt(x);//100
		System.out.println(i+20);//120
		
		//string to double:
		String v = "12.33";
		System.out.println(v+10);
		double d1 = Double.parseDouble(v);//12.33
		System.out.println(d1+10);
		
		//
		//int to String:
		int k = 1100;
		System.out.println(k+20);
		String k1 = String.valueOf(k); //"1100"
		System.out.println(k1+20);
		
		//string to boolean:
		String flag = "true";
		boolean bl = Boolean.parseBoolean(flag);//true
		if(bl) {
			System.out.println("run my test cases");
		}
		
		
		//
		String h = "testing with selenium";
		String g = "devlopment with selenium";
		
		System.out.println(h.startsWith("testing"));
		System.out.println(g.endsWith("selenium"));
		
		//substring:
		String messg = "your transaction id is 12345";
		System.out.println(messg.substring(messg.indexOf("is")+2).trim());
		String trId = messg.substring(messg.indexOf("is")+2).trim();
		System.out.println(trId);
		
		String mg = "your transaction id is 12345";
		System.out.println(mg.substring(0, 9));//0-8
		System.out.println(mg.substring(mg.indexOf("is")+2, mg.length()).trim());
		
		
		
	}

}
