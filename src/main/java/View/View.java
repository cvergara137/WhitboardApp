/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Controller;

/**
 *
 * @author cvcol
 */
public class View {
    private Controller controller;  
   

    public View(Controller controller) {
        this.controller = controller; 
    }

    public Controller getController() {
        return controller;
    }


}
