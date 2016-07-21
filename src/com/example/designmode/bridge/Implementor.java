package com.example.designmode.bridge;

//Abstraction：抽象部分
//该类保持一个对实现部分对象的引用，抽象部分中的方法需要调用实现部分的对象来实现，该类一般为抽象类；
//RefinedAbstraction：优化的抽象部分
//抽象部分的具体实现，该类一般对抽象部分的方法进行完善和扩展；
//Implementor：实现部分
//可以为接口或者是抽象类，其方法不一定要与抽象部分中的一致，一般情况下是由实现部分提供基本的操作，而抽象部分定义的则是基于实现部分基本操作的业务方法；
//ConcreteImplementorA 和 ConcreteImplementorB ：实现部分的具体实现
//完善实现部分中定义的具体逻辑。
public interface Implementor {
    void operationImpl();
}
