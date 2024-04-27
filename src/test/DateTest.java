package test;

import java.sql.Timestamp;
import java.util.Date;

public class DateTest {
	
//	int i = 10;
//	
//	void print(int i) {
//		System.out.println(i);
//		this.i = this.i + 20;
//		System.out.println(this.i);
//	}
//	
//	void show(int i) {
//		System.out.println(i);
//		this.i = this.i + 20;
//		System.out.println(this.i);
//	}
	
	{
		System.out.println("Block - 1");
	}
	
	static {
		System.out.println("Static Block - 1");
	}
	
	{
		System.out.println("Block - 2");
	}
	
	static {
		System.out.println("Static Block - 2");
	}
	public static void main(String[] args) {

//		Timestamp tms = new Timestamp(System.currentTimeMillis());
//
//		System.out.println("TMS : " + tms);
//		System.out.println("TMS : Date " + tms.getDate() );
//		System.out.println("TMS : Month " + tms.getMonth() );
//		System.out.println("TMS : Year " + tms.getYear() );
//		Date date = new Date(tms.getTime());
//		System.out.println(date.getDate());
//		System.out.println(date.getMonth());
//		System.out.println(date.getYear());
//		
//		System.out.println("12-Mar-24".toUpperCase());
//		String d = "12-Mar-2024";
//		d = d.toUpperCase();
//		d = d.substring(0, 7) + d.substring(9,11);
//		System.out.println(d);
		
		
//		int i = 2;
//		
//		switch(i) {
//		case 1 : System.out.println("1"); break;
//		default : System.out.println("default");
//		case 2 : System.out.println("2"); break;
//		}
		
//		int i = 10;
//		
//		System.out.println(i);
//		System.out.println(i);
//		new DateTest().print(i);
		
		System.out.println("Main Method");
		new DateTest();
	}
}
