package com.example.designmode;

//平时在 android 中使用 double-checked 或者 SingletonHolder 都是可以的，毕竟 android 早就不使用 JDK5 之前的版本了。由于 android 中的多进程机制，在不同进程中无法创建同一个 instance 变量，就像 Application 类会初始化两次一样，这点需要注意。 
//但是不管采取何种方案，请时刻牢记单例的三大要点：
//
//线程安全；
//延迟加载；
//序列化与反序列化安全。
//单例模式同时也有缺点：
//单例模式一般没有接口，扩展很困难，若要扩展，除了修改代码基本上没有第二种途径可以实现；
//单例对象如果持有 Context，那么很容易引发内存泄漏，此时需要注意传递给单例对象的 Context 最好为 Application Context。

//所有实现方式都有两个共同的缺点：
//
//都需要额外的工作(Serializable、transient、readResolve())来实现序列化，否则每次反序列化一个序列化的对象实例时都会创建一个新的实例。
//可能会有人使用反射强行调用我们的私有构造器（如果要避免这种情况，可以修改构造器，让它在创建第二个实例的时候抛异常）。
public class Singleton {
    // 单例模式
    // 懒汉式加载，线程安全的，使用doublecheck方式,所谓的doublecheck，比如两个线程同时来访问这个类，当线程1首先访问的时候
    // 还没有进行实例化，它会获得同步锁，然后进行实例化，而线程2虽然也同时访问到了，但是由于1还没有交出同步锁，所以2直接退出，线程安全
    private static volatile Singleton singleton = null;

    public Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    // 懒汉式加载，线程不安全，多线程访问的时候会创建多个实例
    public Singleton getInstance1() {
        if (singleton == null) {
            singleton = new Singleton();
        }

        return singleton;
    }

    // 饿汉式，线程安全，由于对象是提前创建的，因此是线程安全的
    public static Singleton getInstance2() {
        return iSingleton;
    }

    private static Singleton iSingleton = new Singleton();

    // 通过静态内部类的方式去创建单一实例，静态内部类是在使用的时候进行初始化的，所以可以保证实例的创建，因此线程安全
    private static class SingletonHolder {
        public static final Singleton instance = new Singleton();
    }

    public static Singleton getInstances() {
        return SingletonHolder.instance;
    }
}
