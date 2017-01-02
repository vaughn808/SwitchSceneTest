package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CommonCode {

    static Parent  root;

    public static void changeScenes(Stage someStage, String someFXML, double w, double h) throws IOException {
        root = FXMLLoader.load(CommonCode.class.getResource(someFXML));

        Scene scene = new Scene(root);
        someStage.setScene(scene);
        someStage.setWidth(w);
        someStage.setHeight(h);
        someStage.show();
    }
}
