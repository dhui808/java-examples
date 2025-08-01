```
LogExecutionTime defines an annotation
LogExecutionAspect is annotated with @Aspect
Annotate methods with @LogExecutionTime
DemoApplication is annotated with @EnableAspectJAutoProxy
Spring AOP intercepts those methods with @LogExecutionTime annotation

@EnableAspectJAutoProxy is a Spring annotation that enables support for handling components marked with AspectJ's @Aspect annotation — it tells Spring to create proxies for beans where aspects (like logging, transactions, etc.) should be applied.
```