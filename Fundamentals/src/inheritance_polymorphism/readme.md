## Inheritance
- It is the mechanism in java by which one class is allowed to inherit the features(fields and methods) of another class. 

### Important Terminology
- Super Class: The class whose features are inherited is known as superclass(or a base class or a parent class).
- Sub Class: The class that inherits the other class is known as a subclass(or a derived class, extended class, or child class).The subclass can add its own fields and methods in addition to the superclass fields and methods.
- Reusability: Inheritance supports the concept of “reusability”, i.e. when we want to create a new class and there is already a class that includes some of the code that we want, we can derive our new class from the existing class. By doing this, we are reusing the fields and methods of the existing class.


1. Single Inheritance
- Subclasses inherit the features of one superclass

2. Multilevel Inheritance
- A derived class will be inheriting a base class as well as the derived class which also act as the base class to other class.
- In Java, a class cannot directly access the grandparent's members.

3. Hierarchical Inheritance
- one class serves as a superclass (base class) for more than one subclass.

4. Multiple Inheritance
- One class can have more than one superclass and inherit features from all parent classes.
- In java, we can achieve multiple inheritances only through Interfaces.


## ---

## Polymorphism
- The world polymorphism means having many forms. 
- We can define polymorphism as the ability of a message to be displayed in more than one form.

Two Types of Polymorphism in Java
1. Compile-time (static)

- It is also known as static polymorphism. This type of polymorphism is achieved by function overloading or operator overloading. But Java doesn’t support the Operator Overloading.

- Method Overloading: When there are multiple functions with same name but different parameters then these functions are said to be overloaded. Functions can be overloaded by change in number of arguments or/and change in type of arguments.


2. Runtime (dynamic Method Dispatch)
- It is a process in which a function call to the overridden method is resolved at Runtime. 
- This type of polymorphism is achieved by Method Overriding.
- Method overriding, on the other hand, occurs when a derived class has a definition 
for one of the member functions of the base class. That base function is said to be overridden.