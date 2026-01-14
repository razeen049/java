import java.util.Scanner;

public class answer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double price;
        double dis;
        double fPrice;

        System.out.print("Enter original price: ");
        price = sc.nextDouble();

        System.out.print("Enter discount percentage: ");
        dis = sc.nextDouble();

        fPrice = price - (price * dis / 100);

        System.out.println("Discounted Price = " + fPrice);

        sc.close();
    }
}
