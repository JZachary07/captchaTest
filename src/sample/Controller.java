package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {

    @FXML Text targetText;
    @FXML ImageView targetImg;
    String generatedText;

    @Override
    public void initialize (URL url, ResourceBundle rb) {
        targetText.setText("Initialized Text");
        generatedText = "Initialized Text";
    }

    public void setText (ActionEvent actionEvent) {
        targetText.setText("testString");
        targetImg.setImage(targetText.snapshot(null, null));
    }
}
