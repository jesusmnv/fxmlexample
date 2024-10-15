module com.uveg {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.uveg to javafx.fxml;
    exports com.uveg;
}
