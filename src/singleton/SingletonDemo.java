package singleton;

class Demo{
	
	private static Demo d = null;
	
	private Demo() {
		
	}
	
	public static Demo getObject() {
		if(d == null) {
			d = new Demo();
			return d;
		}
		else return d;
	}
	
	
}

public class SingletonDemo {

	public static void main(String[] args) {
		Demo d1 = Demo.getObject();
		Demo d2 = Demo.getObject();
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(Demo.getObject());
	}
}
