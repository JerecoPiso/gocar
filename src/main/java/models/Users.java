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
public class Users extends DBConnection  {
    private String username, password;
    
    Popup popup = new Popup();
    
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
<<<<<<< HEAD
            PreparedStatement stmt = Users.getConnection().prepareStatement("SELECT * FROM users WHERE username = ? AND password = ?;");
=======
            PreparedStatement stmt = Users.getConnection().prepareStatement("SELECT username, password FROM users WHERE username = ? AND PASSWORD = ?;");
>>>>>>> b2505880afa3c00ece8fb61df3a708df8b87afdf
            stmt.setString(1, this.username);
            stmt.setString(2, this.password);
            ResultSet rs = stmt.executeQuery();
            return rs.next();
        }catch(SQLException err){
            popup.Alert(Alert.AlertType.WARNING, "SQL Error", err.getMessage());
            return false;
        }
    }
    public boolean UsernameChecker(){
        try{
            PreparedStatement stmt = Users.getConnection().prepareStatement("SELECT username FROM users WHERE username = ?;");
            stmt.setString(1, this.username);
            ResultSet rs = stmt.executeQuery();
            return rs.next();
        }catch(SQLException err){
            popup.Alert(Alert.AlertType.WARNING, "SQL Error", err.getMessage());
            return false;
        }
    }
    public int Register(){
        try{
            PreparedStatement stmt = Users.getConnection().prepareStatement("INSERT INTO users (username, password) VALUES (?, ?);");
            stmt.setString(1, this.username);
            stmt.setString(2, this.password);
            return stmt.executeUpdate();
        }catch(SQLException err){
            popup.Alert(Alert.AlertType.WARNING, "SQL Error", err.getMessage());
            return 0;
        }
    }
}
