/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Model;
import View.View;
import java.awt.MenuItem;
import java.awt.TextField;
//import org.apache.logging.log4j.LogManager;
import java.util.logging.Logger;
import static javafx.application.ConditionalFeature.FXML;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.paint.*;

/**
 *
 * @author cvcol
 */
public class Controller {
//    static final Logger logger = LogManager.getlogger(Controller.class);
    Model model; 
    View view; 
    
    public Controller() { 
//        logger.error("");
        model = new Model(); 
        view = new View(this); 
    } 
    
//    public Controller(Model model, View view) { 
//        this.model = model; 
//        this.view = view; 
//        
//
//    }
//    
//    @FXML 
//    private Canvas canvas; 
//    
//    @FXML 
//    private ColorPicker Color; 
//    
//    @FXML 
//    private TextField BrushSize; 
//    
//    @FXML 
//    private MenuItem Undo; 
//    
//    @FXML 
//    private Button Eraser; 
//    
////    public void onSave() { 
////        try { 
////            Image snapshot = canvas.
////        }
//    public void Exit() { 
//        Platform.exit();
//    
//} 
//    //method for implementing GraphicsContext class 
//    public void intialize() { 
//        GraphicsContext gc = canvas.getGraphicsContext2D();
//        
//        canvas.setOnMouseDragged(e -> { 
//            double size = Double.parseDouble(BrushSize.getText()); 
//            double x = e.getX() - size / 2; 
//            double y = e.getY() - size / 2; 
//            
//            if (Eraser.isPressed()) { 
//                gc.clearRect(y, y, size, size); 
//            } else { 
//                gc.setFill(Color.getValue()); 
//                gc.fillRect(y, y, size, size);
//                
//            }
//            
//        });
//        
//        
//        
//    
//}

}