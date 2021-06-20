
package inventory;

public class Category_1 {
    
    private int cateId;
    private String cateTitle;
    
    public Category_1(int cateId, String cateTitle) {
        this.cateId = cateId;
        this.cateTitle = cateTitle;
    }
    
    public int getCateId() {
        return this.cateId;
    }
    
    public void setCateId(int cateId) {
        this.cateId = cateId;
    }
    
    public String getCateTitle() {
        return this.cateTitle;
    }
    
    public void setCateTitle(String cateTitle) {
        this.cateTitle = cateTitle;
    }
    
    public String toString() {
        return String.valueOf(this.cateId) + "\t" + this.cateTitle;
    }
}
