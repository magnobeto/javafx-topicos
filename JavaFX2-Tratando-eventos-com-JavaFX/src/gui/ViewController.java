/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author Roberto
 */
public class ViewController{

    @FXML
    private Button btTest;
      
    @FXML
    public void onBtTestAction() {
        System.out.println("Click!");
    }    
}
