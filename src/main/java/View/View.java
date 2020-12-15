/*
 * View class
 */
package View;

import Controller.LoginController;
import Controller.WhiteboardController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author cvcol
 */
public class View {

    private WhiteboardController wcontroller;
    private LoginController lcontroller;
    static final Logger logger = LogManager.getLogger(View.class);

    public View(WhiteboardController wcontroller, LoginController lcontroller) {
        wcontroller = this.wcontroller;
        lcontroller = this.lcontroller;
        //logs error for view class
        logger.error("Unable to run view class");
    }

    //getters and setters
    public WhiteboardController getWcontroller() {
        return wcontroller;
    }

    public void setWcontroller(WhiteboardController wcontroller) {
        this.wcontroller = wcontroller;
    }

    public LoginController getLcontroller() {
        return lcontroller;
    }

    public void setLcontroller(LoginController lcontroller) {
        this.lcontroller = lcontroller;
    }

}
