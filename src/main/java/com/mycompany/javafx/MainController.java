/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.javafx;
import models.Users;
import models.Popup;
import models.Hasher;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
        
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
public class MainController extends Popup {
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
    private void login() throws IOException {
        try{
            //hash password        
            Hasher hasher = new Hasher();
            hasher.setPassword(password.getText());
            hasher.hashPassword();
            Users user = new Users(username.getText(), hasher.getPassword());
            boolean res = user.Login();
            if(res){
                App.setRoot("dashboard");  
                Stage stage = (Stage)button.getScene().getWindow();
                stage.close();
            }else{
                Alert(Alert.AlertType.WARNING, "Not found", "User not found");
            }
        }catch(NoSuchAlgorithmException err){
            Alert(Alert.AlertType.WARNING, "Error", err.getMessage());
        }
    }
    @FXML
    private void showRegisterForm() throws IOException {
         App.setRoot("register");  
         Stage stage = (Stage)button.getScene().getWindow();
         stage.setResizable(false);
         stage.close();
    }
}
