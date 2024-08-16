/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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
<<<<<<< HEAD
        String salt = BCrypt.gensalt();
        String hashedPassword = BCrypt.hashpw(password, salt);
        return hashedPassword;
=======
       
        return this.password;
>>>>>>> b2505880afa3c00ece8fb61df3a708df8b87afdf
    }
    public  String hashPassword() throws NoSuchAlgorithmException{

        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(password.getBytes());
        byte[] byteData = md.digest();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < byteData.length; i++) {
            sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }
        this.password = sb.toString();
        return this.password;
    }
   
    
    //check password
    //     public static String hashPassword(String password) throws NoSuchAlgorithmException {
    //        MessageDigest md = MessageDigest.getInstance("SHA-256");
    //        md.update(password.getBytes());
    //        byte[] byteData = md.digest();
    //
    //        StringBuilder sb = new StringBuilder();
    //        for (int i = 0; i < byteData.length; i++) {
    //            sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
    //        }
    //        return sb.toString();
    //    }
    //
    //    public static boolean checkPassword(String enteredPassword, String storedHashedPassword) throws NoSuchAlgorithmException {
    //        String hashedEnteredPassword = hashPassword(enteredPassword);
    //        return hashedEnteredPassword.equals(storedHashedPassword);
    //    }
    //
    //    public static void main(String[] args) throws NoSuchAlgorithmException {
    //        String storedHashedPassword = "1a79a4d60de6718e8e5b326e338ae533";
    //        String enteredPassword = "myPassword123";
    //        boolean passwordMatches = checkPassword(enteredPassword, storedHashedPassword);
    //        System.out.println(passwordMatches ? "Password matches" : "Password does not match");
    //    }
}
