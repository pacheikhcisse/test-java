#### How to

This class Partition will allow you to create a partition of a list of `Object` to a sublist of objects of `size` size.

To use it :
```java
Partition<Object> p = new Partition();
Collection<List<Object> collection = p.createPartition(List<Object> objects, int size);
```