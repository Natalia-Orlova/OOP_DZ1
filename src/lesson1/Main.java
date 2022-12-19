package lesson1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        VendingMachine machine = new VendingMachine(Arrays.asList (
//                new Product ("Lipton", 1, 10, 59.9f),
//                new Product ("Milka", 2, 15, 70.5f),
//                new Product("J7", 3, 20, 99.9f),
//                new HotDrink ("Cappuccino", 4, 20, 150, 65)
//        ));

//        int number = machine.enterNumber();
//        Product products = machine.showProduct(number - 1);
//        machine.buyProduct(products);


        HotDrinksMachine hotDrinksMachine = new HotDrinksMachine(Arrays.asList(
                new HotDrink ("Americano", 5, 20, 160, 80),
                new HotDrink ("Latte", 6, 20, 155, 70)
                ));

        String name = hotDrinksMachine.enterName();
        int temperature = hotDrinksMachine.enterTemperature();
        Product products = hotDrinksMachine.getProduct(name, temperature);
        hotDrinksMachine.buyProduct(products);
    }
}
