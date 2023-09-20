package session16.homework.challenge12;

public class StringMergeTest {

    public static void main(String[] args) {
        StringMerge stringMerge = ((a, b) -> a.concat(" ").concat(b));
        System.out.println(stringMerge.merge("hello", "world"));
    }
}