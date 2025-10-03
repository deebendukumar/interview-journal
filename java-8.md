# Java 8 Interview Questions & Answers

## What features were introduced in Java 8?

Java 8 introduced several significant features, including:

- Lambda Expressions
- Functional Interfaces
- Stream API
- Default Methods in Interfaces
- Optional Class
- Date and Time API (java.time package)
- Method References
- Collectors
- Optional Class

## What are Lambda Expressions in Java 8?

Lambda Expressions are a way to represent a function as an instance of a functional interface. They provide a clear and
concise way to implement single-method interfaces (functional interfaces) using an expression.

## What is Stream API in Java 8?

The Stream API provides a functional approach to processing sequences of elements (like collections) in a declarative
way. It allows for operations like filtering, mapping, and reducing data.

## What are Functional Interfaces in Java 8?

A Functional Interface is an interface that contains exactly one abstract method. They can have multiple default or
static methods. The `@FunctionalInterface` annotation can be used to indicate that an interface is intended to be a
functional interface.

## What is Stream in Java 8?

A Stream is a sequence of elements that can be processed in a functional style. Streams support operations such as
filtering, mapping, and reducing. They can be either sequential or parallel.

## When to use map and flatMap functions in Java 8?

- Use `map` when you want to transform each element of a stream into another form. It applies a function to each element
  and returns a new stream with the transformed elements.
- Use `flatMap` when you have a stream of collections (or arrays) and you want to flatten them into a single stream. It
  applies a function that returns a stream for each element and then flattens the resulting streams into a single
  stream.

## Can we extend a functional interface from another functional interface in Java 8?

Yes, a functional interface can extend another functional interface. The resulting interface will still be a
functional interface as long as it has only one abstract method.

## What are the advantages of Lambda Expressions in Java 8?

- Conciseness: Reduces boilerplate code.
- Readability: Makes code easier to read and understand.
- Enables functional programming: Allows for a more functional programming style.
- Improved performance: Can lead to better performance with parallel processing.

## What all functional interfaces introduced in Java 8?

Some of the commonly used functional interfaces introduced in Java 8 include:

- `Predicate<T>`: Represents a boolean-valued function of one argument.
- `Function<T, R>`: Represents a function that takes an argument of type T and returns a result of type R.
- `Consumer<T>`: Represents an operation that takes an argument of type T and returns no result.
- `Supplier<T>`: Represents a supplier of results of type T.
- `BiFunction<T, U, R>`: Represents a function that takes two arguments of types T and U and returns a result of type R.
- `BiConsumer<T, U>`: Represents an operation that takes two arguments of types T and U and returns no result.
- `UnaryOperator<T>`: A specialization of Function for the case where the input and output are of the same type.
- `BinaryOperator<T>`: A specialization of BiFunction for the case where the input and output are of the same type.

## What is Optional class in Java 8?

The `Optional` class is a container object that may or may not contain a non-null value. It is used to represent
optional values and helps to avoid `NullPointerException`. It provides methods to check for presence, retrieve the 
value, or provide a default value.

## What is the Date-Time API in Java 8?

The Date-Time API (java.time package) introduced in Java 8 provides a comprehensive and improved way to handle date and
time.
It includes classes like `LocalDate`, `LocalTime`, `LocalDateTime`, `ZonedDateTime`, and `Duration` for better date and
time manipulation.

## What is method reference in Java 8?

Method references provide a way to refer to methods without executing them. They are a shorthand notation of a lambda
expression to call a method. There are four types of method references:

- Reference to a static method
- Reference to an instance method of a particular object
- Reference to an instance method of an arbitrary object of a particular type
- Reference to a constructor

## What is MetaSpace in Java 8?

MetaSpace is a memory space that stores class metadata. Unlike the previous PermGen space, MetaSpace is not part of the
heap and can grow dynamically based on the application's needs. This helps to avoid `OutOfMemoryError` related to class
metadata.

