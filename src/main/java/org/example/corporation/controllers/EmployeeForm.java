package org.example.corporation.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import org.example.corporation.dao.EmployeeDAO;
import org.example.corporation.entities.Department;
import org.example.corporation.entities.Employee;
import org.example.corporation.entities.Position;

public class EmployeeForm {
    @FXML
    public TextField username;
    @FXML
    public TextField age;
    @FXML
    public ComboBox<Position> position;
    @FXML
    public ComboBox<Department> department;

    public EmployeeForm() {
    }

    @FXML
    public void initialize() {
    }

//    @FXML
//    public void handleSave() {
//        Employee employee = new Employee(username.getText(), Integer.parseInt(age.getText())
//        );
//        EmployeeDAO employeeDAO = new EmployeeDAO();
//        employeeDAO.addEmployee(employee);
//        handleClose();
//    }
@FXML
public void handleSave() {
    try {
        String name = username.getText();
        int ageValue = 24;

        Employee employee = new Employee(name, ageValue);
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.addEmployee(employee);
        handleClose();
    } catch (NumberFormatException e) {
        System.err.println("Неверный формат возраста: " + age.getText());
    }
}


    @FXML
    public void handleClose() {
    }
}
