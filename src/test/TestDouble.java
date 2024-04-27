package test;

public class TestDouble {

	public static void main(String[] args) {
		
		String st = "3.141212";
		Double exVal = 0.0; 
		try {
			exVal = Double.parseDouble(st);
		}catch(Exception e) {
			exVal = 1.0;
		}
		
		System.out.println(exVal);
	}
}
