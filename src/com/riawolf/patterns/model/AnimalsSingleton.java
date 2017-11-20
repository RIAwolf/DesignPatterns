package com.riawolf.patterns.model;

import com.riawolf.patterns.model.animals.base.BaseAnimal;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.List;

public class AnimalsSingleton {
    private static AnimalsSingleton _instance;
    private ArrayList<BaseAnimal> animals;

    public static AnimalsSingleton getInstance() {
        if (_instance == null) {
            _instance = new AnimalsSingleton();

        }
        return _instance;
    }

    private AnimalsSingleton() {
        animals = new ArrayList<BaseAnimal>();

    }

    public void AddItem(BaseAnimal animal) {
        animals.add(animal);
    }

    public BaseAnimal GetItem(int index) {
        return animals.get(index);
    }
    public int GetCount(){
        return animals.size();

    }
    public void DeleteItem(int index) {
        animals.remove(index);
    }

}
