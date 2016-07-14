package com.example.designmode.factory;

//single ConcreateFactory
public interface IAnimalCreator2 {
    <T extends IAnimalFactory> IAnimalFactory createAnimal(Class<T> clazz);
}
