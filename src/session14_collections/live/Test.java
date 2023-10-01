package session14_collections.live;

import java.util.HashSet;
import java.util.Set;

public class Test {

    public static void main(String[] args) {

        Set<String> mySet = new HashSet<>();
        String one = "thisString";
        String two = new String("thisString");

        mySet.add(one);
        mySet.add(two);
        System.out.println(mySet);        // [thisString]

        Set<Cat> catSet = new HashSet<>();
        Cat catOne = new Cat("Felix");
        Cat catTwo = new Cat("Felix");
        catSet.add(catOne);
        catSet.add(catTwo);
        for (Cat cat : catSet) {
            System.out.println(cat);
        }
        //Felix Felix
    }

}

class Cat {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
