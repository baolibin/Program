package com.libin.gather;

/**
 * Copyright (c) 2020/03/04. xixi Inc. All Rights Reserved.
 * Authors: libin <2578858653@qq.com>
 * <p>
 * Purpose : JDK1.8
 * ArrayList底层是使用数据实现存储，查找效率高、增删效率低、线程不安全。
 */
public class ArrayList<E> extends java.util.ArrayList<E> {
    // 默认初始化容量
    private static final int DEFAULT_CAPACITY = 10;
    // 列表存储元素个数
    private int size;
    // 底层实现数组
    transient Object[] elementData;
    // public boolean add(E e)  将指定元素添加到列表尾部
    // public void add(int index, E element)    将制定的元素添加到列表指定位置

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
    }
}
