package session11_abstraction.livesession.abstractionpractice;

public class FinalKeyword {
}

class Parent {

    final void showMessage() {
        System.out.println("Show some message");
    }
}

class Child extends Parent {

    //Cannot override do to the final keyword.
//    void showMessage() {
//
//    }
}
