package libin.program._01_java._01_gather.collection.list._03_vector;

/**
 * Copyright (c) 2020/03/08. xixi Inc. All Rights Reserved.
 * Authors: libin <2578858653@qq.com>
 * <p>
 * Purpose : JDK1.8
 * JDK1.0引入的集合类，底层实现是动态数组，线程安全，初始大小10，允许元素为null，
 * 适合查询和修改，不适合随机增加和删除。
 */
public class Vector<E> extends java.util.Vector<E> {
    public static void main(String[] args) {
        java.util.Vector<String> vector = new java.util.Vector<String>(10);
        vector.add(null);
        System.out.println(vector.size());
    }
}
