package com.example.designmode.factory;

public class AnimalCreator implements IAnimalCreator2 {

    @Override
    public <T extends IAnimalFactory> IAnimalFactory createAnimal(Class<T> clazz) {
        if (clazz == null) {
            // throw new IllegalAccessException("argument must not be null");
        }

        try {
            IAnimalFactory animalCreator = clazz.newInstance();
            animalCreator.play();
            return animalCreator;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            throw new UnknownError(e.getMessage());
        }

    }

}
