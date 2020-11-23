/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Model;
import View.View;
import java.io.IOException;
import java.util.ArrayList;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author cvcol
 */
public class LoginController {

    Model model;
    View view;
    ArrayList<String> usernames = new ArrayList<String>();
    ArrayList<String> passwords = new ArrayList<String>();

    String user1 = "test";
    String pw1 = "test";

    public LoginController() {
        model = new Model();
    }
    
    public LoginController(Model model, View view) { 
        this.model = model; 
        this.view = view; 
        usernames.add(user1);
        passwords.add(pw1);
        
    }
    
    @FXML
    private Button Login;

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;
    
    @FXML
    public void LoginListener(ActionEvent event) throws IOException {
        if (username.getText().contains(user1) && password.getText().contains(pw1)) {
            System.out.println("Valid user");
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/WhiteboardFXML.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Whiteboard");
            stage.setScene(new Scene(root1));
            stage.show();
            stage.setOnCloseRequest(e -> Platform.exit());
        } else {
            System.out.println("Invalid user");
        }

    }

}
