module org.topheraronson.kugamiplayer {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.topheraronson.kugamiplayer to javafx.fxml;
    exports org.topheraronson.kugamiplayer;
}