# Java Lab Report – Lab 3

## Submitted By
Mamata Adhikari

# Question 1: Abstract Class Program

## Introduction
This program demonstrates the concept of abstract class in Java.
It manages student activities like displaying information,
attending classes, paying fees, and giving exams.

## Problem Statement
To create a Java program using an abstract class where a student
can:
- display information
- attend class
- pay fee
- give exam
- 
## Methodology
- An abstract class named `Student` was created.
- Variables `name` and `roll` were declared.
- Normal methods:
  - `displayInfo()`
  - `attendClass()`
  - `payFee()`
  were added.
- An abstract method `giveExam()` was declared.
- A child class `StudentCEIV` extends the `Student` class.
- The abstract method was implemented in the child class.
- Object was created in the main method.
- 
## Analysis
This program demonstrates:
- Abstraction
- Inheritance
- Constructors
- Normal methods
- Abstract methods

The abstract class provides partial implementation while the child
class completes the remaining functionality.

## Conclusion
The program successfully demonstrated the use of abstract class and
inheritance in Java. It showed how abstract and normal methods can
work together in a real-life student management system.

---

# Question 2: Interface Program

## Introduction
This program demonstrates the concept of interface in Java using a
library management system.

## Problem Statement
To create a Java program using interface that:
- shows borrowed books
- displays course books according to student course
- 
## Methodology
- An interface named `LibraryHelper` was created.
- Method declarations:
  - `showBorrowedBooks()`
  - `showCourseBooks()`
  were added.
- A class `LibraryStudent` implements the interface.
- The methods were defined inside the implementing class.
- Object was created and methods were called.
  
## Analysis
This program demonstrates:
- Interface
- Method declaration
- Implements keyword
- Polymorphism

The interface acts as a rule book while the implementing class
provides the actual working implementation.

## Conclusion
The program successfully demonstrated the use of interface in Java.
It showed how interfaces help achieve abstraction by defining rules
for classes.

---

# Question 3: Student Result System

## Introduction
This program demonstrates inheritance, interface implementation,
and normal methods together in Java.

## Problem Statement
To create a Java program that:
- extends Student class
- implements LibraryHelper interface
- displays student information
- displays student marks
- shows borrowed books
- 
## Methodology
- A class `StudentInfo` was created to store student details.
- An interface `LibraryRules` was created.
- A class `StudentResult` extends `StudentInfo` and implements
  `LibraryRules`.
- Methods were added to display:
  - student information
  - student marks
  - borrowed books
- Constructor and object creation were used.
- 
## Analysis
This program demonstrates:
- Inheritance
- Interface implementation
- Normal methods
- Constructors
- Object creation

The program combines multiple OOP concepts into one system.

## Conclusion
The program successfully demonstrated the use of inheritance,
interfaces, and normal methods together in Java. It showed how
multiple OOP concepts can be combined to build a complete system.

Repo Link: https://github.com/mamatadhkr/java-practice
