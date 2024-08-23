import java.util.Scanner;

public class BADILLA_Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Enter a number
        System.out.print("Enter number: ");
        int n = scanner.nextInt();
        
        // First line of the pattern
        System.out.println("*");
        
        // Increasing part of the pattern
        for (int a = 1; a <= n; a++) {
            System.out.print("*");
            for (int b = 1; b <= a; b++) {
                System.out.print(b);
            }
            for (int b = a - 1; b >= 1; b--) {
                System.out.print(b);
            }
            System.out.println("*");
        }
        
        // Decreasing part of the pattern
        for (int a = n - 1; a >= 1; a--) {
            System.out.print("*");
            for (int b = 1; b <= a; b++) {
                System.out.print(b);
            }
            for (int b = a - 1; b >= 1; b--) {
                System.out.print(b);
            }
            System.out.println("*");
        }
        
        // Last line of the pattern
        System.out.println("*");
        
        scanner.close();
    }
}
