package com.itheima.day14IO.第七题;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/*后缀为properties的文件是一种属性文件，这种文件以key=value的格式存储内容，可以使用Properties类来读取这个文件，
Properties可以保存到流中或从流中加载。已知在当前模块目录下，有一个user.properties文件（直接准备好即可），内容如下：
username=heima001
passworld=123456
url=http://www.itheima.com
subjectName=javaee
请编写程序，将文件中的内容以键值对的形式存储到Properties集合中，并遍历查看结果。*/
public class Demo {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();

        prop.load(new FileInputStream("homework/user.properties"));

        prop.forEach((k,v)->{
            System.out.println(k+"="+v);
        });

    }
}
