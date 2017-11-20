package com.riawolf.patterns.model.animals;

import com.riawolf.patterns.model.animals.base.BaseAnimal;
import com.riawolf.patterns.model.animals.interfaces.IMamal;
import org.w3c.dom.Node;

public class Cat extends BaseAnimal implements IMamal {
    public Cat(Node node) {
        super();
    }

    @Override
    public String GetMamalCategory() {
        return null;
    }

    @Override
    public String GetMamalFamily() {
        return null;
    }

    @Override
    public String GetMamalName() {
        return null;
    }

    @Override
    public String GetMamalWeight() {
        return null;
    }

    @Override
    public String GetMamalHeight() {
        return null;
    }

    @Override
    public String GetMamalMovement() {
        return null;
    }
}
