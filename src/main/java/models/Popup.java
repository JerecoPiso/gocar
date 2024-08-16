/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import javafx.scene.control.Alert;
/**
 *
 * @author Jereco
 */
public class Popup {
    public Popup(){}
    
    public void Alert(Alert.AlertType alert, String title, String message){
        Alert myalert = new Alert(alert);
        myalert.setTitle(title);
        myalert.setHeaderText(message);
        myalert.show();
    }
}
