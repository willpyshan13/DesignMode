package com.example.designmode.factory;

public class MonkeyCreator implements IAnimalCreator {

    @Override
    public IAnimalFactory createAnimal() {
        // TODO Auto-generated method stub
        Monkey monkey = new Monkey();
        monkey.play();
        return monkey;
    }

}
