# Process

- A process has a self-contained execution environment. A process generally has a complete, private set of basic
  run-time resources.
- Processes are often seen as synonymous with programs or applications.

<br>

# Threads

- Sometimes called lightweight processes. Both processes and threads provide an execution environment.
- Creating new thread requires fewer resources than creating a new process
- Threads exist within a process --> every process has at least one
- Threads share process's resources, including memory and open files.
- Multithreaded execution is an essential feature of the Java Platform.

<br> 

Java provides two ways to create a thread programmatically
1. Implementing the java.lang.Runnable interface
2. Extending the java.lang.Thread class