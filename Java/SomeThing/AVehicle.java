import javax.swing.JOptionPane;

public class AVehicle {
    private String car_make;
    private String care_model;
    private int number_plate;
    private int num_of_tyres;

    // public AVehicle(String car_make, String care_model, int number_plate, int num_of_tyres) {
    //     this.car_make = car_make;
    //     this.care_model = care_model;
    //     this.number_plate = number_plate;
    //     this.num_of_tyres = num_of_tyres;
    // }

    public AVehicle() {

    }

    public String getCar_make() {
        return car_make;
    }

    public void setCar_make(String car_make) {
        this.car_make = car_make;
    }

    public String getCare_model() {
        return care_model;
    }

    public void setCare_model(String care_model) {
        this.care_model = care_model;
    }

    public int getNumber_plate() {
        return number_plate;
    }

    public void setNumber_plate(int number_plate) {
        this.number_plate = number_plate;
    }

    public void setNum_of_tyres(int num_of_tyres) {
        this.num_of_tyres = num_of_tyres;
    }

    public int getNum_of_tyres() {
        return num_of_tyres;
    }

    public void BuildACar() {

        String results = String.format(
                "Your car make is %s\nCar model is %s\nThe number plate is %d\nThe number of tyres are %d", car_make,
                care_model, number_plate, num_of_tyres);

        JOptionPane.showMessageDialog(null, results, "Output", 1);
    }

}
