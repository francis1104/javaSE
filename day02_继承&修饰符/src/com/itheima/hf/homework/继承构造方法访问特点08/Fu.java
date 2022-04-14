package com.itheima.hf.homework.继承构造方法访问特点08;
/*
    继承语法下构造方法访问特点:
        1. 不管在哪个类中, 构造方法第一行语句,默认都是: super();
        2. 如果我们在构造方法中,手动给出了super(),那么JVM就不会默认添加了!
        3. this() 和super()是不能共存的!

    问: 如果父类没有提供无参构造,子类要如何处理?
    答: 子类构造中,手动调用父类带参构造!
    super(): 调用父类无参构造!
 */
public class Fu {
    public Fu(){
        System.out.println("fu无参构造执行了。。。");
    }
    public Fu(int a){
        System.out.println("fu有参构造执行了。。。");
    }
}

class Zi extends Fu{
    public Zi() {
        System.out.println("zi无参构造执行了");
    }

    public Zi(int a) {
        System.out.println("zi有参构造执行了");
    }
}
class Demo{
    public static void main(String[] args) {
        Zi zi = new Zi();
        Zi zi1 = new Zi(1);


    }
}
//观察下列代码,分析可能存在的问题,并给出所有你能想到的解决方案!
//问题: 因为Zi类中没有定义任何构造,JVM会默认赠送一个无参构造, 并且会在无参构造第一行添加: super();
//而super()是访问父类的无参构造, 当前代码材料中Fu类没有无参构造,所以语法报错!

//解决方案: 1. 在父类中补充无参构造; 2. 子类构造手动调用父类带参构造

/*
public class Fu {
    //public Fu(){}
    public Fu(int a){ }
}

class Zi extends Fu{
    public Zi(){
        super(10);
    }
}*/
