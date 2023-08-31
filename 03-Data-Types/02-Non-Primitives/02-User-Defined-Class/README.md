# Java Class

In Java, a class is a blueprint for creating objects that encapsulate properties (fields) and behavior (methods) related to a specific concept or entity. It serves as a user-defined data type that can be instantiated to create objects.

## Declaration

The syntax for declaring a class in Java is as follows:

```java
[access modifier] class ClassName {
    // Fields (properties)
    // Constructors
    // Methods
}
```

- `access modifier`: Optional keyword that determines the visibility of the class (e.g., `public`, `private`, `protected`).
- `class`: Keyword used to declare a class.
- `ClassName`: The name of the class, following Java naming conventions.

## Fields (Properties)

Fields are variables declared within a class and represent the state or data associated with objects created from the class. They define the properties or characteristics that the class objects will possess.

## Constructors

Constructors are special methods that are used to initialize objects of a class. They have the same name as the class and are invoked using the `new` keyword when creating new instances of the class. Constructors can have parameters to accept initial values for the object's fields.

## Methods

Methods are functions defined within a class that define the behavior or actions that the class objects can perform. They encapsulate the operations that can be performed on the class's data. Methods can have parameters and return values.

## Usage Example

```java
public class Circle {
    // Fields
    private double radius;

    // Constructors
    public Circle(double radius) {
        this.radius = radius;
    }

    // Methods
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

// Creating an instance of the Circle class
Circle circle = new Circle(5.0);

// Accessing fields and invoking methods
double area = circle.calculateArea();
double perimeter = circle.calculatePerimeter();
System.out.println("Radius: " + circle.getRadius());
System.out.println("Area: " + area);
System.out.println("Perimeter: " + perimeter);
```

In the example above, we define a class named `Circle` that represents a circle object. It has a field `radius` to store the radius of the circle.

We provide a constructor that takes a `radius` parameter to initialize the `radius` field when creating a `Circle` object.

The class also has methods `calculateArea()` and `calculatePerimeter()` to calculate the area and perimeter of the circle, respectively.

We include `setRadius()` and `getRadius()` methods to modify and retrieve the value of the `radius` field.

To use the `Circle` class, we create an instance of the class named `circle` by invoking the constructor with a radius value of `5.0`.

We then access the fields and invoke the methods of the `circle` object to perform calculations and display the radius, area, and perimeter of the circle.

Classes in Java provide a powerful mechanism for organizing and encapsulating data and behavior. They enable the creation of reusable and modular code, promoting code readability and maintainability.
