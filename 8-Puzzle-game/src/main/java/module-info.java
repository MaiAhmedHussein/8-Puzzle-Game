module com.example._8puzzlegame {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example._8puzzlegame to javafx.fxml;
    exports com.example._8puzzlegame;
}