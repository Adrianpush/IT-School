College Management System - Design a system for a college to efficiently manage information about students, professors, and courses:

- Store comprehensive profiles for every student, capturing their first name, last name, sex, age, date of birth, CNP, and address.
- Similarly, maintain detailed profiles for every professor, including their first name, last name, sex, age, date of birth, CNP, and address.
- The college offers eight distinct courses: Math, Computer Science, Physics, Chemistry, Biology, Geography, English, and History. For each course, track details like its schedule, duration, description, and the assigned professor.
- Allow for the assignment of a professor to a specific course and ensure the ability to retrieve and view course details, including its assigned professor.

Explanation of OOP decisions.
-   Decided to create a CollegeMember class that stores all the information that is shared by both professors and students (eg.  first name, last name, sex, age, date of birth, CNP, and address.)
  - Constructor for class has parameters the firstName and LastName as Strings and the dateOfBirth as LocalDate and the PersonalNumeric Identifier as String because this would be the minimum information required to register a person with the College either as a professor or student.
  - Implemented setters for firstName, lastName, address, etc.
  - Did not implement setters for PersonalNumericIdentifier or date of birth beacuse it dosent make sense that these should ever be changed.
  - Implemented getters for all fields
  - Created two classes (Student and Professor) which inherit from College Members
  - Created a class Course.
  - Class constructor requires course title, description and number of sessions.
  - Course object has setters for professor and start date
  - Instance variable professor is of type Professor.
  - I think this decisions will make the app easy to scale.
  - A list of students could be added to the Course class.
  - And a list of completed courses could be added to the student class.
