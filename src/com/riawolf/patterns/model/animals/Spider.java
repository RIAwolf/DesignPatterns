package com.riawolf.patterns.model.animals;

import com.riawolf.patterns.model.animals.base.BaseAnimal;
import com.riawolf.patterns.model.animals.interfaces.IArachnid;
import com.riawolf.patterns.model.animals.interfaces.strategies.ICategoryStrategy;
import com.riawolf.patterns.model.animals.interfaces.strategies.ILocomotion;
import com.riawolf.patterns.model.animals.interfaces.strategies.INameStrategy;
import com.riawolf.patterns.model.animals.strategies.CategoryStrategy;
import com.riawolf.patterns.model.animals.strategies.MovementStrategy;
import com.riawolf.patterns.model.animals.strategies.NameStrategy;
import com.sun.org.apache.xerces.internal.impl.xpath.XPath;
import org.w3c.dom.Node;

import java.security.acl.LastOwnerException;

public class Spider extends BaseAnimal implements IArachnid {
    private ILocomotion _movementStrategy;
    private ICategoryStrategy _categoryStrategy;
    private INameStrategy _nameStrategy;
    public Spider(String category,String Family,String Name,String Weight, String Height, String Locomotion) {
        _categoryStrategy= new CategoryStrategy(category);
        _movementStrategy= new MovementStrategy(Locomotion);
        _nameStrategy = new NameStrategy(Name);
    }

    @Override
    public String GetArachnidCategory() {
        return null;
    }

    @Override
    public String GetArachnidFamily() {
        return null;
    }

    @Override
    public String GetArachnidName() {
        return null;
    }

    @Override
    public String GetArachnidWeight() {
        return null;
    }

    @Override
    public String GetArachnidHeight() {
        return null;
    }

    @Override
    public String GetArachnidMovement() {
        return null;
    }
}
