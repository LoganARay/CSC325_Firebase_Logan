package com.example.csc325_firebase_webview_auth.view;

import javafx.fxml.FXML;

import java.io.IOException;

public class StartScreen {

    @FXML
    private void loginButton(javafx.event.ActionEvent actionEvent) throws IOException {
        App.setRoot("/files/SignIn.fxml");
    }

    @FXML
    public void registerButton(javafx.event.ActionEvent actionEvent) throws IOException{
        App.setRoot("/files/Register.fxml");
    }
}
