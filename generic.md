# Generic Interview Questions & Answers

## What are some advantages of using Generic Types in Java?

- **Type Safety**: Generics provide compile-time type checking, which helps catch type-related errors early in the
  development process.
- **Code Reusability**: Generics allow you to create classes, interfaces, and methods that can operate on different data
  types without code duplication.
- **Elimination of Casts**: With generics, you can avoid explicit type casting, making the code cleaner and less
  error-prone.
- **Improved Readability**: Generics make the code more readable and easier to understand by clearly indicating the
  types being used.
- **Performance**: Generics can lead to better performance by reducing the need for type casting and improving code
  optimization by the compiler.

## What is Type Inference in Java Generics?

Type inference is a feature in Java Generics that allows the compiler to automatically determine the type parameters
based on the context in which a generic method or constructor is called. This means that you can omit the explicit type
arguments when invoking a generic method or constructor, and the compiler will infer the appropriate types.
example:

```java
public static <T> T returnType(T argument) {
    return argument;
}

// Type inference in action
Integer inferredInteger = returnType(1);
String inferredString = returnType("String");
````

## What Is a Bounded Type Parameter?

A bounded type parameter is a way to restrict the types that can be used as arguments for a generic type parameter. In
Java, you can use the `extends` keyword to specify an upper bound for a type parameter, meaning that the type must be a
subclass of a specified class or implement a specified interface. You can also use the `super` keyword to specify a
lower bound, meaning that the type must be a superclass of a specified class.
example:

```java
// Upper bounded type parameter
public abstract class Cage<T extends Animal> {
    abstract void addAnimal(T animal);
}
```

We use bounded parameter, when want to restrict the types that can be used with a generic class or method.

## Is It Possible to Declared a Multiple Bounded Type Parameter?

Yes, it is possible to declare a multiple bounded type parameter in Java Generics. You can specify multiple bounds for a
type parameter by using the `&` operator. When using multiple bounds, if one of the bounds is a class, it must be the
first in the list.
example:

```java
public abstract class Cage<T extends Animal & Comparable> {
}
````
