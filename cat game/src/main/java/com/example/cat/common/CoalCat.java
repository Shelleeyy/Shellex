package com.example.cat.common;

import com.example.cat.Cat;
import com.example.cat.enums.CatRarities;
import com.example.cat.enums.CatTypes;

public class CoalCat extends Cat {

    public CoalCat() {
        super.name = "CoalCat";
        super.description = "An incredibly warm cat who stumbled upon some coals.";
        super.hp = (int) (Math.random() * 10) + 1;
        super.attackPower = (int) (Math.random() * 10) + 1;
        super.profilePath = "path/to/image";
        super.fullartPath = "path/to/image";
        super.element = CatTypes.FIRE;
        super.rarity = CatRarities.BASIC;

    }

}
