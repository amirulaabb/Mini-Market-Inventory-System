/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory;

/**
 *
 * @author xinpanda
 */
public class Customer_1 {
    
    private String username;
    private String password;
    private String phone;
    
    public Customer_1(String username, String password, String phone) {
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
