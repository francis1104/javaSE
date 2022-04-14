package com.itheima.抽象类02.抽象类细节02;
/*
    抽象类的细节:
        1. 抽象类能不能创建对象?
                不能. sun公司规定!
        2. 抽象类和抽象方法的关系?
               a. 抽象类中一定要有抽象方法吗?
                            -- 不是. 只要被abstract修饰的类就是抽象类!
               b. 有抽象方法的类一定要是抽象类吗?
                            -- 是的!有抽象方法的类一定是抽象类!
        3. 关于抽象类的子类?
                a. 积极的子类: 重写父类中所有抽象方法!
                b. 消极的子类: 不重写父类中象方法, 让自身继续抽象!
        4. 抽象类中有没有构造方法?
                有! Java中只要是类(class)就一定有构造!
                因为抽象类一般作为父类设计,必须提供构造方法,保证子类对象创建时,顺利初始化父类成员!
 */
public class Demo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
    }
}
