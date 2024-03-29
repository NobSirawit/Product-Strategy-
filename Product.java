public class Product {
    private String name; // ชื่อสินค้า
    private double price; // ราคาสินค้า
    private int quantity; // จํานวนในสต็อคของสินค้านี้
    // ...constructor, get/set methods ครบถ้วน...

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
