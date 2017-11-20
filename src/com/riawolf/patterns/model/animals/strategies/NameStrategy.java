package com.riawolf.patterns.model.animals.strategies;

import com.riawolf.patterns.model.animals.interfaces.strategies.INameStrategy;

public class NameStrategy implements INameStrategy {
    private String _name;
    public NameStrategy(String name) {
        _name=name;
    }

    @Override
    public String DoName() {
        return _name;
    }
}
