module Serenity.Mental.Health.Therapy.Center {
    // JavaFX modules
    requires javafx.base;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    // Other Java SE modules
    requires java.sql;
    requires java.naming;
    requires java.desktop;

    // Third-party libraries
    requires com.jfoenix;
    requires lombok;
    requires org.hibernate.orm.core;
    requires jakarta.persistence;

    // Opening packages for reflection (used by JavaFX & Hibernate)
    opens lk.ijse.gdse.main to javafx.graphics;
    opens lk.ijse.gdse.main.controller to javafx.fxml;
    opens lk.ijse.gdse.main.entity to org.hibernate.orm.core; // for Hibernate to access your entity classes

    // Exporting packages (optional depending on usage)
    exports lk.ijse.gdse.main.controller;
}
