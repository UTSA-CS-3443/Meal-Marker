module edu.utsa.cs3443.mealmarker {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.utsa.cs3443.mealmarker to javafx.fxml;
    exports edu.utsa.cs3443.mealmarker;
}