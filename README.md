Types of Spring containers:
1. ApplicationContext
2. BeanFactory

Configuration contains bean definition

Bean definition:
- A bean definition includes configuration metadata that the container needs 
  to know to create and manage the bean

Bean configuration
- Bean definitions can be provided in various ways including XML 
  configuration files, annotations and Java based configurations
- Beans are configured using XML files, where each bean is defined within 
  <bean> tags with attributes specifying class, properties and dependencies
- Beans can be configured using annotations like @Component, @Service, 
  @Repository etc. which are scanned by Spring and managed as beans.

Lifecycle of Bean
1. Instantiation: Bean instance is created using the bean definition and the 
   constructor injection
2. Population of properties: Properties would be set on bean either using 
   setter or constructor or field injection
3. Initialization: 
4. Bean is marked ready for use.
5. After bean is used, it can be destroyed/ removed from Spring container 
   during application shutdown.