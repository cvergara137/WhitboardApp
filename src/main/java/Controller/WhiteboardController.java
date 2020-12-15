/*
 * This class is the controller for WhiteboardFXML file.
 */
package Controller;

import Model.Model;
import View.View;
import java.io.File;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import javafx.application.Platform;
import javafx.embed.swing.SwingFXUtils;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javax.imageio.ImageIO;

/**
 *
 * @author cvcol
 */
public class WhiteboardController {

    //logger to display error for whiteboard controller
    static final Logger logger = LogManager.getLogger(WhiteboardController.class);
    Model model;
    View view;

    public WhiteboardController() {
        logger.error("Unable to run WhiteboardController");
        model = new Model();
    }

    public WhiteboardController(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    //components for whiteboard screen
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

    //method for implementing drawing and erasing functionalties
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

    //method for menu item to exit the program.
    public void Exit() {
        Platform.exit();
    }

    //method for saving the drawing, however, I was unable to get this to work
    public void Save() {
        try {
            Image snapshot = canvas.snapshot(null, null);
            ImageIO.write(SwingFXUtils.fromFXImage(snapshot, null), "png", new File("/images/paint.png"));
        } catch (Exception e) {
            System.out.println("Failed to save image: " + e);
        }
    }

    //getters and setters
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
