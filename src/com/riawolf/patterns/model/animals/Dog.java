package com.riawolf.patterns.model.animals;

import com.riawolf.patterns.model.animals.base.BaseAnimal;
import com.riawolf.patterns.model.animals.interfaces.IMamal;
import com.riawolf.patterns.model.animals.interfaces.strategies.INameStrategy;
import com.riawolf.patterns.model.animals.strategies.MamalNameStrategy;
import com.riawolf.patterns.model.animals.strategies.NameStrategy;
import org.w3c.dom.Node;

public class Dog extends BaseAnimal implements IMamal {
    private INameStrategy _nameStrategy;
    public Dog(Node node) {


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
