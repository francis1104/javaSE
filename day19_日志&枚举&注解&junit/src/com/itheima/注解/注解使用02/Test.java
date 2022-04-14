package com.itheima.注解.注解使用02;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)//注解可以标记的位置
@Retention(RetentionPolicy.RUNTIME)//注解存活时间
public @interface Test {
}
