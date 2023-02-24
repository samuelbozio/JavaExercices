import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        programa programa = new programa();

        System.out.println("Enter the product data:");
        System.out.println("Name: ");
        programa.name = sc.nextLine();
        System.out.println("Price: ");
        programa.price = sc.nextDouble();
        System.out.println("Quantity: ");
        programa.quantity = sc.nextInt();

        System.out.println("Product data: " + programa.name + ", " + "$" + programa.price + ", "+ programa.quantity);

        System.out.println("Enter the number of products to be added in stock: ");
        programa.quantity = sc.nextInt();
        programa.AddProducts(programa.quantity);
        System.out.println(programa.quantity);
        System.out.println(programa.TotalValueStock());





        sc.close();
    }
}