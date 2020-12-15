/*
 * Controller for Login Screen
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
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author cvcol
 */
public class LoginController {

    Model model;
    View view;

    //ArrayLists for holding username and password.
    ArrayList<String> usernames = new ArrayList<String>();
    ArrayList<String> passwords = new ArrayList<String>();
    static final Logger logger = LogManager.getLogger(LoginController.class);

    //Only username test and password test allow for logging in.
    String user1 = "test";
    String pw1 = "test";

    public LoginController() {
        //logger to report an error in login controlle.
        logger.error("Unable to run LoginController");
        model = new Model();
    }

    public LoginController(Model model, View view) {
        this.model = model;
        this.view = view;
        usernames.add(user1);
        passwords.add(pw1);

    }

    //Login screen components 
    @FXML
    private Button Login;

    @FXML
    private Button Create;

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    //login screen listener to go to whiteboard screen
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

    //create new user listener button to go to create new user screen
    @FXML
    public void CreateNewUser(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/CreateNewUserFXML.fxml"));
        Parent root2 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Create New User");
        stage.setScene(new Scene(root2));
        stage.show();
        stage.setOnCloseRequest(e -> Platform.exit());
    }

}
