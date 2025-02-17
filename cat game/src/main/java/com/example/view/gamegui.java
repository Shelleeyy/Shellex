package com.example.view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class gamegui extends Application{


    Image battleBackground = new Image("file:src\\main\\java\\com\\example\\media\\images\\tempBackground.jpg");

    @Override
    public void start(Stage arg0) throws Exception {
        VBox mainbox = new VBox();

        ImageView battleBackgroundd = new ImageView(battleBackground); 
        mainbox.getChildren().add(battleBackgroundd);
        Scene scene = new Scene(mainbox);

        arg0.setTitle("Cat");
        arg0.setScene(scene);
        arg0.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
