package com.itheima.抽象类02.抽象类的使用03;
//吃饭模板类
public abstract class EatingTemplate {
    public void eat(){
        System.out.println("排队取餐盘");
        dianCan();
        System.out.println("扫码结账");
    }
    public abstract void dianCan();
}

class LiuYan extends EatingTemplate{

    @Override
    public void dianCan() {
        System.out.println("木瓜炒西瓜");
        System.out.println("西瓜炒木瓜");
        System.out.println("两个大馍");
    }
}

class YangMi extends EatingTemplate{

    @Override
    public void dianCan() {
        System.out.println("西红柿炒番茄");
        System.out.println("番茄炒西红柿");
        System.out.println("一碗大米饭");
    }
}