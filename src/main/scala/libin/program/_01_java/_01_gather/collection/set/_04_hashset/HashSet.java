package libin.program._01_java._01_gather.collection.set._04_hashset;

/**
 * Copyright (c) 2020/03/07. xixi Inc. All Rights Reserved.
 * Authors: libin <2578858653@qq.com>
 * <p>
 * Purpose : JDK1.8
 * HashSet底层实现依赖HashMap（数组+链表+红黑树），使用其Key值，value值默认为PRESENT。无序，线程不安全，允许null值。
 */
public class HashSet<E> extends java.util.HashSet<E> {
    public static void main(String[] args){
        java.util.HashSet<String> hashSet = new java.util.HashSet<String>(16, 0.75f);
    }
}
