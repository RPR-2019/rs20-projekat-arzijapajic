package ba.unsa.etf.rs.projekat;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Control;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardController {

    public void openemployees(ActionEvent actionEvent) throws IOException {

            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/fxml/employees.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 1200 ,Control.USE_PREF_SIZE );
            Stage stage = new Stage();
            stage.setTitle("Dashboard");
            stage.setScene(scene);
            stage.show();
        }

}
