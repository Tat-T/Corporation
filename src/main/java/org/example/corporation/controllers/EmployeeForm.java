package org.example.corporation.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import org.example.corporation.entities.Department;
import org.example.corporation.entities.Position;

public class EmployeeForm {
    @FXML
    public TextField username;
    @FXML
    public TextField age;
    @FXML
    public ComboBox <Position> position;
    @FXML
    public ComboBox <Department> department;

    public EmployeeForm() {}

    @FXML
    public void initialize() {}

    @FXML
    public void handleSave(ActionEvent actionEvent) {
    }
    @FXML
    public void handleClose(ActionEvent actionEvent) {
    }
}
