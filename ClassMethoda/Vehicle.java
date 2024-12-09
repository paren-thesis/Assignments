public class Vehicle {
    String make;
    String model;
    int num_tyres;
    double top_speed;
    
    public void showcar() {
        System.out.println("Car with make " + make + " and model " + model + " is running at a top speed of " + top_speed + "km/h on " + num_tyres + " wheels");
    }
}
