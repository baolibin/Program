
- Java HashSet
    * HashSet简介
    + HashSet有哪些主要的成员变量 
    * 初始化流程
    + 插入元素流程
    * 删除元素流程

###### 1. HashSet简介
    HashSet是基于HashMap来实现的，value使用同一变量PRESENT来设置。
    不保证元素的插入顺序，线程不安全，允许null值，底层实现为(数据+链表）。

###### 2. HashSet有哪些主要的成员变量 
    private transient HashMap<E,Object> map;  // HashSet创建依赖HashMap。
    private static final Object PRESENT = new Object();  // HashSet只用到了HashMap的key值，value设置为PRESENT。

###### 3. 初始化流程
    1、调用无参构造函数：
        public HashSet() {
            map = new HashMap<>();
        }
    2、传入容量参数，加载因子默认为0.75：
        public HashSet(int initialCapacity) {
            map = new HashMap<>(initialCapacity);
        }
    3、传入容量参数和扩容的加载因子参数：
        public HashSet(int initialCapacity, float loadFactor) {
            map = new HashMap<>(initialCapacity, loadFactor);
        }
    

###### 4. 插入元素流程
    1、使用add 方法插入元素：
        public boolean add(E e) {
            return map.put(e, PRESENT)==null;
        }
    

###### 5. 删除元素流程
    1、使用remove 方法删除元素：
        public boolean remove(Object o) {
            return map.remove(o)==PRESENT;
        }

    