package session11_abstraction.homework.catsanddogs;

public class Main {

    public static void main(String[] args) {
        Animals cats = new Cats();
        Animals dogs = new Dogs();
        cats.cats();
        cats.dogs();
        dogs.cats();
        dogs.dogs();
    }
}