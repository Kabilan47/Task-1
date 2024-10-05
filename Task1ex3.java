import java.util.Scanner;

public class Task1ex3 {
// Reversed input number using loops
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers");

        int number = scanner.nextInt();

        int reverse = 0;

        while (number != 0){
            int r1 = number % 10;
            reverse = reverse * 10 + r1;
            number /= 10;
        }
        System.out.println("Reversed Number");
        System.out.print(reverse);

    }
}
