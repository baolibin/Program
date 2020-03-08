

###### HashSet、LinkedHashSet与TreeSet对比：

| 集合 | 底层实现 | 初始化 | 扩容 | 线程安全 | 查询&修改<br>时间复杂度 | 增加&删除<br>时间复杂度 |
| ---- | ---- | ---- | ---- | ---- | ---- | ---- |
| HashSet | HashMap | 初始容量16<br>加载因子0.75 | 2倍<br>重新计算元素位置 | 否 |  O（1） | O（1）|     
| LinkedHashSet | LinkedHashMap | 初始容量16<br>加载因子0.75 |  2倍<br>重新计算元素位置  | 否 | O（1） | O（1） |
| TreeSet | TreeMap | 空树 | 红黑树实现<br>容量没限制 | 否 | O（log n） | O（log n）|
