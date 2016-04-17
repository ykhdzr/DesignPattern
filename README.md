# DesignPattern
Design patterns learning result

# Design Patterns grouped into 3 based on its characteristics, namely :
1. Structural (S)
2. Behavioral (B)
3. Creational (C)

![alt tag](https://github.com/yokoahadazaro/DesignPattern/blob/master/src/assets/images/Design%20Patterns.png)

# Pinned words :
1. Design Pattern doesn't go directly into your code, they first go into your BRAIN
2. Knowing A.P.I.E. doesn't make you a good OO designer
3. Code duplication is good sign to clean up
4. It's a TOOLS not RULES
5. A Pattern is a SOLUTION to a PROBLEM in a CONTEXT


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
4. Hollywood Principle, Don't call us, we call you

#3. Decorator Pattern (S)
Key Points :

1. Extension at runtime, rather than compile time
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

C. Abstract Factory (Through composition, creates family of product)

<img src="https://github.com/yokoahadazaro/DesignPattern/blob/master/src/assets/images/Screen%20Shot%202016-02-05%20at%207.53.57%20AM.png" width="500">


Key Points :

1. Encapsulating object creation, loosely coupling, decoupled creator from concrete classes
2. Creator + Factory + Product
3. Use static constant/enum to adhere type-safe
4. DI Principle, depend upon abstractions, do not depend upon concrete classes
5. Used when there is a class that likely to change

#5. Singleton Pattern (C)
Variants :

A. Lazy (non multithread)
```java
public class Singleton {

  private static Singleton instance;

  private Singleton() {
    // The private constructor, ensures no one outside can directly create instance of this class
  }

  public static Singleton getInstance() {
    // Here a single check not synchronized
    if (instance == null) {
      instance = new Singleton();
    }

    return instance;
  }
}
```

B. Lazy (Multithread/Thread-safe with Large scope Synchronization block)
```java
public class Singleton {

  private static Singleton instance;

  private Singleton() {
    // The private constructor, ensures no one outside can directly create instance of this class
  }

  public static synchronized Singleton getInstance() {
    // Here a single check but in a synchronized getInstance method
    if (instance == null) {
      instance = new Singleton();
    }

    return instance;
  }
}
```
C. Eager
```java
public class Singleton {

  // Builds the instance variable once loaded the Singleton class
  private static Singleton instance = new Singleton();

  private Singleton() {
    // The private constructor, ensures no one outside can directly create instance of this class
  }

  public static Singleton getInstance() {
    // Returns the already build with an eager approach instance variable
    return instance;

  }

}
```

D. Double-checked locking(Multithread/Thread-safe with Small scope Synchronization block)
```java
public class Singleton {

  private volatile Singleton instance;

  private Singleton() {
    // The private constructor, ensures no one outside can directly create instance of this class
  }

  public static Singleton getInstance() {
    // First check 
    if (instance == null) {
      synchronized(Singleton.class) {
        // Second check inside a synchronized block
        if (instance == null) {
          instance = new Singleton();
        }
      }
    }

    return instance;
  }
}
```

E. Holder-class idiom(Multithread/Thread-safe without any Synchronization block)
```java
public class Singleton {

    private Singleton() {
        // The private constructor, ensures no one outside can directly create instance of this class
    }

    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }

    // Inner static class that holds a reference to the singleton
    private static class SingletonHolder {
        private static final Singleton instance = new Singleton();
    }
}
```

Key Points :

1. Ensures a class has only ONE instance, and provides a global point of access to it
2. Synchronized is method expensive, it can decrease performance by a factor of 100
3. In multithread environment it is better to synchronize the smallest portion of code possible
4. Prior to Java 1.2 Singleton would be collected and destroyed by GC, this was a confusing bugs because the next call to getInstance() produced a new Singleton again with new/reset values

#6. Command Pattern (B)
Key Points :

1. Program to an Interface(as general), not an Implementation
2. Favor Composition over Inheritance
3. Encapsulate method invocation
4. Encapsulate a request by binding together a set of ACTIONS on a specific RECEIVER
5. Decouple requester of an action from object that ACTUALLY perform the action
6. COMMAND + INVOKER + RECEIVER

#7. Adapter Pattern (S)
Key Points :

1. Convert interfaces to another
2. Wrapped objects to make their interfaces look like something THEY ARE NOT
2. TARGET + ADAPTER + ADAPTEE
3. Wrapping 1ONE ADAPTEE
4. Can do 2TWO-WAY Adapter, just implement old interface and new interface coincide
5. Class adapter, use subclass to adapting Adaptee
6. Object adapter, use object composition to adapting Adaptee
7. Real world case, adapting ENUMERATION-TO-ITERATOR, in other words adapting `hashMoreElements()`,`nextElement()`-TO-`hashNext()`, `next()`, `remove`
```java

public class EnumerationToIterator implements Iterator {
	Enumeration enum;

	public EnumerationToIterator(Enumeration enum){
		this.enum = enum;
	}

	public boolean hasNext(){
		enum.hashMoreElements();
	}

	public boolean next(){
		enum.nextElement();
	}

	public void remove(){
		throw new UnsupportedOperationException();
	}
}
```

#8. Facade Pattern (S)
Key Points :

1. Make an interface simpler
2. Hides complexity of large interfaces communication
3. Wrapping 1ONE-to-more ADAPTEE
4. Encapsulate subsystem classes

#9. Template method Pattern (B)
Key Points :

1. Defines step of algorithm, allow subclasses handle one-or-more steps
2. First step is to generalize the algorithm step
3. Keeping the step of algorithm in one place
4. Hook method used when part of algorithm is optional
5. Adhere Hollywood Principle, subclasses never called the abstract class method directly without being CALLED first
6. Somehow often consider as the same as Strategy, but NOT really, Strategy *define family of algorithm and make them interchangeable through object composition*, while Template method *define the outline of alghoritm*

#10. Iterator Pattern (B)
Key Points :

1. Relies on an interface called Iterator
2. Simplifies aggregate interface and implementation
3. External Iterator, clients control iteration
4. Internal Iterator, iteration controlled by Iterator itself

<img src="https://github.com/yokoahadazaro/DesignPattern/blob/master/src/assets/images/Iterator.png" width="500">

#11. Composite Pattern (S)
Key Points :

1. Treat collections of objects uniformly
2. COMPONENT + COMPOSITE + LEAF
3. Build structures of objects contains composite objects and leaf objects
4. Ignore the differences between composite objects and leaf objects
5. Implementing Null Iterator (Null Object Pattern) to leaf objects

<img src="https://github.com/yokoahadazaro/DesignPattern/blob/master/src/assets/images/Composite.png" width="500">

<img src="https://github.com/yokoahadazaro/DesignPattern/blob/master/src/assets/images/composite2.png" width="500">

#12. State Pattern (B)
Key Points :

1. Encapsulate state-based behaviour and delegate behaviour to current state
2. Context + State + ConcreteState
3. State Diagram = State + State Transition
4. Localize behaviour, encapsulate what varies, favor composition
5. Strategy -> Change behaviour by composing with different object
6. State -> Change state object in Context to change its behaviour

#13. Proxy Pattern (S)
Key Points :

1. Control and Manage access to real object
2. Provides a surrogate or placeholder for another object to control access to it
3. Remote Proxy -> acts as a local representative for an object that live in different JVM
4. Virtual Proxy -> acts as a representative for an object that maybe expensive to create/defers until it needed

#14. Compound Pattern
Key Points :

1. Combines two or more patterns as a solution to solve recurring/general problem
2. MVP/MVVM/MVC is a compound pattern in the real world

Source : Book of Head First Design Patterns - O'Reilly
