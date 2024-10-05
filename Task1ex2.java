import javax.swing.*;
import java.util.Scanner;

public class Task1ex2 {
    // Find the number is positive or negative
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number");
        double number = scanner.nextDouble();

        if (number > 0)
            System.out.println("The number is positive");
        else if (number < 0) {
            System.out.println("The number is negative");
        }
        else
            System.out.println("The number is zero");

    }
}
