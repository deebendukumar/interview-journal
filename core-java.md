# Core Java Interview Questions & Answers

## Why pointers are eliminated from Java ?

Pointers are eliminated due to following reasons,

- Pointers lead to confusion for a programmer
- Pointers may crash a program easily, for example , when we add two pointers, the program crashers
  immediately.
- Pointers break security. Using pointers, harmful programs like Virus and other hacking programs
  can be developed. Because of the above reasons, pointers have been eliminated from java.

## What is the difference between a function and a method.?

A method is a function that is written in a class. We do not have functions in java; instead we
have methods. This means whenever a function is written in java. It should be written inside the class
only. But if we take C++, we can write the functions inside as well as outside the class. So in C++,
they are called member functions and not methods.

## Which part of JVM will allocate the memory for a java program.?

Class loader subsystem of JVM will allocate the necessary memory needed by the java
program.

## Which algorithm is used by garbage collector to remove the unused variables or objects from memory.?

Garbage collector uses many algorithms but the most commonly used algorithm is mark and sweep.

## What is Mark and Sweep algorithm.?

Mark-and-Sweep is a classic root-tracing garbage-collection technique. It consists of two phases:

- Mark: starting from the program’s root references (such as static fields, active thread stacks, registers, JNI
  references), traverse object graphs and mark every reachable (live) object.
- Sweep: scan the heap and reclaim (free) all objects that were not marked as live during the mark phase.

Example: You have a graph: A -> B, A -> C, B -> D, C -> (null), D -> (null). There is an object E that is not reachable
from any
root.

- Mark phase: Start from roots and mark A, then B and C from A, then D from B. E is never marked.
- Sweep phase: Reclaim E’s memory. If you do compaction, move A, B, C, D to be contiguous and update any interior
  references if they were relocated.
  Result: Only A, B, C, D remain reachable; E is freed.

## How do we call a Garbage Collector ?

We can call a garbage collector by using System.gc() or Runtime.getRuntime().gc() method.

## What is a JIT Compiler ?

JIT stands for Just In Time compiler. It is used to improve the performance of java applications
by compiling the byte code into the machine code at run time.

## What happens if String args[] is not written in main() method ?

The code will compile but JVM cannot run the code because it cannot recognize the main() as the method from where it
should start execution of the Java program.

## What is a transient variable ?

A variable which is declared as transient is not serialized. When an object is serialized, all its
members are serialized except the transient members.

## Why do threads block on I/O operations ?

When a thread makes an I/O request, it is put into the waiting state by the thread scheduler until
the I/O operation is completed. This is because I/O operations are generally slow and blocking the
thread allows other threads to execute while waiting for the I/O operation to complete.

## How are Observer and Observable used ?

The Observable class represents an object that can be observed by other objects. The Observer
interface represents an object that can observe changes in an Observable object. When an
Observable object changes, it notifies all its registered Observer objects by calling their update()
method.

## Can a lock be acquired on a class?

Yes, a lock can be acquired on a class using the synchronized keyword. When a method is declared
as synchronized, the lock is acquired on the class object for static methods and on the instance
object for non-static methods.

## What is meant by Encapsulation ?

Encapsulation is one of the four fundamental OOP concepts. It is the mechanism of wrapping the
data (variables) and code acting on the data (methods) together as a single unit. In encapsulation, the variables of a
class will be
hidden from other classes, and can be accessed only through the methods of their current class. Therefore, it is also
known as data hiding.

## What is the difference between an object and object reference?

An object is an instance of a class that contains state (attributes) and behavior (methods). An
object reference is a variable that holds the memory address of an object. When we create an
object, we use the new keyword, which allocates memory for the object and returns a reference
to that memory location.

## What is the difference between String, StringBuffer and StringBuilder?

- String: Immutable, thread-safe, slower for concatenation.
- StringBuffer: Mutable, thread-safe, slower than StringBuilder.
- StringBuilder: Mutable, not thread-safe, faster for concatenation.

## Can char be manipulated like integers?

Yes, char can be manipulated like integers. In Java, char is a 16-bit Unicode character, and it can
be treated as an integer value. We can perform arithmetic operations on char values, such as
addition, subtraction, increment, and decrement. For example, we can add an integer value to a char
value to get the next character in the Unicode sequence.

## Can a main method be overloaded?

Yes, a main method can be overloaded in Java. We can define multiple main methods with
different parameter lists in the same class. However, the JVM will only call the main method with
the signature public static void main(String[] args) when we run the program.

## What is the sequence of constructor invocation ?

When an object is created, the constructor of the superclass is invoked first, followed by the
constructor of the subclass. This is because the subclass inherits the properties and behavior of the
superclass, and the superclass constructor initializes the inherited properties.

## What is the difference between an Abstract class and an Interface?

- Abstract class: Can have both abstract and concrete methods, can have instance variables, supports single inheritance.
- Interface: Can only have abstract methods (until Java 8, now can have default and static methods), cannot have
  instance variables, supports multiple inheritance.

## What is the difference between a checked and an unchecked exception?

- Checked Exception: Checked at compile-time, must be declared in the method signature or handled using try-catch
  block (e.g., IOException, SQLException).
- Unchecked Exception: Not checked at compile-time, do not need to be declared or handled (e.g., NullPointerException,
  ArrayIndexOutOfBoundsException).
- Errors: Serious problems that are not meant to be caught (e.g., OutOfMemoryError, StackOverflowError).
- Runtime Exceptions: A subset of unchecked exceptions that occur during the program's execution (e.g.,
  ArithmeticException, ClassCastException).
- Logical Errors: Errors in the program's logic that lead to incorrect results (e.g., incorrect algorithm
  implementation).
- Syntax Errors: Errors in the code that prevent it from compiling (e.g., missing semicolon, unmatched parentheses).
- Semantic Errors: Errors where the code compiles but does not behave as intended (e.g., using the wrong variable in a
  calculation).
- Resource Errors: Errors related to resource management, such as file not found or network issues (e.g.,
  FileNotFoundException, SocketException).
- Configuration Errors: Errors due to incorrect configuration settings (e.g., invalid database connection string).
- Security Errors: Errors related to security violations (e.g., AccessControlException).
- I/O Errors: Errors that occur during input/output operations (e.g., EOFException, IOException).
- Data Errors: Errors related to data processing (e.g., NumberFormatException).
- Concurrency Errors: Errors that occur in multi-threaded environments

## What is the impact of declaring a method as final?

Declaring a method as final means that the method cannot be overridden by subclasses. This is useful when we want to
ensure that the behavior of a method remains consistent across all subclasses. Additionally, final methods can be
optimized by the compiler for better performance, as it knows that the method will not be changed.

## Can a abstract class be defined without any abstract methods?

Yes, an abstract class can be defined without any abstract methods. An abstract class is a class that cannot be
instantiated on its own and is meant to be subclassed. It can contain both abstract methods (methods without a body) and
concrete methods (methods with a body). However, it is not mandatory for an abstract class to have abstract methods; it
can have only concrete methods as well. The primary purpose of an abstract class is to provide a common base for
subclasses and to enforce a certain structure or behavior.

## Can a class be marked as native?

No, a class cannot be marked as native in Java. The native keyword is used to indicate that a method is implemented in
a language other than Java, typically in C or C++. Native methods are declared using the native keyword in the method
signature, but the class itself cannot be marked as native. The purpose of native methods is to allow Java code to
interact with platform-specific features or libraries that are not directly accessible through Java.

## Can a class be defined inside an Interface?

Yes, a class can be defined inside an interface in Java. This is known as a nested class or inner class. A nested class
can be either static or non-static. When a class is defined inside an interface, it is implicitly public and static.
This means that the nested class can be accessed without creating an instance of the interface. Nested classes inside
interfaces are often used to group related classes together and to provide a way to organize code more effectively.

## What are the modifiers in Java ?

Modifiers in Java are keywords that are used to define the properties and behavior of classes, methods, and variables.
They can be categorized into three main types: access modifiers, non-access modifiers, and class modifiers.

1. Access Modifiers: These modifiers define the visibility and accessibility of classes, methods, and variables. The
   four access modifiers in Java are:
    - public: The member is accessible from any other class.
    - protected: The member is accessible within the same package and by subclasses.
    - default (no modifier): The member is accessible only within the same package.
    - private: The member is accessible only within the same class.
2. Non-Access Modifiers: These modifiers provide additional information about the behavior of classes, methods, and
   variables. Some common non-access modifiers in Java are:
    - static: Indicates that the member belongs to the class rather than an instance of the class.
    - final: Indicates that the member cannot be changed or overridden.
    - abstract: Indicates that the class or method is abstract and must be implemented by subclasses.
    - synchronized: Indicates that the method can be accessed by only one thread at a time.
    - volatile: Indicates that the variable can be changed by different threads and ensures visibility of changes across
      threads.
3. Class Modifiers: These modifiers are used to define the properties of classes. Some common class modifiers in Java
   are:
    - class: Used to define a class.
    - interface: Used to define an interface.
    - enum: Used to define an enumeration.
    - record: Used to define a record class (introduced in Java 14).
    - strictfp: Used to restrict floating-point calculations to ensure portability across different platforms.
      These modifiers help in controlling the access, behavior, and properties of classes, methods, and variables in
      Java, allowing developers to create well-structured and maintainable code.
    - native: Indicates that the method is implemented in a language other than Java (e.g., C or C++).
    - transient: Indicates that the variable should not be serialized.
    - volatile: Indicates that the variable can be changed by different threads and ensures visibility of changes across
      threads.
    - synchronized: Indicates that the method can be accessed by only one thread at a time.
    - strictfp: Used to restrict floating-point calculations to ensure portability across different platforms.
    - default: Used in interfaces to provide a default implementation for a method.
    - sealed: Used to restrict which classes can extend or implement a class or interface (introduced in Java 15).
    - non-sealed: Used to allow a class to be extended by any class (introduced in Java 15).
    - record: Used to define a record class (introduced in Java 14).
    - module: Used to define a module (introduced in Java 9).

## What is difference between shallow copy and deep copy ?

- Shallow Copy: A shallow copy of an object is a new object that is a copy of the original object, but it only copies
  the references to the objects that are referenced by the original object. This means that if the original object
  contains references to other objects, both the original and the copied object will refer to the same objects in
  memory. Therefore, changes made to the referenced objects in either the original or copied object will be reflected in
  both.
- Deep Copy: A deep copy of an object is a new object that is a copy of the original object, along with copies of all
  the objects that are referenced by the original object. This means that if the original object contains references to
  other objects, the deep copy will create new instances of those objects as well. Therefore, changes made to the
  referenced objects in either the original or copied object will not affect the other, as they are completely
  independent.

## What is serialization?

Serialization is the process of converting an object into a byte stream, which can then be easily stored in a file or
transmitted over a network. The byte stream can later be deserialized back into the original object. Serialization is
commonly used for saving the state of an object, sending objects over a network, or persisting objects to a database.

## What is the difference between throw and throws?

- throw: The throw keyword is used to explicitly throw an exception from a method or a block of code. It is followed by
  an instance of the Throwable class or its subclasses. The throw statement is used to indicate that an exception has
  occurred and needs to be handled.
- throws: The throws keyword is used in the method signature to declare that a method may throw one or more exceptions.
  It is followed by a list of exception types that the method can throw. The throws clause is used to inform the caller
  of the method about the potential exceptions that may be thrown, allowing them to handle those exceptions
  appropriately.

## What is the importance of finally block in exception handling?

The finally block is important in exception handling because it is used to execute a block of code regardless of whether
an exception is thrown or not. It is typically used for cleanup activities, such as closing resources (e.g., file
streams, database connections) that need to be released after the try-catch block has executed. The code in the finally
block will always run, even if an exception is thrown and caught in the catch block, or if a return statement is
encountered in the try or catch blocks. This ensures that necessary cleanup actions are performed, preventing resource
leaks and maintaining the integrity of the program.

## What is the purpose of finalization?

Finalization is a mechanism in Java that allows an object to perform cleanup actions before it is garbage collected. The
purpose of finalization is to provide a way for an object to release resources, such as file handles or network
connections, that it may be holding onto before it is removed from memory. This is done by overriding the finalize()
method in the object's class. When the garbage collector determines that there are no more references to an object, it
calls the finalize() method, allowing the object to perform any necessary cleanup actions before it is destroyed.
However, it is important to note that finalization is not guaranteed to be called immediately after an object becomes
unreachable, and it is generally recommended to use other resource management techniques, such as try-with-resources or
explicit resource release methods, instead of relying solely on finalization.

## What are the two types of multitasking?

The two types of multitasking are:

1. Process-based Multitasking: In process-based multitasking, multiple processes are executed concurrently by the
   operating system. Each process has its own memory space and resources, and the operating system manages the
   scheduling of these processes. This type of multitasking is commonly used in modern operating systems, where multiple
   applications can run simultaneously.
2. Thread-based Multitasking: In thread-based multitasking, multiple threads within a single process are executed
   concurrently. Threads share the same memory space and resources of the parent process, allowing for more efficient
   communication and data sharing between threads. This type of multitasking is commonly used in applications that
   require parallel processing or concurrent execution of tasks, such as web servers or GUI applications.

## What will notify() method do?

The notify() method is used in Java's multithreading to wake up a single thread that is waiting on the object's monitor
(i.e., a thread that has called the wait() method on the same object). When notify() is called, one of the waiting
threads is selected (the selection is arbitrary) and moved from the waiting state to the runnable state,
allowing it to compete for CPU time. If no threads are waiting, the notify() call has no effect. It is important to
note that notify() must be called from within a synchronized block or method, as it requires ownership of the object's
monitor.

## What is the difference between sleep() and yield()?

- sleep(): The sleep() method is used to pause the execution of the current thread for a specified amount of time. When
  a thread calls sleep(), it enters the timed waiting state and does not consume any CPU time during this period. After
  the specified time has elapsed, the thread becomes runnable again and can compete for CPU time. The sleep() method can
  throw an InterruptedException if another thread interrupts the sleeping thread.
- yield(): The yield() method is used to suggest to the thread scheduler that the current thread is willing to yield its
  current use of the CPU. When a thread calls yield(), it moves from the running state to the runnable state, allowing
  other threads of the same priority to execute. However, there is no guarantee that the yielding thread will be
  immediately rescheduled, as it depends on the thread scheduler's implementation. The yield() method does not throw any
  exceptions.
- In summary, sleep() pauses the thread for a specific duration, while yield() suggests that the thread is willing to
  give up its current CPU time to allow other threads to execute.

## What is a Daemon Thread?

A daemon thread is a special type of thread in Java that runs in the background and provides services to other threads.
Daemon threads are typically used for tasks such as garbage collection, background monitoring, or other low-priority
tasks that do not require user interaction. The key characteristics of daemon threads are:

- Daemon threads are created by calling the setDaemon(true) method on a Thread object before starting the thread.
- Daemon threads do not prevent the JVM from exiting. When all non-daemon threads have completed their execution, the
  JVM will terminate, and any remaining daemon threads will be stopped.
- Daemon threads have lower priority than non-daemon threads, and they may not get CPU time if there are many non-daemon
  threads running.
- Daemon threads should not be used for tasks that require user interaction or that need to complete before the program
  exits, as they may be terminated abruptly when the JVM shuts down.

## What is synchronization and why is it important?

Synchronization is a mechanism in Java that is used to control access to shared resources by multiple threads. It
ensures that only one thread can access a shared resource at a time, preventing data inconsistency

## What are the two ways that a code can be synchronised? Can you declare a static method as synchronized?

There are two ways to synchronize code in Java:

1. Synchronized Methods: A method can be declared as synchronized by using the synchronized keyword in its declaration.
   When a synchronized method is called, the thread that calls the method acquires the lock on the object (instance) for
   non-static methods or on the class (Class object) for static methods. This prevents other threads from accessing any
   synchronized methods of the same object or class until the lock is released.
2. Synchronized Blocks: A synchronized block is a block of code that is synchronized on a specific object. This allows
   for more fine-grained control over synchronization, as only the code within the synchronized block is protected by
   the lock. The synchronized block is defined using the synchronized keyword followed by the object to synchronize on.
3. Yes, a static method can be declared as synchronized. When a static synchronized method is called, the thread that
   calls the method acquires the lock on the Class object associated with the class, preventing other threads from
   accessing any static synchronized methods of the same class until the lock is released.

## What is a deadlock ?

A deadlock is a situation in multithreading where two or more threads are blocked forever, waiting for each other to
release resources. In a deadlock, each thread holds a resource and waits for another resource that is held by another
thread. Since none of the threads can proceed, they remain in a blocked state indefinitely, resulting in a standstill.
For example, consider two threads, Thread A and Thread B. Thread A holds Resource 1 and waits for Resource 2, while
Thread B holds Resource 2 and waits for Resource 1. Neither thread can proceed, leading to a deadlock.

## Explain Iterator Interface.

The Iterator interface in Java is part of the Java Collections Framework and provides a way to traverse and access
elements in a collection (such as a List, Set, or Map) without exposing the underlying structure of the collection. The
Iterator interface defines three main methods:

## What is the difference between ArrayList, LinkedList and Vector?

* The ArrayList Class uses array for storage. An array storage are generally faster but we cannot insert and delete
  entries in middle of the list. To achieve this kind of addition and deletion requires a new array constructed. You can
  access any element at randomly.
* The LinkedList Class uses linked list for storage. A linked list allow s elements to be added, removed from the
  collection at any location in the container by ordering the elements. With this implementation you can only access the
  elements in sequentially.
* Vector and ArrayList are very similar. Both of them represent a growable array. The main difference is that Vector is
  synchronized(thread safe) while ArrayList is not. A Vector defaults to doubling the size of its array, while the
  ArrayList increases its array size by 50 percent.

## Explain the functionality of Vector Class.

The Vector class in Java is a part of the Java Collections Framework and represents a dynamic array that can grow or
shrink in size as needed. It is similar to the ArrayList class but has some key differences.
The Vector class is synchronized, meaning that it is thread-safe and can be used in multi-threaded environments without
additional synchronization. This makes it suitable for scenarios where multiple threads may access and modify the vector
concurrently.

## What is the difference between HashMap and TreeMap ?

- HashMap: HashMap is an implementation of the Map interface that uses a hash table for storage. It allows null keys and
  values, and it does not maintain any specific order of the elements. The time complexity for basic operations like
  get() and put() is O(1) on average, making it very efficient for lookups.
- TreeMap: TreeMap is an implementation of the Map interface that uses a red-black tree for storage. It does not allow
  null keys (but allows null values) and maintains the elements in a sorted order based on the natural ordering of the
  keys or a specified comparator. The time complexity for basic operations like get() and put() is O(log n), which is
  slower than HashMap for lookups but provides the benefit of sorted order.

## Which is faster, synchronizing a HashMap or using a Hashtable for thread-safe access ?

Using a Hashtable is generally faster for thread-safe access compared to synchronizing a HashMap. This is because
Hashtable
is inherently synchronized, meaning that all its methods are synchronized, providing built-in thread safety.
On the other hand, when synchronizing a HashMap, you need to use external synchronization (e.g., using synchronized
blocks
or methods), which can introduce additional overhead and complexity. However, it's important to note that Hashtable is
considered legacy and is not recommended for new code; instead, you can use ConcurrentHashMap for better performance and
scalability in multi-threaded environments.

## Explain Garbage Collection in Java.

Garbage Collection in Java is the process by which the Java Virtual Machine (JVM) automatically
reclaims memory that is no longer in use by the program. When an object is created in Java, it is
allocated memory on the heap. If there are no references to that object, it becomes eligible for
garbage collection. The garbage collector periodically runs in the background and identifies objects
that are no longer reachable from the root references (such as static fields, active thread stacks,
and JNI references). Once identified, the garbage collector frees up the memory occupied by these
unreachable objects, making it available for future object allocations. This helps in preventing
memory leaks and optimizing memory usage in Java applications. The garbage collection process is
automatic and does not require explicit intervention from the programmer, although developers can
suggest garbage collection by calling System.gc(), but it is not guaranteed to run immediately.

## When does the Garbage Collection happen ?

Garbage collection in Java happens automatically when the Java Virtual Machine (JVM) determines that there are objects
in memory that are no longer reachable or needed by the program. The exact timing of garbage collection is not
predictable, as it is managed by the JVM's garbage collector, which runs in the background. The garbage collector may be
triggered when:

- The JVM detects that the heap memory is running low and needs to free up space for new object allocations.
- The program explicitly calls System.gc() or Runtime.getRuntime().gc(), which suggests that the garbage collector
  should run, although it is not guaranteed to do so immediately.

## When is an Object eligible for Garbage Collection ?

An object in Java is eligible for garbage collection when there are no more references to it from any
active part of the program. This means that the object is no longer reachable through any variable,
data structure, or method call. The following scenarios can make an object eligible for garbage
collection:

1. The object is explicitly set to null, removing all references to it.
2. The object goes out of scope, meaning that the variable referencing it is no longer accessible.
3. The object is part of a data structure (like a list or map) that is cleared or modified to remove the reference to
   the object.
4. The object is part of a circular reference, and all references to the objects in the cycle are removed.
   Once an object is determined to be unreachable, it becomes eligible for garbage collection, and the
   garbage collector can reclaim the memory occupied by that object during its next cycle.

## When the finalize() method is invoked ?

The finalize() method in Java is invoked by the garbage collector when it determines that there are no
more references to an object, and the object is about to be garbage collected. The finalize() method is called only once
for each object, and it provides an opportunity for the object to perform any
necessary cleanup actions before it is removed from memory. This can include releasing resources such
as file handles, network connections, or other system resources that the object may be holding onto. However, it is
important to note that the finalize() method is not guaranteed to be called immediately after
an object becomes unreachable, and it may not be called at all if the program terminates before
the garbage collector runs. Therefore, it is generally recommended to use other resource management
techniques, such as try-with-resources or explicit resource release methods, instead of relying solely on finalize() for
cleanup.





