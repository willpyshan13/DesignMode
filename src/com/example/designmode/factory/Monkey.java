package com.example.designmode.factory;

public class Monkey implements IAnimalFactory {

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return "I'm monkey";
    }

    @Override
    public String getGender() {
        // TODO Auto-generated method stub
        return "I'm male";
    }

    @Override
    public String play() {
        // TODO Auto-generated method stub
        return "play with mankey";
    }

    @Override
    public String say() {
        // TODO Auto-generated method stub
        return "I love everythin!";
    }

}
