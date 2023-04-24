// 1. import random class
import java.util.Random;

public class MinandMax{
    public static void main(String[] args) {
        // 2. create object random
        Random random = new Random();
        // 3. initialise empty array with size 10
        int [] array = new int [10];
        // 4. generate random numbers to fill in your array, bound is 100
        System.out.println("Generating 10 random numbers....");
        for (int i=0; i < array.length; i++){
            array[i] = random.nextInt(100)+1;
            System.out.print(array[i] + " ");
        }
        // 5. to find the biggest element, create new variable max
        int max = array[0];
        // 6. a. use for loops to compare max and array[i]
        // 6.b. inside the loop update max if array[i] is bigger
        for (int i=1; i< array.length; i++){
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("\nBiggest number on the sequence is " + max);
        // 7. to find the lowest, crate new variable min
        int min = array[0];
        // 8. a. use for loop to compare min and array[i]
        // 8. b. inside the loop update min in array[i] is smaller
        for (int i=1; i< array.length; i++){
            if (array[i] < min) {
                min = array[i];
            }
        }
        // 9. print max value
        System.out.println("Smallest number on the sequence is " + min);
        // 10. print min value

    }
}
