package com.example.scenceStuff;

import com.example.view.GameGui;

public class scenceChanger {

    private GameGui game;

    public void showPickStarters(){
        game= new GameGui();
        game.battleBackground.setVisible(false);
    }

}
