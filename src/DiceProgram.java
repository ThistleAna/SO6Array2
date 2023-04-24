// random number: generating random value between 1 -6
// import random class
import java.util.Random;
public class DiceProgram {
    public static void main(String[] args) {
        // create instance of Random class
        Random obj = new Random();
        // create a variable to save the random number
        int value = obj.nextInt(6)+1;
        System.out.println("Generate random number....");
        System.out.println("The value you get is " + value);
    }
}
