package oop_practice;

class Practice {
	void show() {
		System.out.println("1");
	}
}

class Practice1 extends Practice {
	
	void show() {
		System.out.println("2");
	}
	
	void show(int x) {
		System.out.println("2 - " + x);
	}
}

public class Practice2 {

	
	
	public static void main(String[] args) {
		Practice1 p = new Practice1();
		p.show();
		p.show(10);
	}
}
