package ba.unsa.etf.rs.projekat;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    public void unosstudenta(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/fxml/dashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 650, 650);
        Stage stage = new Stage();
        stage.setTitle("Dashboard");
        stage.setScene(scene);
        stage.show();
    }
}
