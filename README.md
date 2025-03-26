**Student Management System**

**Description:**

This project is a Java-based Student Management System designed to manage student records. It allows adding, viewing, updating, removing, and searching for students based on their ID or name. All student details are persisted in a text file (students.txt) for future use.

**Features:**

Add Student: Add a student's ID, name, and grade.

View All Students: View all stored student details.

Search by ID: Retrieve a student's details using their ID.

Search by Name: Find all students matching a given name.

Update Student: Modify the name and grade of an existing student.

Remove Student: Delete a student record using their ID.

File Persistence: Automatically saves and loads student records to/from the file students.txt.

**Technologies Used:**

File Handling (using FileWriter and Scanner)

Data Structures (HashMap, TreeSet, and List)

Object-Oriented Programming Principles

**Project Structure:**

Student Class: Represents a student and defines attributes and operations on student records.

StudentManagementSystem Class: Provides methods to manage students and ensures data persistence in the file.

Students Class: Contains the main() method and handles user interaction.

**File Persistence:**

Student details are stored in students.txt in a comma-separated format (ID,Name,Grade).

File is created in the program's working directory.


