package controller;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class OrderController implements Initializable {

    @FXML

    Label name1, name2, name3, price1, price2, price3;

    



   

    public void initialize(URL location, ResourceBundle resources) {




         if (HomeController.blamp.getProductStatus()){

            name1.setText(HomeController.blamp.getProductName());

            price1.setText(Double.toString(HomeController.blamp.getProductPrice()));

            name1.setVisible(true);

            price1.setVisible(true);

         }

            if (HomeController.clamp.getProductStatus()){

             name2.setText(HomeController.clamp.getProductName());

             price2.setText(Double.toString(HomeController.clamp.getProductPrice()));

             name2.setVisible(true);

             price2.setVisible(true);

        }

                if (HomeController.wlamp.getProductStatus()){

                name3.setText(HomeController.wlamp.getProductName());

                price3.setText(Double.toString(HomeController.clamp.getProductPrice()));

                name3.setVisible(true);

                price3.setVisible(true);

        }

    }

}