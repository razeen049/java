import java.util.Scanner;

public class answer7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("EVEN Number");
        } else {
            System.out.println("ODD Number");
        }
        sc.close();

        
    }
}