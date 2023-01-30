# Interfaces

- An interface is a completetely "abstract class" that is used to group related methods with empty bodies.
- A way to achieve abstraction in Java.
- To access the interface methods, the interface must be "implemented" by another class. (abit like inheritance)

<br>

# Why and When to use Interfaces?
- To achieve security -- hide certain details and only 
- To support "multiple inheritance" To implement multiple interfaces, seperate them with a comma.

<br>

# Static and default Methods in Interfaces

### Default

- The most common use of interface default methods is to incrementally provide additional functionality to a given type without breaking down the implementing classes.
- In addition, we can use them to provide additional functionality around an existing abstract method:

<br>

### Static

- The idea behind static interface methods is to provide a simple mechanism that allows us to increase the degree of cohesion of a design by putting together related methods in one single place without having to create an object.
- Static methods in interfaces make it possible to group related utility methods, without having to create artificial utility classes that are simply placeholders for static methods.