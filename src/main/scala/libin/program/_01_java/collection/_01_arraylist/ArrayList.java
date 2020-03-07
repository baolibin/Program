package libin.program._01_java.collection._01_arraylist;

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

    // 主要方法含义
    // public boolean add(E e)  将指定元素添加到列表尾部。
    // public void add(int index, E element)    将制定的元素添加到列表指定位置。
    // public boolean addAll(Collection<? extends E> c)  将Collection迭代器返回的元素，添加到此列表的尾部。
    // public boolean addAll(int index, Collection<? extends E> c)  将Collection迭代器返回的元素，添加到此列表指定的位置。
    // public void clear()  移出此列表的所有元素。
    // public Object clone()   返回此列表的浅表副本。
    // public boolean contains(Object o)  如果此列表包含指定的元素，则返回true。
    // private void ensureCapacityInternal(int minCapacity)  增加此列表的容量，确保至少能容纳最小容量参数的元素个数。
    // public E get(int index)  返回指定位置的元素。
    // public int indexOf(Object o)  返回指定元素首次出现的位置，如果此列表不包含此元素，则返回-1。
    // public boolean isEmpty()  如果此列表中没有元素，则返回true。
    // public int lastIndexOf(Object o)  返回此列表最后出现指定元素的索引，否则返回-1。
    // public E remove(int index) 移出此列表指定位置元素。
    // protected void removeRange(int fromIndex, int toIndex)  移出此列表一段范围位置元素，左开右闭。
    // public E set(int index, E element)  指定元素替代指定位置元素。
    // public int size()  列表中元素个数。
    // public Object[] toArray()  列表中所有元素转换为数组。
    // public void trimToSize()  将列表容量调整为数组大小。

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
    }
}
