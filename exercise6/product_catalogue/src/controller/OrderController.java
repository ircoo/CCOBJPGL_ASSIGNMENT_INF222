package controller;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class OrderController implements Initializable{

    @FXML
    Label  totalLBL, name1, name2, name3, qty1, qty2, qty3, price1, price2, price3;

    @FXML
    ImageView img1, img2, img3;

    @FXML
    Pane pane1, pane2, pane3;
    

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

        if (HomeController.blamp.getProductQuantity() < 1) {
            HomeController.blamp.setProductQuantity(1);
        }
        if (HomeController.clamp.getProductQuantity() < 1) {
            HomeController.clamp.setProductQuantity(1);
        }
        if (HomeController.wlamp.getProductQuantity() < 1) {
            HomeController.wlamp.setProductQuantity(1);
        }
        
        if (HomeController.blamp.getProductStatus()) {
           name1.setText(HomeController.blamp.getProductName());
           price1.setText(Double.toString(HomeController.blamp.getProductPrice()));
           qty1.setText(Double.toString(HomeController.blamp.getProductQuantity()));
           pane1.setVisible(true);
        }else{
            pane1.setVisible(false);
        }

        if (HomeController.clamp.getProductStatus()) {
        name2.setText(HomeController.clamp.getProductName());
        price2.setText(Double.toString(HomeController.clamp.getProductPrice()));
        qty2.setText(Double.toString(HomeController.clamp.getProductQuantity()));
        pane2.setVisible(true);
        }else{
            pane2.setVisible(false);
        }
        if (HomeController.wlamp.getProductStatus()) {
          name3.setText(HomeController.wlamp.getProductName());
           price3.setText(Double.toString(HomeController.wlamp.getProductPrice()));
            qty3.setText(Double.toString(HomeController.wlamp.getProductQuantity()));
            pane3.setVisible(true);
        }else{
            pane3.setVisible(false);
        }
           
        totalLBL.setText(CheckoutController.OverallTotal);


        



    }