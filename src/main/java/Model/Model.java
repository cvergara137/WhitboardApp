/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.WhiteboardController;

/**
 *
 * @author cvcol
 */
public class Model {
private WhiteboardController controller;  

    public WhiteboardController getController() {
        return controller;
    }

    public void setController(WhiteboardController controller) {
        this.controller = controller;
    }
}
