
- Java LinkedList
    * 底层双向链表结构
    * 初始化流程
    + 插入元素流程
    * 删除元素流程

###### 1、底层双向链表结构
    private static class Node<E> {
            E item;
            Node<E> next;
            Node<E> prev;
            Node(Node<E> prev, E element, Node<E> next) {
                this.item = element;
                this.next = next;
                this.prev = prev;
            }
        }

###### 2. 初始化流程
    构造一个空的链表：
        public LinkedList() {
        }

###### 3. 插入元素流程
        3.1、使用add 函数添加指定元素：
            public boolean add(E e) {
                linkLast(e);
                return true;
            }
        调用linkLast将元素插在最后位置：
        void linkLast(E e) {
            final Node<E> l = last;
            final Node<E> newNode = new Node<>(l, e, null);  // 进行pre和next的关联设置
            last = newNode;
            if (l == null)
                first = newNode;  // 链表为null情况
            else
                l.next = newNode;  // 设置之前尾结点的next
            size++;
            modCount++;
        }
        3.2、使用addFirst函数，将元素拆入到链表首位：
            public void addFirst(E e) {
                linkFirst(e);
            }
        调用linkFirst将元素插在头部位置：    
            private void linkFirst(E e) {
                final Node<E> f = first;
                final Node<E> newNode = new Node<>(null, e, f);  // 进行pre和next的关联设置
                first = newNode;
                if (f == null)
                    last = newNode;  // 链表为null情况
                else
                    f.prev = newNode;  // 设置之前头结点的prev
                size++;
                modCount++;
            }            
        3.3、使用addLast函数，将元素拆入到链表尾部：
            public void addLast(E e) {
                linkLast(e);
            }

###### 4. 删除元素流程
    4.1、使用remove函数删除指定值的元素：   
        public boolean remove(Object o) {
            if (o == null) {
                for (Node<E> x = first; x != null; x = x.next) {
                    if (x.item == null) {
                        unlink(x);
                        return true;
                    }
                }
            } else {
                for (Node<E> x = first; x != null; x = x.next) {
                    if (o.equals(x.item)) {
                        unlink(x);
                        return true;
                    }
                }
            }
            return false;
        }
    调用函数unlink，把链表中所有等值的元素进行删除：
        E unlink(Node<E> x) {
            // assert x != null;
            final E element = x.item;
            final Node<E> next = x.next;
            final Node<E> prev = x.prev;
    
            if (prev == null) {
                first = next;
            } else {
                prev.next = next;
                x.prev = null;
            }
    
            if (next == null) {
                last = prev;
            } else {
                next.prev = prev;
                x.next = null;
            }
    
            x.item = null;
            size--;
            modCount++;
            return element;
        }
