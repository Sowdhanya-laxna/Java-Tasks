package d5;

import java.util.*;



class Student implements Comparable<Student> {

    private String id;

    private String name;

    private String grade;



    public Student(String id, String name, String grade) {

        this.id = id;

        this.name = name;

        this.grade = grade;

    }



    public String getId() {

        return id;

    }



    public String getName() {

        return name;

    }



    public String getGrade() {

        return grade;

    }



    public void setName(String name) {

        this.name = name;

    }



    public void setGrade(String grade) {

        this.grade = grade;

    }



    public String toString() {

        return "ID: " + id + ", Name: " + name + ", Grade: " + grade;

    }

    public int compareTo(Student other) {

        return this.name.compareTo(other.name);

    }

}



class StudentManagementSystem {

    private HashMap<String, Student> students = new HashMap<>();

    private TreeSet<Student> sortedStudents = new TreeSet<>();



    public void addStudent(String id, String name, String grade) {

        Student student = new Student(id, name, grade);

        students.put(id, student);

        sortedStudents.add(student);

    }



    public void viewAllStudents() {

        for (Student student : students.values()) {

            System.out.println(student);

        }

    }



    public Student searchById(String id) {

        return students.get(id);

    }



    public void updateStudent(String id, String newName, String newGrade) {

        Student student = students.get(id);

        if (student != null) {

            sortedStudents.remove(student);

            student.setName(newName);

            student.setGrade(newGrade);

            sortedStudents.add(student);

            System.out.println("Student updated successfully.");

        } else {

            System.out.println("Student not found!");

        }

    }



    public void removeStudent(String id) {

        Student student = students.remove(id);

        if (student != null) {

            sortedStudents.remove(student);

            System.out.println("Student removed successfully.");

        } else {

            System.out.println("Student not found!");

        }

    }



    public List<Student> searchByName(String name) {

        List<Student> result = new ArrayList<>();

        for (Student student : students.values()) {

            if (student.getName().equalsIgnoreCase(name)) {

                result.add(student);

            }

        }

        return result;

    }

}



public class Students {

    public static void main(String[] args) {

        StudentManagementSystem sms = new StudentManagementSystem();

        Scanner scanner = new Scanner(System.in);

        sms.addStudent("1", "Sowdhanya", "A");

        sms.addStudent("2", "Miruthu", "B");



        while (true) {

            System.out.println("\nSTUDENT MANAGEMENT SYSTEM:");

            System.out.println("************************");

            System.out.println("1. Add Student");

            System.out.println("2. View All Students");

            System.out.println("3. Search by ID");

            System.out.println("4. Search by Name");

            System.out.println("5. Update Student");

            System.out.println("6. Remove Student");

            System.out.println("7. Exit");



            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            scanner.nextLine(); // Consume newline



            switch (choice) {

                case 1:

                    System.out.print("Enter ID: ");

                    String id = scanner.nextLine();

                    System.out.print("Enter Name: ");

                    String name = scanner.nextLine();

                    System.out.print("Enter Grade: ");

                    String grade = scanner.nextLine();

                    sms.addStudent(id, name, grade);

                    System.out.println("Student added successfully.");

                    break;



                case 2:

                    System.out.println("All Students:");

                    sms.viewAllStudents();

                    break;



                case 3:

                    System.out.print("Enter ID to search: ");

                    id = scanner.nextLine();

                    Student student = sms.searchById(id);

                    if (student != null) {

                        System.out.println("Student found: " + student);

                    } else {

                        System.out.println("Student not found!");

                    }

                    break;



                case 4:

                    System.out.print("Enter Name to search: ");

                    name = scanner.nextLine();

                    List<Student> students = sms.searchByName(name);

                    if (!students.isEmpty()) {

                        System.out.println("Students found:");

                        for (Student s : students) {

                            System.out.println(s);

                        }

                    } else {

                        System.out.println("No students found with that name.");

                    }

                    break;



                case 5:

                    System.out.print("Enter ID to update: ");

                    id = scanner.nextLine();

                    System.out.print("Enter New Name: ");

                    name = scanner.nextLine();

                    System.out.print("Enter New Grade: ");

                    grade = scanner.nextLine();

                    sms.updateStudent(id, name, grade);

                    break;



                case 6:

                    System.out.print("Enter ID to remove: ");

                    id = scanner.nextLine();

                    sms.removeStudent(id);

                    break;



                case 7:

                    System.out.println("Exiting...");

                    scanner.close();

                    return;



                default:

                    System.out.println("Invalid choice. Please try again.");

            }

        }

    }

}

