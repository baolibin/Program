
- Java LinkedHashSet
    * LinkedHashSet简介
    + LinkedHashSet有哪些主要的成员变量 
    * 初始化流程
    + 插入元素流程
    * 删除元素流程


###### 1. LinkedHashSet简介
    LinkedHashSet底层依赖LinkedHashMap来实现。

###### 2. LinkedHashSet有哪些主要的成员变量 
    继承自HashSet，成员变量使用HashSet的变量。

###### 3. 初始化流程
    1、无参构造函数：
        public LinkedHashSet() {
            super(16, .75f, true);
        }
    调用HashSet的构造方法，底层依赖LinkedHashMap来实现：
        HashSet(int initialCapacity, float loadFactor, boolean dummy) {
            map = new LinkedHashMap<>(initialCapacity, loadFactor);
        } 
    2、指定容量初始化：
        public LinkedHashSet(int initialCapacity) {
            super(initialCapacity, .75f, true);
        }
    3、指定容量和加载因子初始化：
        public LinkedHashSet(int initialCapacity, float loadFactor) {
            super(initialCapacity, loadFactor, true);
        }

###### 4. 插入元素流程
    1、使用add函数会调用HashSet的函数：
        public boolean add(E e) {
            return map.put(e, PRESENT)==null;
        }

###### 5. 删除元素流程
    1、使用remove函数会调用HashSet的函数：
        public boolean remove(Object o) {
            return map.remove(o)==PRESENT;
        }

