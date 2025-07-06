Java Persistence API (JPA)
JPA is a Java specification (JSR 338) for persisting, reading, and managing data between Java objects and relational databases.

It provides a set of interfaces and annotations to standardize ORM in Java.

JPA is only a specification, so it does not include any implementation.

Popular implementations include Hibernate, EclipseLink, and OpenJPA.

Hibernate
Hibernate is a widely used ORM tool and the most popular implementation of JPA.

It allows developers to map Java objects to database tables and vice versa.

Hibernate extends the JPA specification with many advanced features like caching, lazy loading, custom SQL, etc.

Spring Data JPA
Spring Data JPA is not an implementation of JPA but a higher-level abstraction built on top of JPA (and typically Hibernate).

It reduces boilerplate code required to implement data access layers.

Provides powerful features like:

Automatic query generation from method names

Built-in pagination and sorting

Simplified transaction management using Spring’s @Transactional annotation

