package com.udemy.patterns.behavioural.mediator;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Client extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        UiMediator mediator = new UiMediator();
        TextField textField = new CustomTextField(mediator);
        Slider slider = new CustomSlider(mediator);
        Label label = new CustomLabel(mediator);

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(20);
        grid.setPadding(new Insets(25, 25, 25, 25));
        grid.add(label, 0, 0);
        grid.add(slider, 0 ,1);
        grid.add(textField, 0, 2);

        Scene scene = new Scene(grid, 500, 500);
        primaryStage.setTitle("Mediator pattern");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
