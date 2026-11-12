package edu.utsa.cs3443.fall2026demoproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class UserGuideController {
    private Window[] windows;

    // TODO: Define info for windows utilizing String.format()
    @FXML
    private void initialize(){
        windows = new Window[5];
        windows[0] = new Window("Getting Started", "Info...");
        windows[1] = new Window("Editing Preferences", "Info...");
        windows[2] = new Window("Understanding Budget", "Info...");
        windows[3] = new Window("Locating Nutrition Info", "Info...");
        windows[4] = new Window("Features", "Info...");
    }

    @FXML
    private Button gettingStartedButton;

    @FXML
    private Button editingPreferencesButton;

    @FXML
    private Button understandingBudgetButton;

    @FXML
    private Button locatingNutritionInfoButton;

    @FXML
    private Button featuresButton;

    @FXML
    private Button closeWindowButton;

    @FXML
    public void onGettingStartedButtonClicked(ActionEvent event){
        displayWindow(windows[0]);
    }

    @FXML
    public void onEditingPreferencesButtonClicked(ActionEvent event){
        displayWindow(windows[1]);
    }

    @FXML
    public void onUnderstandingBudgetButtonClicked(ActionEvent event){
        displayWindow(windows[2]);
    }

    @FXML
    public void onLocatingNutritionInfoButtonClicked(ActionEvent event){
        displayWindow(windows[3]);
    }

    @FXML
    public void onFeaturesButtonClicked(ActionEvent event){
        displayWindow(windows[4]);
    }

    @FXML
    public void onCloseWindowButtonClicked(ActionEvent event){
        closeWindow();
    }

    // TODO: Implement "opening" the window
    @FXML
    public void displayWindow(Window window){}

    // TODO: Implement "closing" the window
    @FXML
    public void closeWindow(){}
}
