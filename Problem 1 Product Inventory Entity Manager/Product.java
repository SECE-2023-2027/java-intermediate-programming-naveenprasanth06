public class Product {
    private String productId;
    private String productName;
    private double price;
    private int stockQuantity;
    Product(String productId, String productName, double price, int stockQuantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = (price < 0) ? 0.0 : price;
        this.stockQuantity = (stockQuantity < 0) ? 0 : stockQuantity;
    }
    public String getProductId() {
        return productId;
    }
    public String getProductName() {
        return productName;
    }
    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }
    public void setPrice(double price) {
        this.price = (price < 0) ? 0.0 : price;
    }
    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = (stockQuantity < 0) ? 0 : stockQuantity;
    }
    public void applyDiscount(double percentage) {
        price = price - (price * percentage / 100);
    }
}