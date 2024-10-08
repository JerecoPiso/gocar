package com.mycompany.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.StageStyle;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
<<<<<<< HEAD
        scene = new Scene(loadFXML("renter"));
//        stage.initStyle(StageStyle.UNDECORATED);
=======
        scene = new Scene(loadFXML("main"));
        stage.initStyle(StageStyle.DECORATED);
>>>>>>> b2505880afa3c00ece8fb61df3a708df8b87afdf
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
            FXMLLoader fxmlloader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
            Parent newscene = (Parent) fxmlloader.load();
            Stage signup = new Stage();
            signup.setScene(new Scene(newscene)); 
            signup.show();
            //scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}