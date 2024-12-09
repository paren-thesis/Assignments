public class Triangle {
	private int base;
	private int height;

	public Triangle() {
	this.base = 0;
	this.height = 0;
	}

	public Triangle(int base, int height) {
	this.base = base;
	this.height = height;
	}

	public double getBase() {
	return base;
	}

	public double getHeight() {
	return height;
	}

	public double area() {
	return 0.5 * getBase() * getHeight();
	}
	
	public void display() {
	System.out.printf("Area: %f",area());
	}
}