
package inventory;

public class User_1 {
    
    private String username;
    private String password;
    private String phone;
    
    public User_1(String username, String password, String phone) {
        this.username = username;
        this.password = password;
        this.phone = phone;
    }
    
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public void setPasword(String password) {
        this.password = password;
    }
    
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String toString() {
        return this.username + "\t" + this.password + "\t" + this.phone;
    }
}
