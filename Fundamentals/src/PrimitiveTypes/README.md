## Primitive Types

## Key Points to Solving Primitive Types
1. Be very comfortable with bitwise operators, particular XOR.
2. Understands how to use masks and create them in an machine independent way.
3. Know fast ways to clear the lowermost setbit.
4. Understand signedness and its implications to shifting.
5. Consider using a cache to accelerate operations by using it to brute-force small inputs.
6. Be aware that commutativity and associativity can be used to perform operations in parallel and reorder operations.

<br>
<hr>


## 1. Java Integer
- Is always in 32 bits

<br>
<hr>


## 2. Java Short
- The short data type is a 16-bit signed two's complement integer. 
- It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive). 
- As with byte, the same guidelines apply: you can use a short to save memory in large arrays, in situations where the memory savings actually matters.

<br>
<hr>

## 3. Difference between >> and >>>
- `>>>` is unsigned-shift
- `>>` is signed shift, extend the sign bit
- `>>>` will always put a 0 in the left most bit, while >> will put a 1 or a 0 depending on what the sign of it is.

<br>
<hr>

## 4. Trick to clearing lowest set bit
e.g.
7 --> 0111
6 --> 0110
4 --> 0100

```

x & ~(x-1)

```

<br>
<hr>

stopped at page 49