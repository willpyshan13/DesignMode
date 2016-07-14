package com.example.designmode.factory;

//工厂方法模式（Factory Method Pattern）定义了一个创建对象的接口，但由子类决定要实例化的类是哪一个，工厂方法让类把实例化推迟到子类，这样的设计将对象的创建封装其来，以便于得到更松耦合，更有弹性的设计。 
//工厂方法模式是创建型设计模式之一，是结构较为简单的一种模式，在我们平时的开发过程中应用也是非常的广泛，比如 ArrayList，HashSet，与 Iterator 之间就能算是一种工厂方法。 
//简单工厂模式（Simple Factory）是工厂方法模式的一种，工厂方法模式的特点总结一下：
//
//简单工厂模式从某种意义上来说不算是真正的设计模式，但仍不失为一个简单的方法，可以将客户程序从具体类中解耦；
//工厂方法模式使用继承，把对象的创建委托给子类，子类实现工厂方法来创建对象，也就是说允许将实例化延迟到子类进行；；
//工厂方法模式是一个非常典型的“针对抽象编程，而不是具体类编程”例子。
public interface IAnimalFactory {
    String getName();

    String getGender();

    String play();

    String say();
}
