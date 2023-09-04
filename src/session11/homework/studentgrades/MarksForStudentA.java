package session11.homework.studentgrades;

public class MarksForStudentA extends Marks{

    int subjectOneMark;
    int subjectTwoMark;
    int subjectThreeMark;

    public MarksForStudentA(int subjectOneMark, int subjectTwoMark, int subjectThreeMark) {
        this.subjectOneMark = subjectOneMark;
        this.subjectTwoMark = subjectTwoMark;
        this.subjectThreeMark = subjectThreeMark;
    }

    @Override
    protected double getPercentage() {
        return (double) (subjectOneMark + subjectTwoMark + subjectThreeMark) / 3;
    }
}
