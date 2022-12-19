package lesson1;

public class Product {
    private String name;
    private int number;
    private int count;
    private float price;

    public Product(String name, int number, int count, float price) {
        this.name = name;
        this.number = number;
        this.count = count;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "type='" + name + '\'' +
                ", number=" + number +
                ", count=" + count +
                ", price=" + price +
                '}';
    }
}
