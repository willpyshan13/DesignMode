# DesignMode
# 1、设计模式六大原则
     <h2> 1）单一职责原则 （ Single Responsibility Principle ）</h2>
单一职责的英文名称是Single Responsibility Principle，缩写是SRP。SRP的定义是：就一个类而言，应该仅有一个引起它变化的原因。简单来说，一个类中应该是一组相关性很高的函数、数据的封装，所以如果类执行的功能过多就要考虑将类进行拆分了。 
     <h2> 2）里氏替换原则 （ Liskov Substitution Principle）</h2> 
里氏替换原则英文全称是Liskov Substitution Principle， 缩写是LSP。LSP 的第一种定义是：如果对每一个类型为 S 的对象 O1，都有类型为 T 的对象 O2， 使得以 T 定义的所有程序 P 在所有的对象 O1，都代换成 O2 时，程序 P 的行为没有发生变化，那么类型 S 是类型 T 的子类型。上面这种描述确实不太好理解，我们再看看另一个直截了当的定义，里氏替换原则第二种定义：所有引用基类的地方必须能透明的使用其子类的对象。 
     <h2> 3）依赖倒置原则 （Dependence Inversion Principle）</h2> 
依赖倒置原则英文全称是Dependence Inversion Principle ，缩写是DIP。依赖倒置原则指代了一种特定的解耦形势，使得高层次的模块不依赖于低层次的模块实现细节的目的，依赖模块被颠倒了。依赖倒置原则有以下几个关键点
     <h2> 4）开闭原则 （ Open-Close Principle ）</h2> 
开闭原则的英文全称是Open Close Principle，缩写是OCP，它是Java世界里最基础的设计原则，它指导我们如何建立一个稳定的、灵活的系统。开闭原则的定义是：软件中的对象（类、模块、函数等）应该对于扩展是开放的，但是，对于修改是封闭的（open for extension and close for modification）。
     <h2> 5）接口隔离原则 （Interface Segregation Principle）</h2> 
接口隔离原则英文全称是 InterfaceSegregation Principles，缩写是ISP。ISP 的定义是：客户端不应该依赖它不需要的接口。另一种定义是：类间的依赖关系应该建立在最小的接口上。
     <h2> 6）迪米特原则 （ Law of Demeter ）</h2> 
迪米特原则英文全称为 Law of Demeter， 缩写是LOD，也称为最少知识原则（Least Konwledge Principle）。虽然名字不同，但描述的是同一个原则：一个对象应该对其他对象有最少的了解。通俗地讲，一个类应该对自己需要耦合或调用的类知道得最少，类的内部如何实现与调用者或者依赖者没关系，调用者或者依赖者只需要知道它需要的方法即可，其他的可一概不用管。类与类之间的关系越密切，耦合度就越大，当一个类发生改变时，对另一个类的影响也越大。
