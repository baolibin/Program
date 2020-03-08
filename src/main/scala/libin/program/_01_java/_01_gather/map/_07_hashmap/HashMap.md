
- Java HashMap
    * HashMap简介
    + HashMap有哪些主要的成员变量 
    * 初始化流程
    + 插入元素流程
    * 删除元素流程

###### 1. HashMap简介
    HashMap是k,v型数据存储，JDK1.8底层实现是（数组+单链表+红黑树）。线程不安全，允许null值。

###### 2. HashMap有哪些主要的成员变量 
    static final int DEFAULT_INITIAL_CAPACITY = 1 << 4; // aka 16  // 默认初始化数组长度。
    static final int MAXIMUM_CAPACITY = 1 << 30;  // 设定的最大数组长度。
    static final float DEFAULT_LOAD_FACTOR = 0.75f;  // 加载因子，扩容时候用。
    static final int TREEIFY_THRESHOLD = 8;  // Jdk1.8中，当桶中元素超过8时候，就用红黑树代替单链表结构。
    static final int UNTREEIFY_THRESHOLD = 6;   // 比如当扩容时候，数据重新分配，当桶中元素小于6时候，红黑树还原回单链表形式。
    static final int MIN_TREEIFY_CAPACITY = 64;  // 当哈希表容量大于这个值，表桶中的元素才会树形化。

###### 3. 初始化流程
    1、无参构造函数。默认构造参数容量为16，加载因子为0.75：
        public HashMap() {
            this.loadFactor = DEFAULT_LOAD_FACTOR; // all other fields defaulted
        }
    

###### 4. 插入元素流程


###### 5. 删除元素流程

