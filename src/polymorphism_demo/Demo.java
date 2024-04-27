package polymorphism_demo;

abstract class A {
	
	static void m1() {
		System.out.println("Hello World A");
	}
	
}

class B extends A {
	static void m1() {
		System.out.println("Hello World B");
	}
}

public class Demo {

	public static void main(String[] args) {
//		B b = new B();
		B.m1();
	}
}
