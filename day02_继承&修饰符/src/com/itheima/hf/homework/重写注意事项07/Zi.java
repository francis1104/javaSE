package com.itheima.hf.homework.重写注意事项07;

public class Zi extends Fu{
    //Override注解的作用: 校验当前方法是否符合方法重写语法规范!
    //符合: 注解正常; 不符合: 注解飘红
    @Override
    public void method01(){}

    //@Override   注意: 父类中的私有方法, 子类不能重写
    private void method02(){}

    //@Override   注意: 父类中的静态方法, 子类不能重写
    public static void method03(){}

    // Java中的权限修饰符范围从大到小:  public > protected > 默认 > private
    // 默认权限: 不写就是默认权限!
    @Override    // 注意:  子类重写父类方法,要求子类方法权限 大于等于 父类方法权限!
    public void method04(){}

    /*
        注意:  子类重写父类方法,要求子类方法返回值类型与父类方法返回值类型相同!
                                或者子类方法返回值类型是父类方法返回值类型的子类型!
     */
    @Override
    public Zi method05(){
        return new Zi();
    }

}

 class Fu {
    public void method01(){}

    private void method02(){}

    public static void method03(){}

    // 默认权限: 不写就是默认权限!
    void method04(){}


    //当方法的返回值类型是一个类名时,方法中要返回是该类的对象!
    public Fu method05(){
        Fu f = new Fu();
        return f;
    }
}
