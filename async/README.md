### Spring Asynchronous Processing Support
```
@EnableAsync annotation is used to enable Spring's asynchronous method execution capability.
  Typically placed on a @Configuration class or on the main application class (e.g., a @SpringBootApplication class).
  Signaling to Spring that it should scan for and process methods annotated with @Async.
  When a method is marked with @Async, Spring will execute that method in a separate thread from a thread pool,
  allowing the calling thread to continue its execution without waiting for the asynchronous method to complete.
@Async
  Methods intended for asynchronous execution are annotated with @Async.
Thread Pool Management
  Spring, by default, will look for a TaskExecutor or Executor bean named "taskExecutor" to manage the threads for
  asynchronous calls. If none is found, it falls back to a SimpleAsyncTaskExecutor. You can customize the thread pool
  by implementing AsyncConfigurer and providing your own Executor through the getAsyncExecutor() method.
Proxying
  Spring uses AOP and proxying to intercept calls to @Async methods and execute them in a separate thread.
```
