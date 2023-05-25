package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

import model.*;

public class DrinksController {

    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    Matcha matcha = new Matcha();
    OrangeJuice orange = new OrangeJuice();
    Saliva saliva = new Saliva();
    StrawberryMilk strawberry = new StrawberryMilk();
    Wine wine = new Wine();

    public void initialize() {

        matcha.setColor("Green");
        matcha.setTaste("Bitter");

        orange.setColor("Orange");
        orange.setTaste("Sour");

        saliva.setColor("Clear");
        saliva.setTaste("Sweet");

        strawberry.setColor("Pink");
        strawberry.setTaste("Sweet");

        wine.setColor("Red");
        wine.setTaste("Bitter");
        
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Matcha is " + matcha.getColor() + " and " + matcha.getTaste());
        }

        if (sourceButton == btn2) {
            alert.setContentText("Oranges are " + orange.getColor() + " and " + orange.getTaste());
        }

        if (sourceButton.equals(btn3)) {
            alert.setContentText("Saliva is " + saliva.getColor() + " and " + saliva.getTaste());
        }

        if (sourceButton.equals(btn4)) {
            alert.setContentText("Strawberry milk is " + strawberry.getColor() + " and " + strawberry.getTaste());
        }

        if (sourceButton.equals(btn5)) {
            alert.setContentText("Strawberry Wine is  " + wine.getColor() + " and " + wine.getTaste());
        }

        alert.showAndWait();

    }
}