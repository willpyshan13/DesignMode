package com.example.designmode.factory;

public class Rabit implements IAnimalFactory {

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return "I'm rabit";
    }

    @Override
    public String getGender() {
        // TODO Auto-generated method stub
        return "I'm man";
    }

    @Override
    public String play() {
        // TODO Auto-generated method stub
        return "play with rabit";
    }

    @Override
    public String say() {
        // TODO Auto-generated method stub
        return "i love robo";
    }

}
