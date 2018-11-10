/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 *
 * @author Dominik
 */
public class registrationController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private TextField txtFdName;

    @FXML
    private TextField txFdMail;

    @FXML
    private PasswordField txFdPw2;

    @FXML
    private PasswordField txFdPw1;

    @FXML
    private TextField txFdPhone;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
