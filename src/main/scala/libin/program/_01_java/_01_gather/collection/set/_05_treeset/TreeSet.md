
- Java TreeSet
    * TreeSet简介
    + TreeSet有哪些主要的成员变量 
    * 初始化流程
    + 插入元素流程
    * 删除元素流程

###### 1. TreeSet简介
    底层实现依赖TreeMap（红黑树），非线程安全，是一个有序的集合，对内部元素操作的时间复杂度O(log n)。

###### 2. TreeSet有哪些主要的成员变量 
    private static final Object PRESENT = new Object();  // 只使用TreeMap的key，value值统一设置为PRESENT。

###### 3. 初始化流程
    1、无参构造器会调用生成一个TreeMap对象。
        public TreeSet() {
            this(new TreeMap<E,Object>());
        }
    2、传入比较器的构造函数：
        public TreeSet(Comparator<? super E> comparator) {
            this(new TreeMap<>(comparator));
        }

###### 4. 插入元素流程
    1、使用add 函数添加元素：
        public boolean add(E e) {
            return m.put(e, PRESENT)==null;
        }

###### 5. 删除元素流程
    1、使用remove 函数删除元素：
        public boolean remove(Object o) {
            return m.remove(o)==PRESENT;
        }

