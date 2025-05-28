module com.decroly.Examen_Daw1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires jdk.xml.dom;


    opens com.decroly.Examen_Daw1 to javafx.fxml;
    exports com.decroly.Examen_Daw1;
}