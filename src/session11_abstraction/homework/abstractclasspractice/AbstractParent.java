package session11_abstraction.homework.abstractclasspractice;

abstract class AbstractParent {

    public AbstractParent() {
        System.out.println("This is constructor of abstract class.");
    }

    protected abstract void a_method();

    protected void print() {
        System.out.println("This is a normal method of abstract class");
    }
}