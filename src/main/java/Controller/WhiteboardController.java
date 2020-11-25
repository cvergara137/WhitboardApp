/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Model;
import View.View;
import View.WhiteboardFX;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
//import org.apache.logging.log4j.LogManager;
import java.util.logging.Logger;
import static javafx.application.ConditionalFeature.FXML;
import javafx.application.Platform;
import javafx.embed.swing.SwingFXUtils;
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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.*;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.imageio.ImageIO;

/**
 *
 * @author cvcol
 */
public class WhiteboardController {
//    static final Logger logger = LogManager.getlogger(WhiteboardController.class);

    Model model;
    View view;
    ArrayList<String> usernames = new ArrayList<String>();
    ArrayList<String> passwords = new ArrayList<String>();

    String user1 = "test";
    String pw1 = "test";

    public WhiteboardController() {
//        logger.error("");
        model = new Model();
    }

    public WhiteboardController(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    @FXML
    private Canvas canvas;

    @FXML
    private ColorPicker color;

    @FXML
    private TextField BrushSize;

    @FXML
    private MenuItem Undo;

    @FXML
    private RadioButton Eraser;

    public void initialize() {
        GraphicsContext gc = canvas.getGraphicsContext2D();

        canvas.setOnMouseDragged(e -> {
            double size = Double.parseDouble(BrushSize.getText());
            double x = e.getX() - size / 2;
            double y = e.getY() - size / 2;

            if (Eraser.isSelected()) {
                gc.clearRect(x, y, size, size);
            } else {
                gc.setFill(color.getValue());
                gc.fillRect(x, y, size, size);
            }
        });
    }

    public void Exit() {
        Platform.exit();
    }

    public void Save() {
        try {
            Image snapshot = canvas.snapshot(null, null);
            ImageIO.write(SwingFXUtils.fromFXImage(snapshot, null), "png", new File("paint.png"));
        } catch (Exception e) {
            System.out.println("Failed to save image: " + e);
        }
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
        return color;
    }

    public void setColor(ColorPicker color) {
        this.color = color;
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

    public RadioButton getEraser() {
        return Eraser;
    }

    public void setEraser(RadioButton Eraser) {
        this.Eraser = Eraser;
    }

}
