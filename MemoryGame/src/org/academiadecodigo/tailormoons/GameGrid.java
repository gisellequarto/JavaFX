package org.academiadecodigo.tailormoons;

import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import org.controlsfx.control.Notifications;

import java.util.ArrayList;
import java.util.List;

public class GameGrid extends GridPane {

    private List<Cards> cards;
    private List<Animal> animals;

    public GameGrid(int numberOfCards) {
        createCards(numberOfCards);
        createAnimals(numberOfCards);

        setGridLinesVisible(true);

        setVgap(10);
        setHgap(10);

        getColumnConstraints().addAll(cc(), cc(), cc(), cc());
        getRowConstraints().addAll(rc(), rc());

        displayAnimals();
        displayCards();

    }

    private ColumnConstraints cc() {
        ColumnConstraints cc = new ColumnConstraints();
        cc.setPercentWidth(20);
        cc.setFillWidth(true);
        return cc;
    }

    private RowConstraints rc() {
        RowConstraints rc = new RowConstraints();
        rc.setPercentHeight(20);
        rc.setFillHeight(true);
        return rc;
    }

    private void createCards(int num) {
        cards = new ArrayList<>();
        int i = 0;
        while (i < num) {
            cards.add(new Cards());
            i++;
        }
    }

    private void createAnimals(int num) {
        animals = new ArrayList<>();
        int i = 0;
        while (i < num) {
            animals.add(new Animal());
            i++;
        }
    }

    public void displayCards () {
        int col = 0;
        int row = 0;
        for (Cards c : cards) {
            this.add(c, col, row);
            col++;
            if (col == 4) {
                col = 0;
                row++;
            }
        }
    }

    public void displayAnimals () {
        int col = 0;
        int row = 0;
        for (Animal a : animals) {
            this.add(a, col, row);
            col++;
            if (col == 4) {
                col = 0;
                row++;
            }
        }
    }

}
