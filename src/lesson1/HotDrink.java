package lesson1;

public class HotDrink extends Product {
    private int temperature;

    public HotDrink(String name, int number, int count, float price, int temperature) {
        super(name, number, count, price);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
