/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.javafx;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.net.URL;
import javafx.fxml.FXML;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author Jereco
 */
public class DashboardController implements Initializable {
    @FXML
    private Label displayDate;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        SimpleDateFormat formatter = new SimpleDateFormat("E, MMM dd yyyy hh:mm:ss a");
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), event -> {
             Date date = new Date();
             displayDate.setText(formatter.format(date));
        }));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
      
    }    
}
