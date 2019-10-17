package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Math Game");
        primaryStage.setScene(new Scene(root, 500, 300));
        primaryStage.show();
    }

    //Todo: tillate at det er mulig å bruke negative tall.
    //Todo: knapper for å justere vansklighetsgraden på spørsmålene

    public static void main(String[] args) {
        launch(args);
    }
}
