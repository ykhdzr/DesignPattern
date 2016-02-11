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

C. Double-checked locking(Multithread/Thread-safe with Small scope Synchronization block)
```java
ublic class Singleton {

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

D. Holder-class idiom(Multithread/Thread-safe without any Synchronization block)
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







Source : Book of Head First Design Patterns - O'Reilly
