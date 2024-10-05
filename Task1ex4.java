import java.util.Scanner;

public class Task1ex4 {
// find the smallest number
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the 1st numbers");
        int num1 = scanner.nextInt();
        System.out.println("Enter the 2nd numbers");
        int num2 = scanner.nextInt();
        System.out.println("Enter the 3rd numbers");
        int num3 = scanner.nextInt();


        if (num1 < num2 ){
            System.out.println("Smallest number is " + num1);
        }

        if (num2 < num3){
            System.out.println("Smallest number is " + num2);
        }

        if (num3 < num1) {
            System.out.println("Smallest number is " + num3);
        }

    }

}
