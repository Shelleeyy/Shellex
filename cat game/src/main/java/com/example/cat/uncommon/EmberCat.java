package com.example.cat.uncommon;

import com.example.cat.Cat;
import com.example.cat.enums.CatRarities;
import com.example.cat.enums.CatTypes;

public class EmberCat extends Cat {

    public EmberCat() {
        super.name = "EmberCat";
        super.description = "A coal cat who has been lit on fire.";
        super.hp = (int) (Math.random() * 10) + 1;
        super.attackPower = (int) (Math.random() * 10) + 1;
        super.profilePath = "path/to/image";
        super.fullartPath = "path/to/image";
        super.element = CatTypes.FIRE;
        super.rarity = CatRarities.UNCOMMON;

    }

}
