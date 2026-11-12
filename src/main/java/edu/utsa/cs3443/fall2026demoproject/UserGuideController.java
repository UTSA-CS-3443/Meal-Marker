package edu.utsa.cs3443.fall2026demoproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class UserGuideController {
    private Window[] windows;

    // TODO: Write info for each respective window
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
    private VBox windowVBox;

    @FXML
    private TextField titleTextField;

    @FXML
    private TextArea infoTextArea;

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

    // TODO: Ensure window is scaled to fit text
    @FXML
    public void displayWindow(Window window){
        titleTextField.setText(window.getTitle());
        infoTextArea.setText(window.getInfo());
        windowVBox.setVisible(true);
    }

    @FXML
    public void closeWindow() {
        windowVBox.setVisible(false);
        titleTextField.setText("");
        infoTextArea.setText("");
    }
}
