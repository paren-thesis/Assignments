public class Area {
    private double length;
    private double breadth;

    public Area() {
    }

    public Area(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double CalArea() {
        double area = length * breadth;
        return area;
    }

}
