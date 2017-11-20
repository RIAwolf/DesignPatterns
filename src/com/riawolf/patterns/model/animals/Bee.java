package com.riawolf.patterns.model.animals;

import com.riawolf.patterns.model.animals.base.BaseAnimal;
import com.riawolf.patterns.model.animals.interfaces.IBug;
import org.w3c.dom.Node;

public class Bee extends BaseAnimal implements IBug {
    public Bee(Node node) {

    }

    @Override
    public String GetBugCategory() {
        return null;
    }

    @Override
    public String GetBugFamily() {
        return null;
    }

    @Override
    public String GetBugName() {
        return null;
    }

    @Override
    public String GetBugWeight() {
        return null;
    }

    @Override
    public String GetBugHeight() {
        return null;
    }

    @Override
    public String GetBugMovement() {
        return null;
    }
}
