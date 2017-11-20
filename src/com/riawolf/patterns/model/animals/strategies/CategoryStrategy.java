package com.riawolf.patterns.model.animals.strategies;

import com.riawolf.patterns.model.animals.interfaces.strategies.ICategoryStrategy;

public class CategoryStrategy implements ICategoryStrategy {
    private String _category;

    public CategoryStrategy(String category) {
        _category = category;
    }

    @Override
    public String DoCategory() {
        return _category;
    }
}
