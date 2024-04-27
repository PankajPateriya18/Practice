package this_keyword;

class Prac{
	int i = 10;
}

public class Practice extends Prac{
	
	int i;
	
	Practice(){
		
		System.out.println("No Arg Constructor");
		System.out.println(i);
	}
	
	Practice(int i){
		this();
		System.out.println("Arg Constructor");
		this.i = i;
		System.out.println(this.i);
		this.print();
	}
	
	void print() {
		System.out.println("Print method");
	}


	public static void main(String[] args) {
		
		new Practice(10);
		
	}
}
