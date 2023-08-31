# Testing with JUnit
This is the example codebase for the Pluralsight course: Java SE 17 Unit Testing With JUnit.  It is a medication prescription writing domain example.

## Prerequisites / Requirements

  * Java 17 or higher is required to compile and build the application.
      *  [Adopt Open JDK] (https://openjdk.java.net/projects/jdk/17/)
      *  [Oracle JDK] (https://www.oracle.com/java/technologies/java-se-glance.html)
  * [Maven 3.8+]( https://maven.apache.org/download.cgi) is also required - although any Maven 3 or higher version will likely work.
  * A git client if you wish to clone the repository - otherwise just download the zip from this page.  Use the green code dropdown button to either clone or obtain a zip of the project.
  
The example project uses JUnit 5, but this is declared as a maven project dependency, so does not need to be downloaded separately.

It is recommended to use an IDE like IntelliJ or Eclipse if following along with the course on your own box.

## Running Tests

`mvn clean test` 

from the project root directory should compile the application and run all unit tests.

