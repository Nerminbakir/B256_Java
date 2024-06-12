package Manav;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Market {
    private List<Product> productList;
    private List<CartItem> cart;
    private Scanner scanner;

    public Market() {
        productList = new ArrayList<>();
        cart = new ArrayList<>();
        scanner = new Scanner(System.in);
        initializeProducts();
    }

    private void initializeProducts() {
        productList.add(new Product(0, "Domates", 2.10));
        productList.add(new Product(1, "Patates", 3.20));
        productList.add(new Product(2, "Biber", 1.50));
        productList.add(new Product(3, "Soğan", 2.30));
        productList.add(new Product(4, "Havuç", 3.10));
        productList.add(new Product(5, "Elma", 1.20));
        productList.add(new Product(6, "Muz", 1.90));
        productList.add(new Product(7, "Çilek", 6.10));
        productList.add(new Product(8, "Kavun", 4.30));
        productList.add(new Product(9, "Üzüm", 2.70));
        productList.add(new Product(10, "Limon", 0.50));
    }

    private void showProducts() {
        System.out.println("No   Ürün             Fiyat");
        System.out.println("==== =============== =========");
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    private Product selectProduct() {
        System.out.print("Lütfen ürün numarasını giriniz: ");
        int productId = scanner.nextInt();
        if (productId >= 0 && productId < productList.size()) {
            return productList.get(productId);
        } else {
            System.out.println("Geçersiz ürün numarası. Lütfen tekrar deneyin.");
            return selectProduct();
        }
    }

    private double askQuantity() {
        System.out.print("Kaç kg almak istiyorsunuz? ");
        return scanner.nextDouble();
    }

    private void addToCart(Product product, double quantity) {
        cart.add(new CartItem(product, quantity));
    }

    private void showCart() {
        System.out.println("Sepetiniz:");
        System.out.println("Ürün            Miktar  Fiyat");
        System.out.println("==============================");
        for (CartItem item : cart) {
            System.out.println(item);
        }
    }

    private boolean askContinue() {
        System.out.print("Başka bir ürün almak istiyor musunuz? (E/H): ");
        char choice = scanner.next().toUpperCase().charAt(0);
        return choice == 'E';
    }

    private void checkout() {
        double total = 0;
        for (CartItem item : cart) {
            total += item.getTotalPrice();
        }
        System.out.printf("Toplam ödeme: %.2f TL\n", total);
        System.out.print("Ödeme miktarını giriniz: ");
        double payment = scanner.nextDouble();
        if (payment >= total) {
            double change = payment - total;
            System.out.printf("Para üstü: %.2f TL\n", change);
        } else {
            System.out.println("Yetersiz ödeme. Alışverişi iptal ediniz.");
        }
    }

    public void startShopping() {
        boolean continueShopping;
        do {
            showProducts();
            Product selectedProduct = selectProduct();
            double quantity = askQuantity();
            addToCart(selectedProduct, quantity);
            showCart();
            continueShopping = askContinue();
        } while (continueShopping);
        checkout();
    }

    public static void main(String[] args) {
        Market market = new Market();
        market.startShopping();
    }
}
