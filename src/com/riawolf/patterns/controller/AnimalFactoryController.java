package com.riawolf.patterns.controller;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import com.riawolf.patterns.model.AnimalsSingleton;
import com.riawolf.patterns.model.animals.Constants;
import com.riawolf.patterns.model.animals.*;
import com.riawolf.patterns.model.animals.base.BaseAnimal;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.File;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

public class AnimalFactoryController {
    private String QUERY_ALL_ANIMALS = "//animals/animal";
    private String QUERY_CATEGORY = "" + Constants.ANIMAL_CATEGORY;
    private String QUERY_FAMILY = "" + Constants.ANIMAL_FAMILY;
    private String QUERY_NAME = "" + Constants.ANIMAL_NAME;
    private String QUERY_WEIGHT = "" + Constants.ANIMAL_WEIGHT;
    private String QUERY_HEIGHT = "" + Constants.ANIMAL_HEIGHT;
    private String QUERY_MOVEMENT = "" + Constants.ANIMAL_MOVEMENT;

    public void readFile() {
        try {
            File fXmlFile = new File("Animals.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            dbFactory.setIgnoringElementContentWhitespace(true);
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);
            //optional, but recommended
            //read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
            doc.getDocumentElement().normalize();

            XPath xpath = XPathFactory.newInstance().newXPath();
            // get all animals
            NodeList nodeList = (NodeList) xpath.compile(QUERY_ALL_ANIMALS).evaluate(doc, XPathConstants.NODESET);
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);

                String category = (String) xpath.compile(QUERY_CATEGORY).evaluate(node, XPathConstants.STRING);
                System.out.println(category);
                switch (category.toLowerCase()) {
                    case "dog":
                        AnimalsSingleton.getInstance().AddItem(AssembleDog(node));
                        break;
                    case "cat":
                        AnimalsSingleton.getInstance().AddItem(AssembleCat(node));
                        break;
                    case "pigeon":
                        AnimalsSingleton.getInstance().AddItem(AssemblePigeon(node));
                        break;
                    case "spider":
                        AnimalsSingleton.getInstance().AddItem(AssembleSpider(node));
                        break;
                    case "bee":
                        AnimalsSingleton.getInstance().AddItem(AssembleBee(node));
                        break;

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private BaseAnimal AssembleDog(Node node) {
        BaseAnimal result = new Dog(node);

        return result;
    }

    private BaseAnimal AssembleCat(Node node) {
        BaseAnimal result = new Cat(node);

        return result;
    }

    private BaseAnimal AssemblePigeon(Node node) {
        BaseAnimal result = new Pigeon(node);

        return result;
    }

    private BaseAnimal AssembleSpider(Node node) {
        BaseAnimal result = new Spider(node);

        return result;
    }

    private BaseAnimal AssembleBee(Node node) {
        BaseAnimal result = new Bee(node);

        return result;
    }


}
