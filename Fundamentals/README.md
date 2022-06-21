## 1. Lambda Expressions

- is an anonymous function, function without name and does not belong to any class
- mainly used to implement functional interfaces
- () -> {} // lambda input parameters, arrow denoting lambda, lambda body
  <br>

<hr>

## 2. Functional Interfaces

- an interface that contains exactly one abstract method is known as functional interface
- functional interface can have any number of default, static methods but contain only one abstract method
- @FunctionalInterface annotation to mark an interface as a Functional Interface
  <br>

<hr>

## 3. Method References

- is used to refer method of the functional interface
- each time when you are using lambda expression to just referring a method, you can replace your lambda expression with
  a method reference

```
Printable printableLambda = (String msg) -> System.out.println(msg);
printableLambda.print("Hello");

Printable printable = System.out::println;
printable.print("Hello");

```

