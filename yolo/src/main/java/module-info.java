module com.ehloimsoftware.yolo {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.ehloimsoftware.yolo to javafx.fxml;
    exports com.ehloimsoftware.yolo;
}
