# Java Record

The `record` is a new feature introduced in Java 14 that provides a concise way to declare classes for encapsulating data. It combines the features of a class and immutable data objects, making it easy to define simple classes with a fixed set of properties.

## Syntax

The syntax for declaring a record in Java is as follows:

```java
public record RecordName(properties) {
    // Optional body
}
```

- `public`: Optional access modifier that specifies the visibility of the record.
- `record`: Keyword used to declare a record.
- `RecordName`: The name of the record.
- `properties`: List of properties or fields that make up the record.

### Properties

The properties in a record are defined as a comma-separated list of variables with their types. Each property represents a state or data field that the record encapsulates.

## Usage Example

```java
public record Person(String name, int age) {
    // Optional body
}

// Creating a record instance
Person person = new Person("Alice", 25);

// Accessing properties
System.out.println("Name: " + person.name());
System.out.println("Age: " + person.age());

// Record equality
Person anotherPerson = new Person("Alice", 25);
System.out.println("Record equality: " + person.equals(anotherPerson));
```

In the example above, we declare a `record` named `Person` with two properties: `name` of type `String` and `age` of type `int`. The record implicitly generates getter methods for these properties.

We create an instance of the `Person` record named `person` with the values "Alice" and 25. We can access the properties using the generated getter methods `name()` and `age()`.

The example demonstrates how record instances can be created and their properties accessed. We print the name and age of the `person` record using the getter methods.

Records also provide a natural implementation of equality based on their properties. We create another `Person` record named `anotherPerson` with the same name and age as the `person` record. We check the record equality using the `equals()` method, which compares the properties of the records for equality.

The `record` feature in Java simplifies the creation of simple data classes by automatically generating the necessary constructor, accessor methods, `equals()`, `hashCode()`, and `toString()` methods. It promotes immutability and facilitates the creation of data-centric classes with minimal boilerplate code.
