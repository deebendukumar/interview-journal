# Concurrency & Multithreading Questions & Answers

## What is multitasking ?

Multitasking is the ability of an operating system to execute multiple tasks or processes simultaneously. It allows
multiple applications or processes to run concurrently, sharing system resources such as CPU time, memory, and I/O
devices. There are two types of multitasking:

1. **Preemptive Multitasking**: The operating system allocates CPU time to each task for a specific time slice, and if a
   task exceeds its time slice, it is interrupted and the CPU is allocated to another task.
2. **Cooperative Multitasking**: Each task voluntarily yields control of the CPU to allow other tasks to run. This
   requires tasks to be well-behaved and not hog the CPU. OS waits for the program to give back the control.

Multitasking programming is of two types

1. Process-based multitasking: In this type of multitasking, each task runs in its own separate process with its own
   memory space. This provides better isolation and security between tasks but can be more resource-intensive.
2. Thread-based multitasking: In this type of multitasking, multiple threads run within the same process and share the
   same memory space. This allows for more efficient use of resources but requires careful synchronization to avoid
   conflicts between threads.

## What is Multithreading and How it is Different from Multitasking?

Multithreading is a programming technique that allows multiple threads to run concurrently within a single process. A
thread is a lightweight unit of execution that shares the same memory space as other threads within the same process.
Multithreading is different from multitasking in that it allows multiple threads to run within the same process, while
multitasking involves running multiple processes simultaneously.
Multithreading is often used to improve the performance of applications that require concurrent execution of tasks, such
as web servers, database servers, and GUI applications. By using multiple threads, these applications can handle
multiple requests or user interactions simultaneously, improving responsiveness and throughput.

## What is a tread ?

A thread is a lightweight unit of execution within a process. It is a separate flow of control that can run concurrently
with other threads within the same process. Each thread has its own stack, program counter, and local variables, but
shares the same memory space as other threads within the same process.
Threads are used to perform tasks that can be executed independently, such as handling user input, performing
background processing, or performing I/O operations. By using multiple threads, applications can improve their
performance and responsiveness, as they can handle multiple tasks simultaneously.

## What is a main thread in Java?

In Java, the main thread is the initial thread that is created when a Java program starts executing. It is responsible
for executing the `main()` method of the program, which is the entry point for the application. The main thread is
created by the Java Virtual Machine (JVM) and runs in the same memory space as the rest of the program.
The main thread can create additional threads to perform tasks concurrently, and these threads can run independently of
the main thread. However, the main thread must complete its execution before the program can terminate.

## How to create a user-defined thread in Java?

In Java, you can create a user-defined thread by either extending the `Thread` class or implementing the `Runnable`
interface. Here are examples of both approaches:

1. **Extending the Thread class**:

```java
class MyThread extends Thread {
    public void run() {
        // Code to be executed in the thread
        System.out.println("Thread is running");
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start(); // Start the thread
    }
}
```

2. **Implementing the Runnable interface**:

```java
class MyRunnable implements Runnable {
    public void run() {
        // Code to be executed in the thread
        System.out.println("Thread is running");
    }
}

public class Main {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start(); // Start the thread
    }
}
```

In both examples, the `run()` method contains the code that will be executed in the thread. To start the thread, you
call the `start()` method,
which creates a new thread and invokes the `run()` method.

## What is the difference between `start()` and `run()` methods in Java Thread class?

The `start()` and `run()` methods in the Java Thread class serve different purposes:

1. **`start()` method**:
    - The `start()` method is used to start a new thread of execution. When you call the `start()` method on a Thread
      object, it creates a new thread and invokes the `run()` method in that new thread.
    - The `start()` method is responsible for allocating system resources for the new thread and scheduling it for
      execution by the JVM.
    - You should always call the `start()` method to initiate a new thread; calling the `run()` method directly will not
      create a new thread.
    - Example:
   ```java
   MyThread thread = new MyThread();
   thread.start(); // Starts a new thread and calls the run() method
   ```
2. **`run()` method**:
    - The `run()` method contains the code that will be executed when the thread is started. It is the entry point for
      the thread's execution.
    - If you call the `run()` method directly, it will execute the code in the current thread, not in a new thread.
    - You should not call the `run()` method directly if you want to create a new thread; instead, you should call the
      `start()` method.
    - Example:
   ```java
   MyThread thread = new MyThread();
   thread.run(); // Executes the run() method in the current thread, not a new thread
   ```

In summary, use the `start()` method to create and start a new thread, which will then call the `run()` method in that
new thread. Calling the `run()` method directly will not create a new thread and will execute the code in the current
thread instead.

## What is thread priority?

Thread priority is a mechanism in Java that allows you to set the relative importance of threads when the CPU is
scheduling their execution. Each thread in Java has a priority level, which is represented by an integer value ranging
from 1 to 10. The higher the priority value, the more important the thread is considered to be.

Priorities in threads is a concept where each thread is having a priority which in layman’s language one can say every
object is having priority here which is represented by numbers ranging from 1 to 10.

The default priority is set to 5 as excepted.

1. Minimum priority is set to 1.
2. Maximum priority is set to 10.

Here 3 constants are defined in it namely as follows:

1. public static int NORM_PRIORITY
2. public static int MIN_PRIORITY
3. public static int MAX_PRIORITY

## What is a deadlock and what is its role in multithreading?

A deadlock is a situation in multithreading where two or more threads are blocked forever, waiting for each other to
release resources. In a deadlock, each thread holds a resource and waits for another resource held by another thread,
creating a cycle of dependencies that prevents any of the threads from making progress.
For example, consider two threads, Thread A and Thread B. Thread A holds Resource 1 and waits for Resource 2, while
Thread B holds Resource 2 and waits for Resource 1. Neither thread can proceed because they are both waiting for the
other to release a resource, resulting in a deadlock.
example of deadlock in java

```java
class Resource {
    private final String name;

    public Resource(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Thread1 extends Thread {
    private final Resource resource1;
    private final Resource resource2;

    public Thread1(Resource resource1, Resource resource2) {
        this.resource1 = resource1;
        this.resource2 = resource2;
    }

    public void run() {
        synchronized (resource1) {
            System.out.println("Thread 1: Holding " + resource1.getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
            System.out.println("Thread 1: Waiting for " + resource2.getName());
            synchronized (resource2) {
                System.out.println("Thread 1: Acquired " + resource2.getName());
            }
        }
    }
}

class Thread2 extends Thread {
    private final Resource resource1;
    private final Resource resource2;

    public Thread2(Resource resource1, Resource resource2) {
        this.resource1 = resource1;
        this.resource2 = resource2;
    }

    public void run() {
        synchronized (resource2) {
            System.out.println("Thread 2: Holding " + resource2.getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
            System.out.println("Thread 2: Waiting for " + resource1.getName());
            synchronized (resource1) {
                System.out.println("Thread 2: Acquired " + resource1.getName());
            }
        }
    }
}

public class DeadlockExample {
    public static void main(String[] args) {
        Resource resource1 = new Resource("Resource 1");
        Resource resource2 = new Resource("Resource 2");
        Thread1 thread1 = new Thread1(resource1, resource2);
        Thread2 thread2 = new Thread2(resource1, resource2);
        thread1.start();
        thread2.start();
    }
}
```
