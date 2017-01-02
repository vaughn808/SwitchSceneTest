package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Scene1_Controller {
    Stage   stage;

    @FXML
    private Button btn1;

    public void btnClick() throws IOException {
        stage = (Stage) btn1.getScene().getWindow();
        CommonCode.changeScenes(stage,"scene2.fxml",stage.getWidth(),stage.getHeight());
    }
}
