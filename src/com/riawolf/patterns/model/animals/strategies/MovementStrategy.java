package com.riawolf.patterns.model.animals.strategies;

import com.riawolf.patterns.model.animals.interfaces.strategies.ILocomotion;

public class MovementStrategy implements ILocomotion {
    private String _movement;

    public MovementStrategy(String value){
        _movement = value;

    }

    @Override
    public String locomote() {
        return _movement;
    }
}
