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

    public int getBase(){
        return base;
    }

    public int getHeight() {
        return height;
    }

    public double area() {
        return 0.5 * base * height;
    }

    public void display(){
        System.out.println(""+ area());
    }
}