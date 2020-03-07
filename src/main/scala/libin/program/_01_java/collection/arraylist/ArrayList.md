
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
    3.1、不指定长度默认初始化一个空集合：
        /**
         * Constructs an empty list with an initial capacity of ten.
         */
        public ArrayList() {
            this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
        }
    调用add方法添加元素：
        public boolean add(E e) {
            ensureCapacityInternal(size + 1);  // Increments modCount!!
            elementData[size++] = e;
            return true;
        }
    调用ensureCapacityInternal函数会初始化一个10容量的集合：
        private void ensureCapacityInternal(int minCapacity) {
            if (elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
                minCapacity = Math.max(DEFAULT_CAPACITY, minCapacity);
            }
            ensureExplicitCapacity(minCapacity);
        }
    调用ensureExplicitCapacity函数确保集合容量能存下：
        private void ensureExplicitCapacity(int minCapacity) {
            modCount++;
            // overflow-conscious code
            if (minCapacity - elementData.length > 0)   // 如果传过来的值大于集合长度，调用grow函数
                grow(minCapacity);
        }
    调用grow函数进行扩容：
        private void grow(int minCapacity) {
            // overflow-conscious code
            int oldCapacity = elementData.length;
            int newCapacity = oldCapacity + (oldCapacity >> 1); // 扩充新集合长度为原来1.5倍
            if (newCapacity - minCapacity < 0)
                newCapacity = minCapacity;
            if (newCapacity - MAX_ARRAY_SIZE > 0)
                newCapacity = hugeCapacity(minCapacity);
            // minCapacity is usually close to size, so this is a win:
            elementData = Arrays.copyOf(elementData, newCapacity);
        }
    调用hugeCapacity函数判断超过集合设置的最长长度：
        private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;   
        private static int hugeCapacity(int minCapacity) {
            if (minCapacity < 0) // overflow
                throw new OutOfMemoryError();
            return (minCapacity > MAX_ARRAY_SIZE) ?
                Integer.MAX_VALUE :
                MAX_ARRAY_SIZE;
        }    
    
    3.2、指定长度则初始化指定长度集合：
        private static final Object[] EMPTY_ELEMENTDATA = {};
        public ArrayList(int initialCapacity) {
            if (initialCapacity > 0) {
                this.elementData = new Object[initialCapacity];
            } else if (initialCapacity == 0) {
                this.elementData = EMPTY_ELEMENTDATA;
            } else {
                throw new IllegalArgumentException("Illegal Capacity: "+
                                                   initialCapacity);
            }
        }
    

###### 4. 插入元素流程
    4.1、不指定插入位置：
        public boolean add(E e) {
            ensureCapacityInternal(size + 1);  // Increments modCount!!
            elementData[size++] = e;
            return true;
        }
    
    4.2、指定插入位置：
        public void add(int index, E element) {
            rangeCheckForAdd(index);  // 判断下标是否越界
    
            ensureCapacityInternal(size + 1);  // Increments modCount!!    // 判断是否需要进行扩容
            System.arraycopy(elementData, index, elementData, index + 1,   // 把集合区间段[index，size)拷贝到[index+1，size)上
                             size - index);
            elementData[index] = element;
            size++;
        }
        调用native函数进行数据拷贝：
        public static native void arraycopy(Object src,  int  srcPos,
                                            Object dest, int destPos,
                                            int length);

###### 5. 删除元素流程
    5.1、删除指定位置的元素：
        public E remove(int index) {
            rangeCheck(index);  // 判断下标是否越界
    
            modCount++;
            E oldValue = elementData(index);
    
            int numMoved = size - index - 1;  // 拷贝的集合长度
            if (numMoved > 0)
                System.arraycopy(elementData, index+1, elementData, index,
                                 numMoved);   // 把集合区间段[index+1，size)拷贝到[index，size)上
            elementData[--size] = null; // clear to let GC do its work  // 把拷贝移动后最后一位设置为null
    
            return oldValue;
        }
    5.2、删除指定元素：
        public boolean remove(Object o) {
            if (o == null) {
                for (int index = 0; index < size; index++)
                    if (elementData[index] == null) {
                        fastRemove(index);
                        return true;
                    }
            } else {
                for (int index = 0; index < size; index++)
                    if (o.equals(elementData[index])) {
                        fastRemove(index);
                        return true;
                    }
            }
            return false;
        }
    调用fastRemove快速删除指定位置的元素：
        private void fastRemove(int index) {
            modCount++;
            int numMoved = size - index - 1;
            if (numMoved > 0)
                System.arraycopy(elementData, index+1, elementData, index,
                                 numMoved);
            elementData[--size] = null; // clear to let GC do its work
        }


