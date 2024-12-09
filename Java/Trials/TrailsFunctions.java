import java.util.Scanner;

public class TrailsFunctions {

    public static void DevTeaTime() {
        System.out.println("Waiting for developer tea time ");
        System.out.println("Type any key to continue");
        Scanner input = new Scanner(System.in);
        input.next();
        input.close();
        System.out.println("Its developers tea time");

    }

    public static void NewClass() {
        
    }
    public static void main(String[] args) {
        DevTeaTime();
    }

}
