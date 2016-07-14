package com.example.designmode.factory;

//简单工厂方法模式，把中间的接口去掉，直接用static代替，这种有个缺点，失去了被子类继承的特性，所有的压力都集中在工厂中，不便于维护
public class AnimalSimpleCreator {
    public static <T extends IAnimalFactory> IAnimalFactory creatorAnimal(Class<T> clazz) {
        if (clazz == null) {
            return null;
        }

        try {
            IAnimalFactory fAnimalFactory = clazz.newInstance();
            fAnimalFactory.play();
            return fAnimalFactory;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            throw new UnknownError(e.getMessage());
        }
    }
}
