package lesson1;

import java.util.List;

public class HotDrinksMachine extends VendingMachine{

    public HotDrinksMachine(List<Product> products) {
        super(products);
    }

    public String enterName() {
        System.out.println("Enter name of product: ");
        String productName = sc.next();
        return productName;
    }

    public int enterTemperature() {
        System.out.println("Enter temperature of product: ");
        int productTemperature = sc.nextInt();
        return productTemperature;
    }

    public Product getProduct(String name, int temperature) {
        for (Product product : products) {
            if (!(product instanceof HotDrink)) {
                continue;
            }
            if (product.getName().equals (name) &&
                    ((HotDrink) product).getTemperature() == temperature) {
                return product;
            }
        }
        throw new IllegalStateException("Product not found!");
    }

}
