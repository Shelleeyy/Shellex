package com.example.view;

import com.example.cat.Cat;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import com.example.cat.Cat;

public class gamegui extends Application{
    Image battleBackground = new Image("file:src\\main\\java\\com\\example\\media\\images\\tempBackground.jpg");
    Image pickPokemon = new Image("file:src\\main\\java\\com\\example\\media\\images\\StarterPokemon.avif");
    Label statuslabel = new Label();
    Button attackButton = new Button("Attack");

    
    // private Cat game;


    @Override
    public void start(Stage arg0) throws Exception {
        VBox mainbox = new VBox();
        HBox actionbar = new HBox();
        // HBox buttons = new HBox();

        statuslabel.setText("What will" + " default " + "do?");
        statuslabel.setFont(new Font("Comic Sans", 60));
        
        StackPane statusbar = new StackPane(statuslabel);

        statusbar.setPrefSize(600, 150);
        attackButton.setPrefSize(50, 50);


        ImageView battleBackgroundd = new ImageView(battleBackground); 
        actionbar.getChildren().addAll(statusbar,attackButton);
        mainbox.getChildren().addAll(battleBackgroundd, actionbar);
        Scene scene = new Scene(mainbox);

        arg0.setTitle("Cat");
        arg0.setScene(scene);
        


    }

    public static void main(String[] args) {
        launch(args);
    }
}
