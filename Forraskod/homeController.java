
package cinema;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class homeController implements Initializable {

    
    @FXML
    private Button nextToRegistration;
    
     @FXML
    private void nextToRegistration(ActionEvent e) throws IOException{
        
                Stage mainStage = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("registrationFXML.fxml"));
                Scene scene = new Scene(root);
                mainStage.setScene(scene);
                 //itt adom hozzá, hogy a CSS formázásokat vegye figyelembe
                scene.getStylesheets().add("CSS/registrationStyle.css"); 
                
                mainStage.show();

        
     //   Exit(e);
        
         System.out.println("  malac ");
      
    }
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
