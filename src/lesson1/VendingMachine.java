package lesson1;

import java.util.List;
import java.util.Scanner;

public class VendingMachine {
    protected List<Product> products;
    protected Scanner sc = new Scanner(System.in);

    public VendingMachine(List<Product> products) {

        this.products = products;
    }


    public int enterNumber() {
        System.out.println("Select number of product: ");
        int productNumber = sc.nextInt();
        return productNumber;
    }

    public Product showProduct (int productNumber) {
        System.out.println("Selected product: " + products.get(productNumber));
        return products.get(productNumber);
    }

    public void buyProduct (Product products) {
        System.out.println("Insert the banknote into the bill acceptor");
        float deposit = 0f;
        while (true) {
            int cash = sc.nextInt();
            deposit += cash;
            if (deposit < products.getPrice()) {
                System.out.printf("Insufficient funds. Please, pay extra %f\n", products.getPrice() - deposit);
            } else if (deposit > products.getPrice()) {
                System.out.printf("Here's your change %f\n", deposit - products.getPrice());
                System.out.println("Please, pick up your product");
                getProduct(products);
                break;
            } else {
                System.out.println("Please, pick up your product");
                getProduct(products);
                break;
            }
        }
        System.out.println("You are welcome!");
    }

    private void getProduct(Product products) {
        int productCount = products.getCount();
        products.setCount(productCount - 1);
        System.out.println("Count of product: " + products.getCount());
    }
}
