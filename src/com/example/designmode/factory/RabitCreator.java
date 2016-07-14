package com.example.designmode.factory;

public class RabitCreator implements IAnimalCreator {

    @Override
    public IAnimalFactory createAnimal() {
        Rabit rabit = new Rabit();
        rabit.play();
        return rabit;
    }

}
