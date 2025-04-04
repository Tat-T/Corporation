module org.example.corporation {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens org.example.corporation to javafx.fxml;
    exports org.example.corporation;
}