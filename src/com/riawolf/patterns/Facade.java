package com.riawolf.patterns;

import com.riawolf.patterns.controller.AnimalFactoryController;
import com.riawolf.patterns.controller.ShowAnimalController;
import com.riawolf.patterns.model.AnimalsSingleton;
import com.riawolf.patterns.view.MainView;

public class Facade {
    private MainView _mainView;
    public Facade(){
        AnimalsSingleton.getInstance();
        new AnimalFactoryController().readFile();
        _mainView = new MainView(this);
        _mainView.rodykVisusGyvunus();
    }

}
