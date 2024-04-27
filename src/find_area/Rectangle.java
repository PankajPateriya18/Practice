package find_area;

public class Rectangle implements shape {
 
	private float length;
	private float breath;
		
	public float getLength() {
		return length;
	}


	public void setLength(float length) {
		this.length = length;
	}

	public float getBreath() {
		return breath;
	}

	public void setBreath(float breath) {
		this.breath = breath;
	}

	@Override
	public void area() {
		
		System.out.println(length * breath);
		
	}
}
