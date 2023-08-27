School Gradebook - Develop a gradebook system for a school where teachers can:

- Add students to their classes.
- Each student has a name and a unique student ID.
- Assign grades for assignments or exams to each student.
- Calculate the average grade for each student in their class.
- View a list of all students and their respective average grades.

OOP decisions
- created class called Student with fields for studentName as String, studentID as UUID and student grades as list of doubles.
- constructor initializes object by receiving the studentName as a string parameter. The studentID gets generated automatically each time a new student is created. The list of student grades gets initialized to an empty ArrayList.
- Implemented getters for all fields. Implemented setter for studentName.
- Created class called ClassOfStudents with fields for the name of the class as String and a list of students as class members.
- Constructor initializes a ClassOfStudents by receiving the name of the class as a parameter of type String. Constructor automatically initializes an empty list of students.
- Created method in class ClassOfStudents to add a student to the class. The method receives an object type student and adds it to the instance variable list of students.
- Created three overloaded methods to grade a student. All add the grade, received as a double, to the list of grades of the student. One finds the student by studentName and another by studentID (in case two or more students share a name). The third method is private and gets called by the other two. It uses the Student instance to add the grade. 
- In a similar logic created three overloaded methods to get the student average.
- Created method printStudentsInClass which loops through all the students in the class instance and prints their UUID, name and grade average.