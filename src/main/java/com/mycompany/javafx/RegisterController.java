/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.javafx;
import models.Users;
import models.Popup;
import java.sql.SQLException;
import java.io.IOException;
import java.net.URL;
import java.security.NoSuchAlgorithmException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import models.Hasher;

/**
 * FXML Controller class
 *
 * @author Jereco
 */
public class RegisterController implements Initializable {
    @FXML
    private Button button;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password, retypepassword;
    
    Popup popup = new Popup();
    /**
     * Initializes the controller class.
     */
     @FXML
    private void showLoginForm() throws IOException {
         App.setRoot("main");  
         Stage stage = (Stage)button.getScene().getWindow();
         stage.close();
    }
    @FXML
    private void register() throws SQLException{
        try{
            if(!username.getText().isEmpty()){
                if(!password.getText().isEmpty()){
                    if(password.getText().equals(retypepassword.getText())){
                        Hasher hasher = new Hasher();
                        hasher.setPassword(password.getText());
                        hasher.hashPassword();
                        Users user = new Users(username.getText(), hasher.getPassword());
                        if(!user.UsernameChecker()){
                            int ret = user.Register();
                            if(ret > 0){
                                username.setText("");
                                password.setText("");
                                retypepassword.setText("");
                                popup.Alert(Alert.AlertType.CONFIRMATION, "Success" , "Registered successfully");
                            }else{
                                popup.Alert(Alert.AlertType.ERROR, "Error" , "Unable to register!");
                            }
                        }else{
                            popup.Alert(Alert.AlertType.ERROR, "Error" , "Username already exists!");
                        }
                    }else{
                        popup.Alert(Alert.AlertType.WARNING, "Warning" , "Password didn't matched!");
                    }
                }else{
                    popup.Alert(Alert.AlertType.WARNING, "Warning" , "Password is required!");
                }
            }else{
                popup.Alert(Alert.AlertType.WARNING, "Warning" , "Username is required!");
            }
        }catch(NoSuchAlgorithmException err){
            popup.Alert(Alert.AlertType.WARNING, "Error" , err.getMessage());
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
