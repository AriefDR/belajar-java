package programmer.zaman.now.data;

public class ProductApp {
    static void main(String[] args) {
        Product product = new Product("Mac m1", 10000000);
        System.out.println(product.name);
        System.out.println(product.price);


        Product product2 = new Product("Mac m1", 10000000);
        System.out.println(product.equals(product2));
        System.out.println(product.hashCode() == product2.hashCode());
    }
}
