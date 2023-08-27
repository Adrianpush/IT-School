package session9.homework.SchoolGradebook;

public class SchoolGradebook {

    public static void main(String[] args) {
        ClassOfStudents thirdGrade = new ClassOfStudents("Third Grade");
        thirdGrade.addStudent(new Student("John"));
        thirdGrade.addStudent(new Student("Mary"));
        thirdGrade.addStudent(new Student("Claire"));
        thirdGrade.addStudent(new Student("Jaime"));
        thirdGrade.addStudent(new Student("Dougal"));
        thirdGrade.addStudent(new Student("Robert"));
        thirdGrade.printStudentsInClass();
        thirdGrade.gradeTest("John", 8.25);
        thirdGrade.gradeTest("Claire", 7);
        thirdGrade.gradeTest("Robert", 10);
        thirdGrade.gradeTest("Mary", 9.99);
        thirdGrade.gradeTest("Dougal", 4.23);
        thirdGrade.printStudentsInClass();
    }
}
