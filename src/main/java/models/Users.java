/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javafx.scene.control.Alert;

/**
 *
 * @author Jereco
 */
public class Users extends DBConnection {
    private String username, password;
    
    public Users(){}
    
    public Users(String username, String password){
        this.username = username;
        this.password = password;
    }
    //SETTER
    public void setUsername(String username){
        this.username = username;
    }
    public void setPassword(String password){
        this.password = password;
    }
    //GETTER
    public String getUsername(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }
    //METHODS
    public boolean Login(){
      
        try{
            PreparedStatement stmt = Users.getConnection().prepareStatement("SELECT * FROM users WHERE username = ? AND password = ?;");
            stmt.setString(1, this.username);
            stmt.setString(2, this.password);
            ResultSet res = stmt.executeQuery();
            return res.next();
        }catch(SQLException err){
            Popup popup = new Popup(Alert.AlertType.WARNING, "SQL Error", err.getMessage());
            popup.Alert();
            return false;
        }
    }
}
