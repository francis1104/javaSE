package com.itheima.day09set.第四题;

//import com.itheima.day02继承.第一题.Student;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

/*在某次考试中，学生的成绩信息如下：
姓名 年龄 成绩
Tom 20 90
Jerry 22 95
John 20 100
Lily 22 100
Lucy 22 90
Kevin 22 90
请分别用Comparable和Comparator两个接口对以上同学的成绩做降序排序，如果成绩一样，
那在成绩排序的基础上按照年龄由小到大排序，成绩和年龄都一样，则按照姓名的字典顺序排序*/
public class Demo {
    public static void main(String[] args) {
        TreeSet<Student> set = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o2.getScore() - o1.getScore();

                result = result == 0 ? o1.getAge() - o2.getAge() : result;

                result = result == 0 ? o1.getName().compareTo(o2.getName()) : result;

                return result;
            }
        });

        Student s1 = new Student("tom",20,90);
        Student s2 = new Student("jerry",22,95);
        Student s3 = new Student("john",20,100);
        Student s4 = new Student("lily",22,100);
        Student s5 = new Student("lucy",22,90);
        Student s6 = new Student("kevin",22,90);

        Collections.addAll(set,s1,s2,s3,s4,s5,s6);

        for (Student student : set) {
            System.out.println(student);
        }
    }
}

class Student implements Comparable<Student> {

    private String name;
    private int age;
    private int score;

    @Override
    public int compareTo(Student o) {
        int result = o.score - this.score;

        result = result == 0 ? this.age - o.age : result;

        result = result == 0 ? this.name.compareTo(o.name) : result;

        return result;
    }

    public Student() {
    }

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}