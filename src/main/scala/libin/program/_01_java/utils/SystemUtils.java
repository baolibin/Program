package libin.program._01_java.utils;

/**
 * Copyright (c) 2018/9/9. xixi Inc. All Rights Reserved.
 * Authors: libin <2578858653@qq.com>
 * <p>
 * Purpose :
 */
public class SystemUtils {
    public static void main(String[] args){
        System.out.println(System.currentTimeMillis());
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("os.version"));
        System.out.println(System.getProperty("os.arch"));
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("user.dir"));

    }
}
