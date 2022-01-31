package com.example.javafxjdbc.gui;

import com.example.javafxjdbc.Main;
import com.example.javafxjdbc.gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainViewController implements Initializable {

    @FXML
    private MenuItem menuItemSeller;

    @FXML
    private MenuItem menuItemDepartment;

    @FXML
    private MenuItem menuItemAbout;

    @FXML
    public void onMenuItemSellerAction(){
        System.out.println("Action");
    }
    @FXML
    public void onMenuItemDepartmentAction(){
        loadView("DepartmentList.fxml");
    }
    @FXML
    public void onMenuItemAboutAction(){
        loadView("About.fxml");
    }


    @Override
    public void initialize(URL uri, ResourceBundle rb) {
    }

    private synchronized void loadView(String absolutName){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(absolutName));
            VBox newVBox = loader.load();

            Scene mainScene = Main.getMainScene();
            VBox mainVBox = (VBox) ((ScrollPane) mainScene.getRoot()).getContent();

            Node mainMenu = mainVBox.getChildren().get(0);
            mainVBox.getChildren().clear();
            mainVBox.getChildren().add(mainMenu);
            mainVBox.getChildren().addAll(newVBox.getChildren());
        } catch (IOException e){
            Alerts.showAlert("IO Exception", "Error loading view", e.getMessage(), Alert.AlertType.ERROR);
        }
    }
}