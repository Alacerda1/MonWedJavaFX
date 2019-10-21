package bsu.com152;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        var text = new Label("Hello Comp152");
        var container = new Scene(text);
        primaryStage.setScene(container);
        primaryStage.show();

    }
}
