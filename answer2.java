import java.util.Scanner;

public class answer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double rad;
        double area;
        double cir;

        System.out.print("Enter radius: ");
        rad = sc.nextDouble();

        area = 3.14 * rad * rad;
        cir = 2 * 3.14 * rad;

        System.out.println("Area = " + area);
        System.out.println("Circumference = " + cir);

        sc.close();
    }
}