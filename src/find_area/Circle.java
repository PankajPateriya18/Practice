package find_area;

public class Circle implements shape{

	private float radius;

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	@Override
	public void area(){
		
		System.out.println(((22.0)/7 ) * radius * radius);
		
	}
	
}
