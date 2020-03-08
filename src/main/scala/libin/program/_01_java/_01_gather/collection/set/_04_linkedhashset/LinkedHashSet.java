package libin.program._01_java._01_gather.collection.set._04_linkedhashset;

/**
 * Copyright (c) 2020/03/07. xixi Inc. All Rights Reserved.
 * Authors: libin <2578858653@qq.com>
 * <p>
 * Purpose : JDK1.8
 * LinkedHashSet底层实现依赖LinkedHashMap（哈希表+双向链表），使用其Key值，value值默认为PRESENT。有序，线程不安全，允许null值。
 */
public class LinkedHashSet<E> extends java.util.LinkedHashSet {
    public static void main(String[] args) {
        java.util.LinkedHashSet<String> linkedHashSet =
                new java.util.LinkedHashSet<String>(16, 0.75f);

        linkedHashSet.add("head");
        linkedHashSet.remove("head");
        System.out.println(linkedHashSet.size());
    }
}
