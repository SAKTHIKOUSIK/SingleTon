Breakdown of Code Sections
1. Regular Class Example (Demo)
java
public class Launch {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        Demo d3 = new Demo();

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}
This program creates three different Demo objects.
The printed object references (d1, d2, d3) are different, because each call to new Demo() creates a new instance.

2. Basic Singleton Implementation
java
class Singleton {
    private final static Singleton INSTANCE = new Singleton();
    private Singleton() {}
    static Singleton getInstance() {
        return INSTANCE;
    }
}
This is an eager initialization singleton.

The instance (INSTANCE) is created as soon as the class loads.

The constructor is private, preventing external object creation.

The getInstance() method always returns the same single instance.

In main(), multiple calls like:

java
Singleton d1 = Singleton.getInstance();
Singleton d2 = Singleton.getInstance();
Singleton d3 = Singleton.getInstance();
will all print the same memory reference, proving there’s only one instance.

3. Thread-Safe (Lazy Initialization) Singleton
java
class Singleton2 {
    private static Singleton2 INSTANCE;
    private Singleton2() {}
    synchronized static Singleton2 getInstance() {
        if (INSTANCE == null)
            INSTANCE = new Singleton2();
        return INSTANCE;
    }
}
Here, the object is created only when first requested, not when the class loads.
The synchronized keyword ensures thread safety, so only one thread can create the instance, even in a multithreaded environment.

4. Singleton Using Inner Class
java
class Singleton3 {
    private Singleton3() {}
    private static class Inner {
        private final static Singleton3 INSTANCE = new Singleton3();
    }
    static Singleton3 getInstance() {
        return Inner.INSTANCE;
    }
}
This approach is known as the Bill Pugh Singleton implementation.
It’s lazy-loaded (the instance is created when getInstance() is first called) and thread-safe by design, because Java class loading is synchronized internally.

🚀 Day 4 of Java Framework Learning – Introduction to Singleton Design Pattern

🌱 What is the Singleton Design Pattern?
Singleton Design Pattern ensures a class has only one instance throughout the application and provides a global point of access to it. It restricts instantiation so no other objects can be created, making it useful for managing shared resources.

💡 Benefits of Singleton (vs Regular Class Instantiation):
🔸 Single shared instance avoids resource wastage.
🔸 Provides a centralized access point for the shared resource.
🔸 Ensures consistency and state management across the app.
🔸 Helps maintain thread safety in concurrent environments.

⚙️ Where is Singleton Used?[singleton design pattern.pdf](https://github.com/user-attachments/files/23107508/singleton.design.pattern.pdf)

Commonly used for:
🔸 Configuration managers where only one config object should exist.
🔸 Logging systems to handle logs in a unified way.
🔸 Database connection pools to manage connections effectively.
🔸 Caching systems for consistent cache management.

📘 Today’s Practice Code (Singleton Pattern in Java):
Practiced a simple example demonstrating Singleton concept:
🔸 Created a Singleton class with private constructor and static getInstance() method.
🔸 Verified that multiple calls to getInstance() return the same object reference.
🔸 Compared with regular classes where new objects are created for each construction call.
🔸 Key Singleton implementations summarized:
 - Regular Class: Each new call creates a new, independent object.
 - Basic Singleton (Eager): Single instance created when class loads.
 - Thread-Safe Singleton (Lazy): Instance created when needed, with synchronized thread safety.
 - Inner Class Singleton (Bill Pugh): Uses static inner class for efficient, thread-safe lazy initialization.

👉 This clearly showed how Singleton restricts object creation ensuring single instance usage across the app.

🧩 Key Takeaways from Today’s Practice:
🔹 Singleton ensures only one instance of a class exists.
🔹 Useful for managing shared resources consistently.
🔹 Modern implementations also handle thread safety for concurrency.
🔹 Core principle for designing robust, resource-efficient applications.




