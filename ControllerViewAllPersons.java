package sample;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class ControllerViewAllPersons implements Initializable {

    @FXML
    private TableColumn<Person, String> columnJob;

    @FXML
    private TableColumn<Person, String> columnLastName;

    @FXML
    private TableColumn<Person, String> columnID;

    @FXML
    private TableColumn<Person, String> columnCareer;

    @FXML
    private TableView<Person> tableView;

    @FXML
    private TableColumn<Person, String> columnProgress;

    @FXML
    private TableColumn<Person, String> columnName;

    @FXML
    private TextField textfieldUserID;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        columnID.setCellValueFactory(new PropertyValueFactory<>("id"));
        columnName.setCellValueFactory(new PropertyValueFactory<>("name"));
        columnLastName.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        columnJob.setCellValueFactory(new PropertyValueFactory<>("job"));
        columnCareer.setCellValueFactory(new PropertyValueFactory<>("career"));
        columnProgress.setCellValueFactory(new PropertyValueFactory<>("progress"));

        List<Person> listPersona = Person.getListPerson();

        tableView.setItems(FXCollections.observableArrayList(listPersona));
    }

    @FXML
    private void searchPerson(KeyEvent event) {
        if (event.getCode().equals(KeyCode.ENTER)) {
            try {
                for (int i = 0; i < Person.getListPerson().size(); i++) {
                    if (Integer.parseInt(textfieldUserID.getText()) == Integer.parseInt(Person.getListPerson().get(i).getId())) {
                        Alert dialogAlert = new Alert(Alert.AlertType.CONFIRMATION);
                        dialogAlert.setTitle("Message");
                        dialogAlert.setHeaderText(null);
                        dialogAlert.setContentText("User found: " + Person.getListPerson().get(i).getName() + " " + Person.getListPerson().get(i).getLastName()
                                + "\n \n" +
                                "Do you want to go see the profile?");
                        dialogAlert.initStyle(StageStyle.UTILITY);
                        if (dialogAlert.showAndWait().filter(ButtonType.OK::equals).isPresent()) {
                            ControllerViewPerson.personID = 0;
                            Parent root = FXMLLoader.load(getClass().getResource("fxml/ViewPerson.fxml"));
                            Stage primaryStage = new Stage();
                            primaryStage.setTitle("View data person");
                            primaryStage.setScene(new Scene(root, 600, 400));
                            primaryStage.setResizable(false);
                            primaryStage.show();
                        }
                    } else {
                        if (i == Person.getListPerson().size()) {
                            Alert dialogAlert = new Alert(Alert.AlertType.ERROR);
                            dialogAlert.setTitle("Alert");
                            dialogAlert.setHeaderText(null);
                            dialogAlert.setContentText("The user ID was not found.");
                            dialogAlert.initStyle(StageStyle.UTILITY);
                            dialogAlert.showAndWait();
                        }
                    }
                }
            } catch (NumberFormatException e) {
                Alert dialogAlert = new Alert(Alert.AlertType.ERROR);
                dialogAlert.setTitle("Alert");
                dialogAlert.setHeaderText(null);
                dialogAlert.setContentText("The user ID was not found.");
                dialogAlert.initStyle(StageStyle.UTILITY);
                dialogAlert.showAndWait();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
