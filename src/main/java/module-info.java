module com.mycompany.javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.base;  
   
    opens com.mycompany.javafx to javafx.fxml;
   
    exports com.mycompany.javafx;
<<<<<<< HEAD
   // exports com.mycompany.javafx.models;
    requires jbcrypt;
    
=======
>>>>>>> b2505880afa3c00ece8fb61df3a708df8b87afdf
}   
    
