module com.mycompany.javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.base;  
    
    opens com.mycompany.javafx to javafx.fxml;
    exports com.mycompany.javafx;
   // exports com.mycompany.javafx.models;
    
}   
    
