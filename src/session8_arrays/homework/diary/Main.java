package session8_arrays.homework.diary;

public class Main {

    public static void main(String[] args) {
        Diary diary = new Diary();
        diary.addEntry("Forgot to add the date.");
        diary.addEntry("2003-04-04; I did something");
        diary.addEntry("1989-03-03; Something happened to me.");
        diary.printAllEntries();
        diary.addEntry("2000-01-01; What a boring day.");
        diary.printAllEntries();
        diary.addEntry("2000-01-01; What a boring day.");
        diary.addEntry("2000-02-02; Happy day.");
        diary.printAllEntries();
        diary.deleteEntry("2000-02-02;");
        diary.printAllEntries();
        diary.deleteEntry("2000-03-03");
        diary.deleteEntry("orhgo");
        diary.editEntry("2000-01-01;", "What a very boring day");
        diary.editEntry("sdkfhjs", "oisdfosigjf");
        diary.printAllEntries();
        System.out.println(diary.getEntryOn("2000-01-01;"));
        System.out.println(diary.getEntryOn("2000-01-03;"));
        System.out.println(diary.getEntryOn("1989-03-03;"));
        diary.addEntry("2023-08-22; I saw the sea.");
        diary.addEntry("1988-05-16; I cried");
        diary.addEntry("2000-09; hello");
        diary.printAllEntries();
    }
}
