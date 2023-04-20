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
    private final Alert.AlertType alert;
    private final String title, message;

    public Popup(Alert.AlertType alert, String title, String message){
        this.alert = alert;
        this.title = title;
        this.message = message;
    }
    
    public void Alert(){
        Alert myalert = new Alert(this.alert);
        myalert.setTitle(this.title);
        myalert.setHeaderText(this.message);
        myalert.show();
    }
}
