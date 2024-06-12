package Manav;

public class CartItem {
    private Product product;
    private double quantity;

    public CartItem(Product product, double quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return product.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return String.format("%-15s  %.2f kg  %.2f TL", product.getName(), quantity, getTotalPrice());
    }
}

