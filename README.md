Mini Hospital Emergency Management System

Overview

The Mini Hospital Emergency Management System is a Java-based console application developed for the CIT300 Data Structures and Algorithms individual mid assignment.

The system manages patient records and hospital activities using different data structures. It demonstrates how data structures can be applied to a real-world hospital emergency management scenario.

Project Objectives

The main objectives of this project are:

* To manage patient records efficiently.
* To demonstrate the practical use of different data structures.
* To implement searching, insertion, deletion, and traversal operations.
* To manage emergency patients according to their waiting order.
* To maintain treatment records using a Last In, First Out approach.
* To maintain previous hospital visits for individual patients.

Data Structures Used

1. Binary Search Tree (BST)

The Binary Search Tree is used to manage patient records. The Patient ID is used as the key for organizing the patient records.

Functions:

* Register a new patient
* Search for a patient by Patient ID
* Delete a patient
* Display patients in ascending Patient ID order

The in-order traversal of the BST displays patient records in ascending order of Patient ID.

2. Queue

A Queue is used to manage emergency patients waiting for treatment.

Functions:

* Add an emergency patient
* Treat the next patient
* Display patients waiting for treatment
* Handle an empty queue

The Queue follows the FIFO (First In, First Out) principle. Therefore, the patient who enters the queue first is treated first.

3. Stack

A Stack is used to store completed treatment records.

Functions:

* Add a treatment record
* Remove the latest treatment record
* Display treatment history
* Handle an empty stack

The Stack follows the LIFO (Last In, First Out) principle. Therefore, the most recently added treatment record is removed first.

4. Singly Linked List

A Singly Linked List is used to maintain previous visit history for each patient.

Functions:

* Add a patient visit
* Remove a patient visit
* Search for a patient visit
* Display patient visit history

Each patient has a separate visit history. This allows the system to maintain previous visits independently for different patients.

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
* Empty queue and stack handling
* Duplicate ID validation

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

The system was tested for the following operations:

* Patient registration
* Duplicate Patient ID validation
* Patient search
* Patient deletion
* BST in-order traversal
* Emergency patient enqueue operation
* Emergency patient dequeue operation
* Emergency queue FIFO operation
* Empty queue handling
* Treatment record push operation
* Treatment record pop operation
* Treatment stack LIFO operation
* Empty stack handling
* Adding patient visits
* Searching patient visits
* Removing patient visits
* Duplicate Visit ID validation
* Displaying patient visit histories
* Maintaining separate visit histories for different patients

Data Structure Design

Each data structure was selected based on the type of operation required by the system.

* Binary Search Tree: Used for organizing and searching patient records using Patient ID.
* Queue: Used for emergency patients because patients should be handled according to their waiting order.
* Stack: Used for treatment history because the latest treatment record can be accessed first.
* Singly Linked List: Used for previous patient visits because each patient can have multiple visits connected together.

Conclusion

This project demonstrates the practical use of Binary Search Trees, Queues, Stacks, and Singly Linked Lists in a hospital emergency management scenario.

The system provides a simple console-based interface for managing patient records, emergency patients, treatment records, and patient visit histories.

Through this project, the implementation and practical application of fundamental data structure operations such as insertion, searching, deletion, traversal, enqueue, dequeue, push, pop, and linked-list operations are demonstrated.