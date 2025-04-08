module org.example.corporation {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires java.persistence;
    requires org.hibernate.orm.core;
    requires java.naming;

    opens org.example.corporation to javafx.fxml;
    exports org.example.corporation;
}