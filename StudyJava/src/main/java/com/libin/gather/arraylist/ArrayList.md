
- Java ArrayList
    * ArrayList简介
    + ArrayList有哪些主要的成员变量 
    * 初始化流程
    + 插入元素流程
    * 删除元素流程

###### 1. Java ArrayList
    ArrayList是平时编程中用的比较多的集合，用归用，原理是必须要掌握的。
    底层存储结构是数组，可以存储任意类型数据，线程不安全，很适用用于元素查找。

###### 2. ArrayList有哪些主要的成员变量 
    private static final int DEFAULT_CAPACITY = 10; // 默认初始化大小。
    private static final Object[] EMPTY_ELEMENTDATA = {}; // 自定义容量为0，构造方法会初始化一个空数组使用。
    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {}; // 没用自定义容量，进行初始化
    transient Object[] elementData; // 真正存放数据的数组。
    private int size; // 数组元素个数。

###### 3. 初始化流程
    初始化

###### 4. 插入元素流程


###### 5. 删除元素流程




