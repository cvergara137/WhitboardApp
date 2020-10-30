/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Model;
import View.View;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.TextField;
import static javafx.application.ConditionalFeature.FXML;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;

/**
 *
 * @author cvcol
 */
public class Controller {
    Model model; 
    View view; 
    
    public Controller() { 
        model = new Model(); 
        view = new View(this); 
        Controller controller = new Controller(model, view);
    } 
    
    public Controller(Model model, View view) { 
        this.model = model; 
        this.view = view; 
        

    }
    
    @FXML 
    private Canvas canvas; 
    
    @FXML 
    private ColorPicker Color; 
    
    @FXML 
    private TextField BrushSize; 
    
    @FXML 
    private MenuItem Undo; 
    
//    public void onSave() { 
//        try { 
//            Image snapshot = canvas.
//        }
    public void Exit() { 
        Platform.exit();
    
} 
    
    public void intialize() { 
//        GraphicsContext gc = canvas.getGraphicsContext2D();
    
    
    
}

}