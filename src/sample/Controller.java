package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {

    private int counter;
    @FXML
    public Label buttonGame;

    public void add(ActionEvent actionEvent)
    {
        counter++;
        buttonGame.setText(String.valueOf(counter));
    }

}
