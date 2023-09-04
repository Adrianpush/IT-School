package session11.homework.studentgrades;

public class MarksForStudentB extends Marks {

    int subjectOneMark;
    int subjectTwoMark;
    int subjectThreeMark;
    int subjectFourMark;

    public MarksForStudentB(int subjectOneMark, int subjectTwoMark, int subjectThreeMark, int subjectFourMark) {
        this.subjectOneMark = subjectOneMark;
        this.subjectTwoMark = subjectTwoMark;
        this.subjectThreeMark = subjectThreeMark;
        this.subjectFourMark = subjectFourMark;
    }

    @Override
    protected double getPercentage() {
        return (double) (subjectOneMark + subjectTwoMark + subjectThreeMark + subjectFourMark) / 4;
    }
}
