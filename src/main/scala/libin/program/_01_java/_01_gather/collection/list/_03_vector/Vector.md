
- Java Vector
    * Vector简介
    + Vector有哪些主要的成员变量 
    * 初始化流程
    + 插入元素流程
    * 删除元素流程

###### 1. TreeSet简介
    JDK1.0引入的集合类，底层实现是动态数组，线程安全，初始大小10，允许元素为null，

###### 2. TreeSet有哪些主要的成员变量 
    protected Object[] elementData;  // 存放数据的数组
    protected int elementCount;  // 数组元素个数
    protected int capacityIncrement;  // 每次扩容增加的量

###### 3. 初始化流程
    1、无参构造函数：
        public Vector() {
            this(10);  // 默认初始容量为10
        }
    扩充增加值默认为0：
        public Vector(int initialCapacity) {
            this(initialCapacity, 0);
        }
    创建Object数组：
        public Vector(int initialCapacity, int capacityIncrement) {
            super();
            if (initialCapacity < 0)
                throw new IllegalArgumentException("Illegal Capacity: "+
                                                   initialCapacity);
            this.elementData = new Object[initialCapacity];
            this.capacityIncrement = capacityIncrement;
        }
    
###### 4. 插入元素流程
    1、使用add 函数增加元素：
        public void add(int index, E element) {
            insertElementAt(element, index);
        }
    调用线程安全的函数insertElementAt进行元素的插入：
        public synchronized void insertElementAt(E obj, int index) {
            modCount++;
            if (index > elementCount) {
                throw new ArrayIndexOutOfBoundsException(index
                                                         + " > " + elementCount);
            }
            ensureCapacityHelper(elementCount + 1);  // 判断确保当前数组容量可以插入元素
            System.arraycopy(elementData, index, elementData, index + 1, elementCount - index);  // 数组拷贝，区间段[index,elementData)拷贝到[index+1,elementData+1)
            elementData[index] = obj;  // 指定位置插入该元素
            elementCount++;  // 数组用元素个数增加1
        }
    调用ensureCapacityHelper函数判断插入元素之前是否需要扩容：
        private void ensureCapacityHelper(int minCapacity) {
            // overflow-conscious code
            if (minCapacity - elementData.length > 0)
                grow(minCapacity);
        }
    调用函数grow进行扩容，如果capacityIncrement值大于零，则扩容新增加容量为capacityIncrement：
        private void grow(int minCapacity) {
            // overflow-conscious code
            int oldCapacity = elementData.length;
            int newCapacity = oldCapacity + ((capacityIncrement > 0) ?
                                             capacityIncrement : oldCapacity);
            if (newCapacity - minCapacity < 0)
                newCapacity = minCapacity;
            if (newCapacity - MAX_ARRAY_SIZE > 0)
                newCapacity = hugeCapacity(minCapacity);
            elementData = Arrays.copyOf(elementData, newCapacity);  // 进行数组扩容拷贝
        }
    如果新扩容后数组长度大于MAX_ARRAY_SIZE，则扩容后数组长度赋值为Integer.MAX_VALUE：
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;
    private static int hugeCapacity(int minCapacity) {
            if (minCapacity < 0) // overflow
                throw new OutOfMemoryError();
            return (minCapacity > MAX_ARRAY_SIZE) ?
                Integer.MAX_VALUE :
                MAX_ARRAY_SIZE;
        }

###### 5. 删除元素流程
    1、使用remove 函数删除元素，该函数式线程安全的：
        public synchronized E remove(int index) {
            modCount++;
            if (index >= elementCount)
                throw new ArrayIndexOutOfBoundsException(index);
            E oldValue = elementData(index);
    
            int numMoved = elementCount - index - 1;
            if (numMoved > 0)
                System.arraycopy(elementData, index+1, elementData, index,  // 数组拷贝，区间段[index+1,elementData)拷贝到[index,elementData-1)
                                 numMoved);
            elementData[--elementCount] = null; // Let gc do its work
    
            return oldValue;
        }


