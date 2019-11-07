import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> products;
    private Counter counter;
    public Store() { products = new ArrayList<>(); }
    public void addProduct(String name, double price, int qty) {
        products.add(new Product(name, price, qty));
    }
    // นับจํานวนสินค้าทั้งหมด ทั้งมีในสต็อคหรือหมดสต็อคแล้ว public int countAllProduct() {
    public int countProduct(Counter counter){
        int count = 0 ;
        for (Product product : products) {
            count += counter.count(product);
        }
        return count;
    }
}