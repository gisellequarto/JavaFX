package org.academiadecodigo.tailormoons;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class Animal extends HBox {

    private BackgroundFill fill;
    private static int i = 0;
    private String[] animalPath = {"lion.png", "cat.png", "monkey.png", "penguin.png"};
    private Image image;


    public Animal() {
        this(100, 100);
    }

    public Animal(int height, int width) {
        setAlignment(Pos.CENTER);

        setMinWidth(width);
        setMinHeight(height);

        image = new Image(animalPath[i]);

        ImageView imv = new ImageView();
        imv.setImage(image);
        imv.setFitWidth(100);
        imv.setFitHeight(100);
        imv.setPreserveRatio(true);
        imv.setSmooth(true);
        imv.setCache(true);

        fill = new BackgroundFill(Color.valueOf("aaa"), CornerRadii.EMPTY, Insets.EMPTY);
        setBackground(new Background(fill));
        getChildren().add(imv);

        i++;
        if(i == 4) {
            i = 0;
        }

    }

    public String getImagePath() {
        return image.getUrl();
    }

}
