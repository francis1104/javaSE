package com.itheima.file.使用commonsio删除多级文件夹;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/francis/Desktop/src");
        FileUtils.deleteDirectory(file);
    }
}
