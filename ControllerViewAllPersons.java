package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerViewAllPersons implements Initializable {

    @FXML
    private TableColumn<?, ?> columnID;

    @FXML
    private TableView<?> tableView;

    @FXML
    private TableColumn<?, ?> columnName;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("Todo bien");
        columnID.setText("Hola");
        columnID.setCellValueFactory(new PropertyValueFactory<>("id"));
    }

    public void doCancel(TableColumn.CellEditEvent cellEditEvent) {
        System.out.println("cancel");
    }

    public void doCommit(TableColumn.CellEditEvent cellEditEvent) {
        System.out.println("commit");
    }

    public void doStart(TableColumn.CellEditEvent cellEditEvent) {
        System.out.println("start");
    }
}
