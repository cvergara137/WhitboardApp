/*
 * Model class for passing to controller
 */
package Model;

import Controller.WhiteboardController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author cvcol
 */
public class Model {

    private WhiteboardController controller;
    static final Logger logger = LogManager.getLogger(Model.class);

    public WhiteboardController getController() {
        //logs error for model
        logger.error("Unable to run model class");
        return controller;
    }

    public void setController(WhiteboardController controller) {
        this.controller = controller;
    }
}
