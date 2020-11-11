package com.mycompany.whiteboardv4;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cvcol
 */
public class App extends Application {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println(getClass().getResource("/fxml/LoginFrameXML.fxml"));
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/LoginFrameXML.fxml"));


        Scene scene = new Scene(root, 1300, 900);

//        primaryStage.setTitle("Welcome");
//        primaryStage.setScene(scene);
//        primaryStage.show();
    }
    
    
}
