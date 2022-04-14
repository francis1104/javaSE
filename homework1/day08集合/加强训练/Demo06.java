package com.itheima.day08集合.加强训练;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

/*某高三年级进行了一次月考，马冬梅所在的小组考试成绩如下：
请创建Student类表示每一名学生，尝试使用集合的相关知识对这5名学生按照总分降序排序，如果总分一样，则按
照语文成绩降序。排序完成之后遍历集合，并打印结果，打印效果如下：
姓名(name) 语文(chinese) 数学(math) 英语(english)
马冬梅 92 87 93
夏洛 79 97 81
袁华 97 93 94
大春 85 88 91
秋雅 95 90 99
*/
public class Demo06 {
    public static void main(String[] args) {
        TreeSet<Student> set = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o2.getSum() - o1.getSum();

                result = result == 0 ? o2.getChinese() - o1.getChinese() : result;

                return result;
            }
        });

        Student s1 = new Student("马冬梅", 92, 87, 93);
        Student s2 = new Student("夏洛", 79, 97, 81);
        Student s3 = new Student("袁华", 97, 93, 94);
        Student s4 = new Student("大春", 85, 88, 91);
        Student s5 = new Student("秋雅", 95, 90, 99);

        Collections.addAll(set, s1, s2, s3, s4, s5);

        for (Student s : set) {
            System.out.println(s);
        }
    }
}

class Student {
    private String name;
    private int chinese;
    private int math;
    private int english;
    private int sum ;

    public Student() {
    }

    public Student(String name, int chinese, int math, int english) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
        sum = chinese + math + english;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", chinese=" + chinese +
                ", math=" + math +
                ", english=" + english +
                ", sum=" + sum +
                '}';
    }
}
