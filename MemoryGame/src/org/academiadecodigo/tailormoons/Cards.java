package org.academiadecodigo.tailormoons;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class Cards extends HBox {

    private BackgroundFill fill;
    private boolean turned = false;

    public Cards() {
        this(100, 100);
    }

    public Cards(int height, int width) {
        setAlignment(Pos.CENTER);

        setMinWidth(width);
        setMinHeight(height);

        fill = new BackgroundFill(Color.web("d9a5b3"), CornerRadii.EMPTY, Insets.EMPTY);
        setBackground(new Background(fill));

        setOnMouseClicked(e -> {
            if(fill.getFill().toString().equals("0xd9a5b3ff")) {
                fill = new BackgroundFill(Color.TRANSPARENT, CornerRadii.EMPTY, Insets.EMPTY);
                setBackground(new Background(fill));
                setTurned(true);

            } else {
                fill = new BackgroundFill(Color.web("d9a5b3"), CornerRadii.EMPTY, Insets.EMPTY);
                setBackground(new Background(fill));
                setTurned(false);
            }
        });
    }

    public boolean isTurned() {
        return turned;
    }

    public void setTurned(boolean turned) {
        this.turned = turned;
    }
}
