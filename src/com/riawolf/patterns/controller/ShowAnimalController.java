package com.riawolf.patterns.controller;

import com.riawolf.patterns.model.AnimalsSingleton;
import com.riawolf.patterns.model.animals.base.BaseAnimal;
import com.riawolf.patterns.model.animals.interfaces.IMamal;
import com.riawolf.patterns.view.MainView;

public class ShowAnimalController {

    public static void ShowAnimal(int i, MainView view){
        BaseAnimal animal = AnimalsSingleton.getInstance().GetItem(i);
        if(animal instanceof IMamal){
            IMamal mamal=(IMamal)animal;
            view.ShowText(mamal.GetMamalName());
            view.ShowText(mamal.GetMamalCategory());
            view.ShowText(mamal.GetMamalFamily());
            view.ShowText(mamal.GetMamalWeight());
            view.ShowText(mamal.GetMamalHeight());
            view.ShowText(mamal.GetMamalMovement());
        }

    }

    public static void ShowAllAnimals(MainView view){
        int animalCount = AnimalsSingleton.getInstance().GetCount();
        for (int i=0;i<animalCount;i++){
            ShowAnimal(i,view);
        }

    }
}
