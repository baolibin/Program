package libin.program._01_java.io;

import java.io.File;
import java.io.IOException;

/**
 * Copyright (c) 2018/09/28. xixi Inc. All Rights Reserved.
 * Authors: libin <2578858653@qq.com>
 * <p>
 * Purpose :
 */
class FileUtils {
    /**
     * 创建文件
     */
    void FileCreate(String fileName) {
        File file = new File("e:\\tmp\\" + fileName + ".txt");
        try {
            //noinspection ResultOfMethodCallIgnored
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 删除文件
     */
    void FileDelete(String fileName) {
        File file = new File("e:\\tmp\\" + fileName + ".txt");
        //noinspection ResultOfMethodCallIgnored
        file.delete();
    }

    /**
     * 创建文件夹
     */
    void DirCreate(String fileName) {
        File file = new File("e:\\tmp\\" + fileName);
        file.mkdir();
    }

    /**
     * 列出指定目录下文件名或路径
     */
    void listFile() {
        File file = new File("e:\\tmp");
        // 列出文件或目录名字
        String[] list = file.list();
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }

        // 列出文件或目录路径
        File[] files = file.listFiles();
        for (int i = 0; i < list.length; i++) {
            System.out.println(files[i]);
        }
    }

    /**
     * 判断是否为文件或目录
     */
    void isDir(String fileName) {
        File file = new File("e:\\tmp\\" + fileName);
        System.out.println(file.isDirectory());  // 是否为目录
        System.out.println(file.isFile());  // 是否为文件
    }

    /**
     * 列出指定目录下的所有文件
     */
    void printFile(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                if (files.length > 0) {
                    for (int i = 0; i < files.length; i++) {
                        printFile(files[i]);
                    }
                }
            } else {
                System.out.println(file);
            }
        }
    }
}
