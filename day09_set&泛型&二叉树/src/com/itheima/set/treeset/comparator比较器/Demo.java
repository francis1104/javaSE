package com.itheima.set.treeset.comparator比较器;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        TreeSet<Teacher> tr = new TreeSet<>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {

                //o1是要存的元素    - this
                //o2是已经存入的元素
                //主要条件:年龄升序
                int result = o1.getAge()- o2.getAge();

                //次要条件:姓名升序
                result = result==0? o1.getName().compareTo(o2.getName()): result;

                return result;

            }
        });


        Teacher t1 = new Teacher("zhangsan",23);
        Teacher t2 = new Teacher("lisi",22);
        Teacher t3 = new Teacher("wangwu",24);
        Teacher t4 = new Teacher("zhaoliu",24);

        Collections.addAll(tr,t1,t2,t3,t4);

        System.out.println(tr);
    }
}
