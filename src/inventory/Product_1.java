
package inventory;

public class Product_1 {
    
    private int id;
    private String title;
    private String des;
    private int quantity;
    private String status;
    private double price;
    private Category_1 category;
    
    public Product_1(int cateId, String cateTitle, String cateDes, int cateQuantity, String cateStatus, double price, Category_1 category) {
        this.id = cateId;
        this.title = cateTitle;
        this.des = cateDes;
        this.quantity = cateQuantity;
        this.status = cateStatus;
        this.price = price;
        this.category = category;
        
        System.out.println(this.category.getCateId());
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setId(int cateId) {
        this.id = cateId;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String cateTitle) {
        this.title = cateTitle;
    }
    
    public String getDes() {
        return this.des;
    }
    
    public void setDes(String cateDes) {
        this.des = cateDes;
    }
    
    public int getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(int cateQuantity) {
        this.quantity = cateQuantity;
    }
    
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String cateStatus) {
        this.status = cateStatus;
    }
    
    public double getPrice() {
        return this.price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public Category_1 getCategory() {
        return this.category;
    }
    
    public void setCategory(Category_1 category) {
        this.category = category;
    }
    
    public String toString() {
        return String.valueOf(this.id) + "\t" + this.title + "\t" + this.des + "\t" + String.valueOf(this.quantity) + "\t" + this.status + "\t" + String.valueOf(this.price) + "\t" + String.valueOf(this.category.getCateId());
    }
}
