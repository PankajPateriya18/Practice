package return_keyword;

public class ReturnCheck {

	static void ret() {
		System.out.println("Start");
//		return;
		System.out.println("End");
	}
	
	public static void main(String[] args) {
		
		ReturnCheck.ret();
		
		String s1 = "Pankaj";
		String s2 = "Pankaj";
		String s3 = new String("Pankaj");
		String s4 = new String("Pankaj");
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s4 == s3);
		System.out.println(s3.equals(s4));
		System.out.println("Test not Completed");
	}
}
