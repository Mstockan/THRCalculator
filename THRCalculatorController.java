package Ch12.Ex12_10;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class THRCalculatorController {

    @FXML
    private TextField ageTextField;

    @FXML
    private TextField maximumTextField;

    @FXML
    private TextField targetTextField;

    @FXML
    void calculate(ActionEvent event) {
        double age = Double.parseDouble(ageTextField.getText());
        double maxHeartrate = 220 - age;
        maximumTextField.setText(Double.toString(maxHeartrate));
        double lower = maxHeartrate * 0.5;
        double higher = maxHeartrate * 0.85;
        targetTextField.setText(Double.toString(lower) + " - " + Double.toString(higher));
    }

}
