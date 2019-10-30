package bsu.com152;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        VBox box = new VBox();
        var text = new Label(" Hello Comp152");
        var color = Paint.valueOf("darkgreen");
        text.setTextFill(color);
        var font = Font.font(22);
        text.setFont(font);
        box.getChildren().add(text);
        Button pushButton  = new Button("Push Me");
        pushButton.setFont(font);
        var color2 = Paint.valueOf("Red");
        pushButton.setTextFill(color2);
        box.getChildren().add(pushButton);
        var container = new Scene(box);
        primaryStage.setScene(container);
        primaryStage.setTitle("  Example Window");
        primaryStage.setMinWidth(300);
        primaryStage.show();

    }
}
