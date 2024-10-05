import java.util.Scanner;

public class Task1 {
// program need to print 10 to 50
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 1st value you need");
        int n = scanner.nextInt();
        System.out.println("Enter the last value you need");
        int m = scanner.nextInt();

        for (int i=n;i<=m;i++)
            System.out.println(i);




    }
}
