package edu.utsa.cs3443.fall2026demoproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class UserGuideController {
    private Window[] windows;
    private int selected;

    @FXML
    private void initialize(){
        windows = new Window[5];
        windows[0] = new Window("Getting Started", "Info...");
        windows[1] = new Window("Editing Preferences", "Info...");
        windows[2] = new Window("Understanding Budget", "Info...");
        windows[3] = new Window("Locating Nutrition Info", "Info...");
        windows[4] = new Window("Features", "Info...");
    }

    // TODO: Implement JavaFX functions
    @FXML
    public void onGettingStartedButtonClicked(ActionEvent event){}

    @FXML
    public void onEditingPreferencesButtonClicked(ActionEvent event){}

    @FXML
    public void onUnderstandingBudgetButtonClicked(ActionEvent event){}

    @FXML
    public void onLocatingNutritionInfoButtonClicked(ActionEvent event){}

    @FXML
    public void onFeaturesButtonClicked(ActionEvent event){}

    @FXML
    public void onCloseWindowButtonClicked(ActionEvent event){}

    @FXML
    public void displayWindow(String title){}

    @FXML
    public void closeWindow(){}
}
