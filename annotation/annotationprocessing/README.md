```
Define the Annotation Interface.
    Create a Java interface for your custom annotation. This interface should be annotated with @Retention and @Target
    to specify its lifecycle and where it can be applied.

@Aspect, originating from AspectJ, marks a class as an aspect in AOP.
    an @Aspect class is often also annotated with @Component to be recognized and used by Spring as a managed bean.
    Key characteristics and functionality of @Aspect:
        Defines Cross-Cutting Concerns:
        An aspect encapsulates a cross-cutting concern, which is a functionality that applies across multiple
        parts of an application but isn't part of the core business logic (e.g., logging, security, transaction
        management, caching).

        Enables Spring AOP:
        When @AspectJ support is enabled (typically by including the spring-boot-starter-aop dependency), Spring
        automatically detects classes annotated with @Aspect and uses them to configure Spring AOP.

`       Contains Advice and Pointcuts:
        An @Aspect class typically contains:

            Pointcut declarations ("When and where?": Defines the set of join points):
            These define where the aspect's advice should be applied (e.g., specific method executions, methods
            within a certain package). They use expressions to select "join points" in the application.

            Advice declarations ("What to do?": Defines the action to be taken at those join points):
            These define the actions to be taken at the specified join points (e.g., @Before, @After, @Around,
            @AfterReturning, @AfterThrowing).
    
    In essence, @Aspect tells Spring, "This class contains AOP logic, and you should use it to intercept and
    modify the behavior of other parts of my application based on the defined pointcuts and advice."

@EnableAspectJAutoProxy is a Spring annotation that enables support for handling
components marked with AspectJ's @Aspect annotation — it tells Spring to create 
proxies for beans where aspects (like logging, transactions, etc.) should be applied.

LogExecutionTime defines an annotation
LogExecutionAspect is annotated with @Aspect
Annotate methods with @LogExecutionTime
DemoApplication is annotated with @EnableAspectJAutoProxy
Spring AOP intercepts those methods with @LogExecutionTime annotation
```
