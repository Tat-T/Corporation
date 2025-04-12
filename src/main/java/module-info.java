module org.example.corporation {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.controlsfx.controls;

    requires jakarta.persistence;
    requires org.hibernate.orm.core;
    requires java.naming;
    requires java.sql;
    requires com.microsoft.sqlserver.jdbc;

    opens org.example.corporation to javafx.fxml;
    opens org.example.corporation.controllers to javafx.fxml;
    opens org.example.corporation.entities to org.hibernate.orm.core;
    exports org.example.corporation;
}