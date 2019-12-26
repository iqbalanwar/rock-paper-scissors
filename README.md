---
title: OOP Review
type: Homework
duration: "1:00"
creator:
    name: Charlie Drews
---

# ![](https://ga-dash.s3.amazonaws.com/production/assets/logo-9f88ae6c9c3871690e33280fcf557f33.png) OOP Review

## Requirements

Respond to the following questions based on what we've learned (and maybe what we haven't covered yet).

---

## Questions

1. What's the difference between **member variables** (also called **instance variables**) and **class variables** (with the `static` keyword)? Which can be accessed without creating an instance of the class?

Member variables, or instance variables, can take different values with different instantiations of an object. For example, two instances of an object, with a barcode instance variable, can have different barcodes. In constrast, class variables (denoted by 'static') are fixed in memory, and are a constant value between all instances of an object.

Class variables can be accessed without creating an instance of the class, since the class variable is directly attached to the object.

2. Does it make sense to write **getter** and **setter** methods for a `public` member variable? What about `private` variables?

It does not make sense to write getter and setter methods for a public member variable, because it is accessible by other classes/methods. Private member variables require getter and setter methods because they are not accessible and modifiable otherwise.

3. What are some benefits of making member variables `private`?

The main reason for making a member variable private is for encapsulation. Since the member variable is hidden within the class (not accessible by other classes), it allows the data to be consistent (not given values outside the restricted member value requirements).

4. If Class A extends Class B, which is the superclass and which is the subclass? Which would you call the parent, and which would you call the child?

The parent class (superclass) is Class B, because Class A extends (the code from) Class B. Therefore, the child class (subclass) is Class A.

5. What does it mean for a class to **inherit** methods or variables (or both) from its parent class?

To inherit methods or variables from a parent class means that a child class can use the given methods and variables for itself, even if the child class doesn't have those explicitly written into it's own class.

6. Consider the following code, where the `Refrigerator` class extends the `Appliance` class, and `getTemperature()` is a method in `Refrigerator`, but **not** in `Appliance`:

    ```
    Appliance myAppliance = new Refrigerator();
    double temperature = myAppliance.getTemperature();
    ```

   Why will this call to `getTemperature()` cause an error? How will **casting** help solve this issue?
   
A parent class does not inherit methods from it's child class, which means it cannot use methods of a child class unless defining it separately within it's own scope. This is a probable cause for the error when `getTemperature` is called. Casting can help solve this issue by telling the compiler that the instance of the object is actually of the child class (the class that holds that method).

7. In a normal class (also called a **concrete** class), do you need to **implement** all the methods, or can you simply **declare** some? What about in an `abstract` class?

All methods in a concrete class must be implemented. An abstract class can have some methods implemented; but the abstract methods within an abstract class can only be declared.

8. What about an `interface`? Can you implement any methods in an `interface`? Can you declare methods in an `interface`?

You cannot implement any methods in an `interface`, and it can only declare methods (since all the methods are abstract).

9. Can you create an instance of an `abstract` class? Also, look up the Java keyword `final` and see if you can explain why a class **cannot** be both `abstract` and `final`.

You cannot create an instance of an `abstract` class. The Java keyword `final` means that a class cannot be inherited by other classes. By definition, an abstract class is meant to be inherited from, so putting final on an abstract class defeats this purpose.

10. What happens when a method **overrides** another method? If parent and child classes have methods with the same name, when you call that method on an instance of the child class, which implementation of the method will be executed?

When a method overrides another method, it changes the body of the parent method to fit the child's own class. So if a method has the same name between parent and child class, and an instance of the child class calls that method, then the implementation of the method within the child class will be executed.

11. What's the relationship between `List`, `LinkedList`, and `ArrayList`? Why do we call a method **polymorphic** if it takes an input of type `List` rather than an input of type `LinkedList` or `Arraylist`? Why is that useful?

`List` is an interface that allows for elements to be inserted dynamically, so it doesn't need to have a preset size (in constrast to an array). `LinkedList` and `ArrayList` both implement the `List` interface. For `LinkedList`, elements are not aligned next to each other in memory. One index points to the memory address of another index, connecting them in memory as such. `ArrayList`, however, is aligned in memory. Therefore, when increasing in size, an `Arraylist` deletes the entire data structure, and recreates it with the extra element(s) to retain that alignment in memory. As a result, `LinkedList` is faster that an `ArrayList`.

A method is polymorphic if it takes an input of type `List` because that method is taken from `List`, and can be used by data structures associated with `List`, like `LinkedList` or `ArrayList`.

### Deliverable

This file, with your answers added.

---

## Additional Resources

Refer to the "Classes and Objects" lesson, the "Subclasses" lesson, and the "Abstract Classes and Interfaces" lesson.

Feel free to do a Google search for these concepts as well. There are plenty of Java tutorial websites and Stack Overflow posts that can help you. But be sure to write up your answers in your own words — copying and pasting some text does **not** help you actually learn (and is, in fact, cheating).
