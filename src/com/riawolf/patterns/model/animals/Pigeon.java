package com.riawolf.patterns.model.animals;

import com.riawolf.patterns.model.animals.base.BaseAnimal;
import com.riawolf.patterns.model.animals.interfaces.IBird;
import org.w3c.dom.Node;

public class Pigeon extends BaseAnimal implements IBird {
    public Pigeon(Node node) {

    }

    @Override
    public String GetBirdCategory() {
        return null;
    }

    @Override
    public String GetBirdFamily() {
        return null;
    }

    @Override
    public String GetBirdName() {
        return null;
    }

    @Override
    public String GetBirdWeight() {
        return null;
    }

    @Override
    public String GetBirdHeight() {
        return null;
    }

    @Override
    public String GetBirdMovement() {
        return null;
    }
}
