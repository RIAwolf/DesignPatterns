package com.riawolf.patterns.model.animals.strategies;

import com.riawolf.patterns.model.animals.interfaces.strategies.INameStrategy;

public class MamalNameStrategy implements INameStrategy {
    private String _name;

    public MamalNameStrategy(String name){
        _name=name;


    }

    @Override
    public String DoName() {
        return "Me special: "+_name;
    }
}
