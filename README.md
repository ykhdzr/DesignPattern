# DesignPattern
Design patterns learning result

# Design Patterns grouped into 3 based on its characteristics, namely :
1. Structural (S)
2. Behavioral (B)
3. Creational (C)

![alt tag](https://github.com/yokoahadazaro/DesignPattern/blob/master/src/assets/images/Design%20Patterns.png)

# Wise words :
1. Design Pattern doesn't go directly into your code, they first go into your BRAIN
2. Knowing A.P.I.E. doesn't make you a good OO designer


#1. Strategy Pattern (B)
Key Points :

1. Take what varies and separate them from what stays the same
2. Program to an Interface(as general), not an Implementation
3. Favor Composition over Inheritance

#2. Observer Pattern (B)
Key Points :

1. Publisher + Subscriber/Observer
2. One-To-Many relationship, ONE Publisher MANY Subscriber/Observer
3. Loosely coupling, Publisher don't care about concrete Subscriber/Observer, it will always notify any object that implements Subscriber/Observer interface
4. Holywood Principle, Don't call us, we call you

#3. Decorator Pattern (S)
Key Points :

1. Extention at runtime, rather than compile time
2. O/C Principle, Class should be open for extension, but closed for modification
3. Object Wrapper
4. Using Inheritance to match Type, not to get Behaviour
5. Don't rely on concrete component's type
6. Component + Decorator

#4. Factory Pattern (C)
Variants :

A. Simple Factory (commonly used static factory method, advantage is no need create object to access, disadvantage are can't subclass and change behavior) 

<img src="https://github.com/yokoahadazaro/DesignPattern/blob/master/src/assets/images/Screen%20Shot%202016-02-05%20at%207.53.30%20AM.png" width="250">

B. Factory (Through inheritance)

<img src="https://github.com/yokoahadazaro/DesignPattern/blob/master/src/assets/images/Screen%20Shot%202016-02-05%20at%207.53.48%20AM.png" width="500">

C. Abstract Factory (Through composition, Allows variety of Factories)

<img src="https://github.com/yokoahadazaro/DesignPattern/blob/master/src/assets/images/Screen%20Shot%202016-02-05%20at%207.53.57%20AM.png" width="500">


Key Points :

1. Encapsulating object creation, loosely coupling, decoupled creator from concrete classes
2. Creator + Product
3. Use static constant/enum to adhere type-safe
4. DI Principle, depend upon abstractions, do not depend upon concrete classes
5. Used when there is a class that likely to change








Source : Book of Head First Design Patterns - O'Reilly
