import java.util.Scanner;

public class Task1ex6 {
// print pattern i and j and k=>5
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the value of n (i, j, k): ");
            int n = scanner.nextInt();

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (j < i) {
                        System.out.print(n - j);
                    } else {
                        System.out.print(n - i);
                    }
                }
                System.out.println();
            }

            scanner.close();
        }
}
