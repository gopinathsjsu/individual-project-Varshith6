# individual-project-Varshith6

individual-project-Varshith6 created by GitHub Classroom

Name: Sai Varshith Talluri  
ID: 015952586

PROBLEM:
Design and implement a Java application for the following requirements. You may choose up to 3 design patterns. Include a class diagram for your design. All submissions should be committed to the assigned Github repo. Please include a README file with very clear instructions on how to build and run your application.

Steps to run the application:

- Open terminal.
- Run "mvn compile mvn exec:java -Dexec.mainClass=com.inventory.Billing"

# Design Patterns

* Singleton

* Factory

Singleton:

It's a creational design pattern that lets you to assure that a class only has one instance while yet offering global access to that instance.
Used this pattern to store the data for the entire application. 

Class implemented using singleton pattern is Database.An instance of the Database is created and the getter methods is called in the required classes by only one instance and it can be reused.

Factory Pattern:

Factory Method is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.
Used this pattern by creating an interface "ResultGenerator" which is implemented by "BillGenerator" and "ErrorGenerator"

Class Diagram: 
![Alt text](https://github.com/gopinathsjsu/individual-project-Varshith6/blob/main/images/Billing.jpeg "Optional title")

![Alt text](https://github.com/gopinathsjsu/individual-project-Varshith6/blob/main/images/Cl_output.jpeg "Optional title")

![Alt text](https://github.com/gopinathsjsu/individual-project-Varshith6/blob/main/images/Input.jpeg "Optional title")

![Alt text](https://github.com/gopinathsjsu/individual-project-Varshith6/blob/main/images/receipt.jpeg "Optional title")
