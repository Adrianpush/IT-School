package session11_abstraction.homework.abstractclassparent;

public class Main {

    public static void main(String[] args) {
        Parent childOne = new ChildOne();
        Parent childTwo = new ChildTwo();
        childOne.message();
        childTwo.message();
    }
}
