
package inventory;

public class Order_1 {
    
    private int id;
    private String details;
    private int quantity;
    private String date;
    private Product_1 product;
    private Category_1 category;
    
    public Order_1(int id, String details, int quantity, String date, Product_1 product, Category_1 category) {
        this.id = id;
        this.details = details;
        this.quantity = quantity;
        this.date = date;
        this.product = product;
        this.category = category;
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getDetails() {
        return this.details;
    }
    
    public void setDetails(String details) {
        this.details = details;
    }
    
    public int getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public String getDate() {
        return this.date;
    }
    
    public void setDate(String date) {
        this.date = date;
    }
    
    public Product_1 getProduct() {
        return this.product;
    }
    
    public void setProduct(Product_1 product) {
        this.product = product;
    }
    
    public Category_1 getCategory() {
        return this.category;
    }
    
    public void setCategory(Category_1 category) {
        this.category = category;
    }
    
    
    public String toString() {
        return String.valueOf(this.id) + "\t" + this.details + "\t" + String.valueOf(this.quantity) + "\t" + this.date + "\t" + String.valueOf(this.product.getId()) + "\t" + String.valueOf(this.product.getCategory().getCateId());
    }
}
