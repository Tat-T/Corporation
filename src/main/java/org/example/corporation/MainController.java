package org.example.corporation;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class MainController {
    @FXML
    public StackPane contentPane;

    @FXML
    private void showAllEmployees() {
    }

    @FXML
    private void showAddEmployeeForm() {
        loadView("views/employee_form.fxml");
    }

    @FXML
    private void showSearchByLastName() {
    }

    @FXML
    private void showSearchByAge() {
    }

    @FXML
    private void showExportDialog() {
    }

    @FXML
    private void showSearchByInitial() {
    }

    private void loadView(String fxmlPath) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
            Parent view = loader.load();
            contentPane.getChildren().clear();
            contentPane.getChildren().setAll(view);

        } catch (IOException e) {
            throw new RuntimeException("Failed to load FXML: " + fxmlPath, e);
        }
    }

}
