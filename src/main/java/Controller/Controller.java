/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Model;
import View.View;
import View.WhiteboardFX;
import java.awt.MenuItem;
import java.awt.TextField;
import java.util.ArrayList;
//import org.apache.logging.log4j.LogManager;
import java.util.logging.Logger;
import static javafx.application.ConditionalFeature.FXML;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.PasswordField;
import javafx.scene.paint.*;

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
    public void LoginListener(ActionEvent event) { 
        if (username.getText().contains(user1) && username.getText().contains(pw1)) { 
            WhiteboardFX.launch(WhiteboardFX.class);
        }
    }
//    
//    public void onSave() { 
//        try { 
//            Image snapshot = canvas.
//        }
    public void Exit() { 
        Platform.exit();
    
} 
    //method for implementing GraphicsContext class 
    public void intialize() { 
        GraphicsContext gc = canvas.getGraphicsContext2D();
        
        canvas.setOnMouseDragged(e -> { 
            double size = Double.parseDouble(BrushSize.getText()); 
            double x = e.getX() - size / 2; 
            double y = e.getY() - size / 2; 
            
            if (Eraser.isPressed()) { 
                gc.clearRect(y, y, size, size); 
            } else { 
                gc.setFill(Color.getValue()); 
                gc.fillRect(y, y, size, size);            
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

    public Button getEraser() {
        return Eraser;
    }

    public void setEraser(Button Eraser) {
        this.Eraser = Eraser;
    }

}