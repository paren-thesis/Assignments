public class MainClass {
    public static void main(String[] args) {
        Vehicle car = new Vehicle();

        car.make = "Nessan";
        car.model = "Sentra";
        car.num_tyres = 4;
        car.top_speed = 200;

        car.showcar();
    }
}