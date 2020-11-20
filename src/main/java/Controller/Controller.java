/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Model;
import View.View;
import View.WhiteboardFX;
import java.io.IOException;
import java.util.ArrayList;
//import org.apache.logging.log4j.LogManager;
import java.util.logging.Logger;
import static javafx.application.ConditionalFeature.FXML;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.*;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author cvcol
 */
public class Controller {
//    static final Logger logger = LogManager.getlogger(Controller.class);

    Model model;
    View view;
    ArrayList<String> usernames = new ArrayList<String>();
    ArrayList<String> passwords = new ArrayList<String>();

    String user1 = "test";
    String pw1 = "test";

    public Controller() {
//        logger.error("");
        model = new Model();
        view = new View(this);
    }

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        usernames.add(user1);
        passwords.add(pw1);
    }

    @FXML
    private Canvas canvas;

    @FXML
    private ColorPicker Color;

    @FXML
    private TextField BrushSize;

    @FXML
    private MenuItem Undo;

    @FXML
    private Button Eraser;

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
//            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("Whiteboard");
            stage.setScene(new Scene(root1));
            stage.show();
            stage.setOnCloseRequest(e -> Platform.exit());
        } else {
            System.out.println("Invalid user");
        }

    }
//    
//    public void onSave() { 
//        try { 
//            Image snapshot = canvas.
//        } 

    //method for implementing GraphicsContext class 

    public void intialize() {
        GraphicsContext gc = canvas.getGraphicsContext2D();

        canvas.setOnMouseDragged(e -> {
            System.out.println("Test");
            double size = Double.parseDouble(BrushSize.getText());
            double x = e.getX() - size / 2;
            double y = e.getY() - size / 2;

            if (Eraser.isPressed()) {
                gc.clearRect(x, y, size, size);
            } else {
                gc.setFill(Color.getValue());
                gc.fillRect(x, y, size, size);
            }
        });
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

    public ArrayList<String> getUsernames() {
        return usernames;
    }

    public void setUsernames(ArrayList<String> usernames) {
        this.usernames = usernames;
    }

    public ArrayList<String> getPasswords() {
        return passwords;
    }

    public void setPasswords(ArrayList<String> passwords) {
        this.passwords = passwords;
    }

    public String getUser1() {
        return user1;
    }

    public void setUser1(String user1) {
        this.user1 = user1;
    }

    public String getPw1() {
        return pw1;
    }

    public void setPw1(String pw1) {
        this.pw1 = pw1;
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public void setCanvas(Canvas canvas) {
        this.canvas = canvas;
    }

    public ColorPicker getColor() {
        return Color;
    }

    public void setColor(ColorPicker Color) {
        this.Color = Color;
    }

    public TextField getBrushSize() {
        return BrushSize;
    }

    public void setBrushSize(TextField BrushSize) {
        this.BrushSize = BrushSize;
    }

    public MenuItem getUndo() {
        return Undo;
    }

    public void setUndo(MenuItem Undo) {
        this.Undo = Undo;
    }

    public Button getLogin() {
        return Login;
    }

    public void setLogin(Button Login) {
        this.Login = Login;
    }

    public TextField getUsername() {
        return username;
    }

    public void setUsername(TextField username) {
        this.username = username;
    }

    public PasswordField getPassword() {
        return password;
    }

    public void setPassword(PasswordField password) {
        this.password = password;
    }

    public Button getEraser() {
        return Eraser;
    }

    public void setEraser(Button Eraser) {
        this.Eraser = Eraser;
    }

}
