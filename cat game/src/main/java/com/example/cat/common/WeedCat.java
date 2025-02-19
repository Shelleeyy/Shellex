package com.example.cat.common;

import com.example.cat.Cat;
import com.example.cat.enums.CatRarities;
import com.example.cat.enums.CatTypes;

public class WeedCat extends Cat {

    public WeedCat() {
        super.name = "WeedCat";
        super.description = "Weedcat is it's name. It is always high.";
        super.hp = (int) (Math.random() * 10) + 1;
        super.attackPower = (int) (Math.random() * 10) + 1;
        super.profilePath = "path/to/image";
        super.fullartPath = "path/to/image";
        super.element = CatTypes.GRASS;
        super.rarity = CatRarities.COMMON;
    }

}
