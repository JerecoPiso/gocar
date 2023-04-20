/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import org.mindrot.jbcrypt.BCrypt;
        
/**
 *
 * @author Jereco
 */
public class Hasher {
    private String password;
    
    public Hasher(){
        
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
//         String salt = BCrypt.gensalt();
//        String hashedPassword = BCrypt.hashpw(password, salt);
        return "xf";
    }
}
