module eus.ehu.presentation {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens eus.ehu.presentation to javafx.fxml;
    exports eus.ehu.presentation;
}