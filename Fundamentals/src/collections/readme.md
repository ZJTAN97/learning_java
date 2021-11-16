RECAP

- Class: A class is a user-defined blueprint or prototype from which objects are created. It represents the set of properties or methods that are common to all objects of one type.
- Interface: Like a class, an interface can have methods and variables, but the methods declared in an interface are by default abstract (only method signature, no body). 
Interfaces specify what a class must do and not how. It is the blueprint of the class.


# Types of Collections

### ArrayList
ArrayList provides us with dynamic arrays in Java. Though, it may be slower than standard arrays but can be helpful in programs where lots of manipulation in the array is needed. 
The size of an ArrayList is increased automatically if the collection grows or shrinks if the objects are removed from the collection. Java ArrayList allows us to randomly access the list. 
ArrayList can not be used for primitive types, like int, char, etc. We will need a wrapper class for such cases.



### LinkedList
LinkedList class is an implementation of the LinkedList data structure which is a linear data structure 
where the elements are not stored in contiguous locations and every element is a separate object with a data part and address part.



### Vector
Vector and ArrayList both uses Array internally as data structure. They are dynamically resizable. Difference is in the way they are internally resized. 
By default, Vector doubles the size of its array when its size is increased. But, ArrayList increases by half of its size when its size is increased.
Therefore as per Java API the only main difference is, Vector’s methods are synchronized and ArrayList’s methods are not synchronized.



### Stack
Stack class models and implements the Stack data structure. The class is based on the basic principle of last-in-first-out. In addition to the basic push and pop operations, the class provides three more functions of empty, search and peek. The class can also be referred to as the subclass of Vector.