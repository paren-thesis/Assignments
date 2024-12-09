public class Pyramid extends Triangle {
	
	public Pyramid(int base, int height) {
	super(base,height);
	}

	public double volume() {
	return (double)1/3 * getBase() * getHeight() * getHeight();
	}

	public double cost() {
	return 15.75 * area();
	}	
	
	@Override
	public void display() {
	super.area();
	System.out.printf("Volume: %f\nCost: %f",volume(),cost());
	}

}
