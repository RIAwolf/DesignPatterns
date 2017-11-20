package com.riawolf.patterns.view;

import com.riawolf.patterns.Facade;
import com.riawolf.patterns.controller.ShowAnimalController;

import java.util.Scanner;

public class MainView {
    private Scanner _skaneris;
    private Facade _facade;
    public MainView(Facade myFacade){
        _skaneris = new Scanner(System.in);
        _facade = myFacade;
    }

    public void rodykVisusGyvunus(){
        ShowAnimalController.ShowAllAnimals(this);
    }

    public void PaklauskGyvuno(){
        System.out.println("KuriGyvuna rodyti?");
        int atsakymas = _skaneris.nextInt();

        ShowAnimalController.ShowAnimal(atsakymas,this);
    }

    public void ShowText(String s) {
        System.out.println(s);
    }
}
