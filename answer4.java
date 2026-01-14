import java.util.Scanner;

public class answer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double discPrice;
        double discount;
        double Price;

        System.out.print("Enter discounted price: ");
        discPrice = sc.nextDouble();

        System.out.print("Enter discount percentage: ");
        discount = sc.nextDouble();

        Price = discPrice / (1 - discount / 100);

        System.out.println("Original Price = " + Price);

        sc.close();
    }
}