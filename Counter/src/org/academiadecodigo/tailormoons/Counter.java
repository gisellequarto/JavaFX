package org.academiadecodigo.tailormoons;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Counter extends Application {

    private int counter = 0;

    private void actualNumber(Label label) {
        label.setText(Integer.toString(counter));

        label.getStyleClass().remove("green");
        label.getStyleClass().remove("red");

        if(counter > 0) {
            label.getStyleClass().add("green");
        } else if (counter < 0) {
            label.getStyleClass().add("red");
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Label title = new Label("Counter");
        title.getStyleClass().add("title");

        Label number = new Label("0");
        number.getStyleClass().add("number");

        Button decrementButton = new Button("-");
        decrementButton.getStyleClass().add("button");
        decrementButton.setOnAction(x -> {
            counter--;
            actualNumber(number);
        });

        Button incrementButton = new Button("+");
        incrementButton.setOnAction(x -> {
            counter++;
            actualNumber(number);
        });

        HBox buttonBox = new HBox();
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.setSpacing(15);
        buttonBox.getChildren().add(decrementButton);
        buttonBox.getChildren().add(incrementButton);

        VBox contentBox = new VBox();
        contentBox.getStyleClass().add("content");
        contentBox.setAlignment(Pos.CENTER);
        contentBox.setSpacing(15);
        contentBox.getChildren().add(title);
        contentBox.getChildren().add(number);
        contentBox.getChildren().add(buttonBox);

        String cssPath = getClass().getResource("Counter.css").toExternalForm();
        Scene onlyScene = new Scene (contentBox, 300, 300);
        onlyScene.getStylesheets().add(cssPath);
        onlyScene.getStylesheets().add("https://fonts.googleapis.com/css2?family=Open+Sans&family=Oswald");

        primaryStage.setScene(onlyScene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
