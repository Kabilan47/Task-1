import java.util.Scanner;

public class Task1ex5 {
// Final payable amount after applying discount
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Enter the purchase amount: ");
            double purchaseAmount = scanner.nextDouble();

            double discount = 0;


            if (purchaseAmount >= 500 && purchaseAmount <= 1000) {
                discount = 0.10;  // 10% discount
            } else if (purchaseAmount > 1000) {
                discount = 0.20;  // 20% discount
            }


            double finalAmount = purchaseAmount - (purchaseAmount * discount);


            System.out.println("The final payable amount after discount is: " + finalAmount);

            scanner.close();
        }
}
