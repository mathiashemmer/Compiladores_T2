module Compilador{
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.controls;

    opens hmm.mathias.editor to javafx.fxml;

    exports hmm.mathias;
}