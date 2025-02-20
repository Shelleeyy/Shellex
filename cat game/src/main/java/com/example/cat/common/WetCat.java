package com.example.cat.common;

import com.example.cat.Cat;
import com.example.cat.enums.CatRarities;
import com.example.cat.enums.CatTypes;

public class WetCat extends Cat {

    public WetCat() {
        super.name = "WetCat";
        super.description = "This cat is incredibly wet. No one knows why.";
        super.hp = (int) (Math.random() * 10) + 1;
        super.attackPower = (int) (Math.random() * 10) + 1;
        super.profilePath = "path/to/image";
        super.fullartPath = "path/to/image";
        super.element = CatTypes.WATER;
        super.rarity = CatRarities.COMMON;


    }

}
