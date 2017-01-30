package com.mycompany.pruebagit;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class FXMLController implements Initializable {
    
    @FXML
    private Canvas canvas;
    
    private GraphicsContext lienzo;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
//        System.out.println("You clicked me!");
//        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      lienzo = canvas.getGraphicsContext2D();

        double w = canvas.getWidth();
        double h = canvas.getHeight();
        lienzo.clearRect(0, 0, w, h);
        lienzo.setStroke(new Color(.15, .15, .15, .95));
        lienzo.setLineWidth(2);
        lienzo.strokeRect(0, 0, w, h);
    }    
}
