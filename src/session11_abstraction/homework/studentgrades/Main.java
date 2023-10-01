package session11_abstraction.homework.studentgrades;

public class Main {

    public static void main(String[] args) {
        Marks marksForStudentA = new MarksForStudentA(86, 66,
                82);
        System.out.println(marksForStudentA.getPercentage());
        Marks marksForStudentB = new MarksForStudentB(59, 52,
                80, 43);
        System.out.println(marksForStudentB.getPercentage());
    }
}
