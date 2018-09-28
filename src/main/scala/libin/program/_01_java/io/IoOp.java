package libin.program._01_java.io;

import java.io.File;
import java.io.IOException;

/**
 * Copyright (c) 2018/09/22. xixi Inc. All Rights Reserved.
 * Authors: libin <2578858653@qq.com>
 * <p>
 * Purpose :
 */
public class IoOp {
    public static void main(String[] args) {
        IoOp ioOp = new IoOp();
        ioOp.FileUtils();
    }

    private void FileUtils() {
        FileUtils fileUtils = new FileUtils();
        // fileUtils.FileCreate("test");
        // fileUtils.FileDelete("test");
        System.out.println(File.pathSeparator);  // 冒号
        System.out.println(File.separator);  // 右斜线
        // fileUtils.DirCreate("test");
        // fileUtils.listFile();
        // fileUtils.isDir("test");
        fileUtils.printFile(new File("E:\\tmp"));
    }
}
