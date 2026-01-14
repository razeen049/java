import java.util.Scanner;

public class answer6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a;
        double b;
        double h;
        double ar;

        System.out.print("Enter first parallel side: ");
        a = sc.nextDouble();

        System.out.print("Enter second parallel side: ");
        b = sc.nextDouble();

        System.out.print("Enter height: ");
        h = sc.nextDouble();

        ar = h * (a + b) / 2;

        System.out.println("Area = " + ar);

        sc.close();
    }
}