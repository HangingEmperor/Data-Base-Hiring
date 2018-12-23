package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.InputEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.File;

public class ControllerCreatePerson {

    @FXML
    private TextField textfieldPhone;

    @FXML
    private DatePicker datepickerBirthday;

    @FXML
    private Button buttonImportImage;

    @FXML
    private TextField textfieldAdress;

    @FXML
    private TextField textfieldEmail;

    @FXML
    private TextField textfieldCity;

    @FXML
    private ImageView imageView;

    @FXML
    private TextField textfieldName;

    @FXML
    private Button buttonSave;

    @FXML
    private Button buttonCancel;

    @FXML
    private TextField textfieldState;

    @FXML
    private TextField textfieldLastName;

    @FXML
    private ProgressBar progressBar;

    @FXML
    private TextField textfieldJob;

    @FXML
    private TextField textfieldCountry;

    @FXML
    private TextField textfieldMobile;

    @FXML
    private TextField textfieldCarreer;

    public static int id = 0;
    double progress = 0;

    @FXML
    private void saveButton(InputEvent e) {
        id++;
        Person add = new Person(textfieldName.getText(), textfieldLastName.getText(), datepickerBirthday.getPromptText(),
                textfieldAdress.getText(), textfieldCity.getText(), textfieldState.getText(), textfieldCountry.getText(),
                textfieldCarreer.getText(), textfieldPhone.getText(), textfieldMobile.getText(), textfieldEmail.getText(),
                imageView.getImage(), Integer.toString(id), progressBar.getProgress() * 100, textfieldJob.getText());
        Person.addPerson(add);

        Alert dialogAlert = new Alert(Alert.AlertType.INFORMATION);
        dialogAlert.setTitle("Message");
        dialogAlert.setHeaderText(null);
        dialogAlert.setContentText("Your user has been successfully created.");
        dialogAlert.initStyle(StageStyle.UTILITY);
        dialogAlert.showAndWait();

        final Node source = (Node) e.getSource();
        final Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }

    @FXML
    public void closeWindow(ActionEvent e) {
        final Node source = (Node) e.getSource();
        final Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void addProgress(ActionEvent event) {
        System.out.println("Si");
        progress = progress + 0.2;
        progressBar.setProgress(0.5);
    }

    @FXML
    private void importImage(ActionEvent e) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select an image");

        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg"));

        final Node source = (Node) e.getSource();
        final Stage stage = (Stage) source.getScene().getWindow();

        File file = fileChooser.showOpenDialog(stage);
        imageView.setImage(new Image(file.toURI().toString()));
    }
}
