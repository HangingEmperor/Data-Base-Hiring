package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerHome implements Initializable {

    @FXML
    private void addPeople() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("fxml/CreatePerson.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Create person");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    @FXML
    private void viewPeople() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("fxml/ViewAllPersons.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("View all persons");
        primaryStage.setScene(new Scene(root, 600, 600));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    @FXML
    private void viewDataPeople() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("fxml/ViewPerson.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("View data person");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
