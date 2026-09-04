Mini Hospital Emergency Management System

Overview

The Mini Hospital Emergency Management System is a Java-based console application developed for the CIT300 Data Structures and Algorithms assignment.

The system manages patient records and hospital activities using different data structures. It demonstrates how data structures can be applied to real-world hospital emergency management.

Data Structures Used

1. Binary Search Tree (BST)

The Binary Search Tree is used to manage patient records.

Functions:

* Register a new patient
* Search for a patient by Patient ID
* Delete a patient
* Display patients in ascending Patient ID order

2. Queue

A Queue is used to manage emergency patients waiting for treatment.

Functions:

* Add an emergency patient
* Treat the next patient
* Display patients waiting for treatment
* Handle an empty queue

The Queue follows the FIFO (First In, First Out) principle.

3. Stack

A Stack is used to store completed treatment records.

Functions:

* Add a treatment record
* Remove the latest treatment record
* Display treatment history
* Handle an empty stack

The Stack follows the LIFO (Last In, First Out) principle.

4. Singly Linked List

A Singly Linked List is used to maintain previous visit history for each patient.

Functions:

* Add a patient visit
* Remove a patient visit
* Search for a patient visit
* Display patient visit history

Each patient has a separate visit history.

Patient Information

Each patient record contains:

* Patient ID
* Patient Name
* Age
* Contact Number
* Medical Condition

Patient Visit Information

Each visit record contains:

* Visit ID
* Visit Date
* Doctor Name
* Diagnosis
* Treatment

Main Features

* Patient registration
* Patient search
* Patient deletion
* Display all patients
* Emergency patient queue management
* Treatment history management
* Patient visit history management
* Menu-driven console interface

Project Structure

Hospital Emergency System
│
├── Main.java
├── Patient.java
├── PatientBST.java
├── EmergencyQueue.java
├── TreatmentStack.java
├── VisitLinkedList.java
├── .gitignore
└── README.md

Technologies Used

* Java
* Visual Studio Code
* Git
* GitHub

How to Run

1. Open the project folder in Visual Studio Code.
2. Open the terminal.
3. Compile the Java files:

javac *.java

4. Run the application:

java Main

Testing

The system was tested for:

* Patient registration
* Patient search
* Patient deletion
* BST in-order traversal
* Emergency queue FIFO operation
* Empty queue handling
* Treatment stack LIFO operation
* Empty stack handling
* Adding patient visits
* Searching patient visits
* Removing patient visits
* Displaying separate visit histories for different patients

Conclusion

This project demonstrates the practical use of Binary Search Trees, Queues, Stacks, and Singly Linked Lists in a hospital emergency management scenario. The system provides a simple console-based interface for managing patient records, emergency patients, treatment records, and patient visit histories.