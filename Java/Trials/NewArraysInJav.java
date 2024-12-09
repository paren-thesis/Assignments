


public class NewArraysInJav {
    public static void main(String[] args) {
        
        //String[] cars = { "Camero", "Toyota", "Tesla", "BMW" };
        //cars[1] = "Mastang";
        //System.out.println(cars[3]);

        //int[] number = { 1, 2 };
        //System.out.println(Arrays.toString(number));

        String[] cars = new String[4];

        cars[0] = "Ford";
        cars[1] = "Toyota";
        cars[2] = "Lamboghini";
        cars[3] = "Mastang";

        System.out.println(cars[1]);

        if (cars[1] == "Toyota") {
            System.out.println("Yes");
        }
        
        int[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7 };

        System.out.println(numbers.length);

        char[] characters = { 'a', 'e', 'i', 'o', 'u' };

        System.out.println(characters[1]);


    }

}
