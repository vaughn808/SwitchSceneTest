package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Scene2_Controller {
    Stage stage;

    @FXML
    private Button btn2;

    public void btnClick() throws IOException {
        stage = (Stage) btn2.getScene().getWindow();
        CommonCode.changeScenes(stage,"scene1.fxml",stage.getWidth(),stage.getHeight());
    }
}
