package test;

class A{
	int a = 10;
	
	void print() {
		System.out.println("A Class");
	}
}

class B extends A{
	int a = 20;
	int b = 30;
	
	void print() {
		System.out.println("B Class");
	}
}

public class Test {
	
	static void m() {
		B a = new B();
		System.out.println(a.a);
		a.print();
		
	}

	public static void main(String[] args) {
//		String s = "Pankaj";
//		
//		B b = new B();
//		A a = new B();
//		if(b instanceof Object) System.out.println("String --");
//		else System.out.println("Not String");
		
		String ss = null;
		Integer.parseInt(ss);
	}
}
