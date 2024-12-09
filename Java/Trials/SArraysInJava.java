import java.util.Arrays;

public class SArraysInJava {
    public static void main(String[] args) {
        char vowels[] = { 'a', 'e', 'i', 'o', 'u' };

        

        int startingIndex = 1;
        int endingIndex = 4;

        char key = 'o';

        int item = Arrays.binarySearch(vowels, startingIndex,endingIndex, key);

        System.out.println(Arrays.toString(vowels));
        System.out.println(item);
        

    }

}
