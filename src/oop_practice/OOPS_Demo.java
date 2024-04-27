package oop_practice;

abstract class Class {

	//Abstract Methods
	 abstract void print();
	 
	 //Concrete Methods
	 void show() {
		 System.out.println("Show Methods Absract");
	 }
}

class ClassA extends Class {

	@Override
	void print() {
		System.out.println("Print Method A");
		
	}
	
	@Override
	void show() {
		System.out.println("Show Method A");
	}
}

class ClassB extends Class {
	
	@Override
	void print() {
		System.out.println("Print Method B");	
	}
	
	@Override
	void show() {
		System.out.println("Show Method B");
	}
}

public class OOPS_Demo {
	
	public static void main(String[] args) {
		
		ClassA a = new ClassA();
		a.print();
		a.show();
		ClassB b = new ClassB();
		b.print();
		a.show();
	}
}
