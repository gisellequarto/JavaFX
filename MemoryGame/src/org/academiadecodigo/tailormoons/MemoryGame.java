package org.academiadecodigo.tailormoons;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MemoryGame extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent grid = null;
        grid = new GameGrid(8);

        Scene scene = new Scene(grid, 600, 600, Color.valueOf("1868ae"));

        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
