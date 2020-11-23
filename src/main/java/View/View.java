/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.LoginController;
import Controller.WhiteboardController;

/**
 *
 * @author cvcol
 */
public class View {
    private WhiteboardController wcontroller;  
    private LoginController lcontroller;
//    private LoginFrameFX loginFX; 

    public View(WhiteboardController wcontroller, LoginController lcontroller) {
        wcontroller = this.wcontroller; 
        lcontroller = this.lcontroller;
    }

//    public WhiteboardController getController() {
//        return controller;
//    }
//
//    public LoginFrameFX getLoginFX() {
//        return loginFX;
//    }
//
//    public void setController(WhiteboardController controller) {
//        this.controller = controller;
//    }
//
//    public void setLoginFX(LoginFrameFX loginFX) {
//        this.loginFX = loginFX;
//    }
//

}
