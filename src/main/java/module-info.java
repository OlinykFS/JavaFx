module org.example.javafxtest {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.example.javafxtest to javafx.fxml;
    exports org.example.javafxtest;
    exports org.example.javafxtest.appControllers;
    opens org.example.javafxtest.appControllers to javafx.fxml;

    exports org.example.javafxtest.navControllers to javafx.fxml;
    opens org.example.javafxtest.Views to javafx.fxml;


}