public class Pyramid extends Triangle {
    public Pyramid(int base, int height) {
        super(base, height);
    }

    public double volume() {
        return (1/3) * getBase() * getHeight() * getBase();
    }

    public double cost() {
        return 15.75 * area();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("The volume is " + volume() + "The cost is " + cost());
    }
}
