package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerViewPerson implements Initializable {

    public static int personID;

    @FXML
    private TextField textfieldPhone;

    @FXML
    private Label labelBirthday;

    @FXML
    private TextField textfieldLastname;

    @FXML
    private TextField textfieldAdress;

    @FXML
    private Label labelCountry;

    @FXML
    private TextField textfieldEmail;

    @FXML
    private ImageView imageView;

    @FXML
    private TextField textfieldCity;

    @FXML
    private TextField textfieldID;

    @FXML
    private TextField textfieldName;

    @FXML
    private TextField textfieldState;

    @FXML
    private Button buttonClose;

    @FXML
    private TextField textfieldJob;

    @FXML
    private TextField textfieldMobile;

    @FXML
    public void closeWindow(ActionEvent event) {
        final Node source = (Node) event.getSource();
        final Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        textfieldName.setText(Person.getListPerson().get(personID).getName());
        textfieldLastname.setText(Person.getListPerson().get(personID).getLastName());
        labelBirthday.setText(Person.getListPerson().get(personID).getBirthday());
        textfieldAdress.setText(Person.getListPerson().get(personID).getAdress());
        textfieldCity.setText(Person.getListPerson().get(personID).getCity());
        textfieldState.setText(Person.getListPerson().get(personID).getState());
        labelCountry.setText(Person.getListPerson().get(personID).getCountry());
        textfieldID.setText(Person.getListPerson().get(personID).getId());
        textfieldPhone.setText(Person.getListPerson().get(personID).getPhone());
        textfieldMobile.setText(Person.getListPerson().get(personID).getMobile());
        textfieldEmail.setText(Person.getListPerson().get(personID).getEmail());
        textfieldJob.setText(Person.getListPerson().get(personID).getRequestJob());
        imageView.setImage(Person.getListPerson().get(personID).getProfilePic());
    }
}
