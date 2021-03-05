# Java-Spring-Boot-Solid-Principles
Implementation of solid principles in Spring framework

## UMG Student Data
Erick Eduardo Mejía Gálvez 
1290-17-4662

## Principles 
Basically, the SOLID principles help software developers achieve scalability and prevent their code from breaking every time they are faced with a change. Let's look at each principle individually to understand why SOLID can help developers develop quality software. 

   - Single Responsibility Principle
   - Open/Closed Principle
   - Liskov Substitution Principle
   - Interface Segregation Principle
   - Dependency Inversion Principle

# Branches Description

### Single Responsibility Principle Violation
It includes the problem of the data of a book, in which a method is implemented as part of the attributes of the book to be able to print the data of the book in console.

### Single Responsibility Principle Solution
It includes the solution to the book problem by implementing an interface to be able to print the data on the console.

### Open Closed Principle Violation
It includes the problem of choosing 5 courses from a university to know how many credits are needed to take them.

### Open Closed Principle Solution
It includes the solution to the problem of courses by implementing an interface to manage the number of courses.

### Liskov Substitution Violation
It includes the problem of vehicles that are capable of performing certain actions depending on the environment in which they are used.

### Liskov Substitution Solution
It includes the solution where the classes are added including the type of vehicle it is (land, air, etc.) and how it can be used.

### Interface Segregation Violation
It includes the problem of a soccer team that can only fulfill certain tasks within the team depending on the position on the field.

### Interface Segregation Solution
It includes the solution where interfaces that perform the actions that each player of the team can do on the field are implemented.

### Dependency Inversion Violation
It includes the problem where a driver can drive several vehicles that can only be driven in certain specific areas.

### Dependency Inversion Solution
It includes the solution to the problem of vehicles that can only be used in certain areas by implementing an interface that will allow them to be managed.
