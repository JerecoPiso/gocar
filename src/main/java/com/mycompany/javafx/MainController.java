/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.javafx;
import java.io.IOException;
import models.Users;
import models.Popup;
import models.Hasher;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.Alert;

/**
 * FXML Controller class
 *
 * @author Jereco
 */
public class MainController {
    @FXML
    private Button button;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    /**
     * Initializes the controller class.
     */
    @FXML
    private void switchToPrimary() throws IOException {
        
        Hasher hasher = new Hasher();
        hasher.setPassword(password.getText());
        
        Users user = new Users(username.getText(), hasher.getPassword());
        boolean res = user.Login();
        if(res){
            App.setRoot("renter");  
            Stage stage = (Stage)button.getScene().getWindow();
            stage.close();
        }else{
            Popup popup = new Popup(Alert.AlertType.WARNING, "Not found", "User not found");
            popup.Alert();
        }
    }
}
