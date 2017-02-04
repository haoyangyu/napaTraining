# napaTraining
This is for Java learning environment for learning.

Contents:
  1. Desgin pattern series
  2. Concurrency in Java
  
Design pattern series
Design patterns are primarily based on the following principles of OOP:
  1. Program to an interface not an implemention
  2. Favor object compostion over inheritance

Desing patterns in the book of Gang of Four can be divided into:
  1. Creation patterns
  2. Structural patterns
  3. Behavioral patterns

1. Creation patterns
1.1 Factory pattern
Factory class will be a factory center in charge of creating object, first we need to initilize an object of the factory class,
its method will based on clients' requirements to produce "product".

2. Structural patterns
2.1. Decorator pattern
This design pattern wraps the original class and provides additional functionality without checkign the original class function structure, which means keep the class methods signature intact

3. Behavioral patterns
3.1. Visitor pattern (Need to understand more)
Execution algo of element can vary as and when visitors vary. Visitor object handles the operation of the element object.
Separate an algorithm from an object structure on which it operates.
3.2. Observer pattern
Observers can register subject, which means subject can attach add observers.If the state of subject changes, all the observers registered the subject will be notified.

