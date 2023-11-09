package triangle;

public class Triangle {
	private Integer side1;

	private Integer side2;
	
	private Integer side3;
	
	public Triangle(Integer side1, Integer side2, Integer side3) {
		if(!isTriangle()) {
			throw new IllegalStateException();
		}
		
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public Integer getSide1() {
		return side1;
	}

	public void setSide1(Integer side1) {
		this.side1 = side1;
	}

	public Integer getSide2() {
		return side2;
	}

	public void setSide2(Integer side2) {
		this.side2 = side2;
	}

	public Integer getSide3() {
		return side3;
	}

	public enum typeTriangle {
		EQUILATERAL, ISOSCELES, SCALENE;
	}

	private boolean isTriangle() {
		return false;
	}
	
	public typeTriangle defineTriangle() {
		return null;
	}
}
