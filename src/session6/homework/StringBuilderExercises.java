package session6.homework;

import java.util.ArrayList;
import java.util.List;

public class StringBuilderExercises {

    public static void main(String[] args) {
        System.out.println(StringBuilderCustomClass.stringReverser("hello"));
        System.out.println(StringBuilderCustomClass.isPalindrome("ABBA"));
        List<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("hello ");
        listOfStrings.add("world ");
        listOfStrings.add("how is ");
        listOfStrings.add("the weather?");
        System.out.println(StringBuilderCustomClass.convertToSingleString(listOfStrings));
        System.out.println(StringBuilderCustomClass.removeVowels("aaaaaewsadtyiaaaaaaaabaaaaaaabaaaaa"));
        System.out.println(StringBuilderCustomClass.toTitle("when i was little i wanted to be big, didn't i?"));
        System.out.println(StringBuilderCustomClass.replaceAllOccurrences("mat", "dog",
                "The cat sat on the mat."));
        System.out.println(StringBuilderCustomClass.replaceAllOccurrences("I", "U",
                "I want to work, I want to toil, I want to sing."));
        System.out.println(StringBuilderCustomClass.duplicateCharacterRemover("The book shook me from the nook."));
        System.out.println(StringBuilderCustomClass.insertAtIndex("Hello, my dear. How are you today?",
                " Belzebut ", 14));
        System.out.println(StringBuilderCustomClass.charFrequencyCounter("Article translations are expensive."));
        System.out.println(StringBuilderCustomClass.morseCodeConverter("Hello, world!"));
    }
}
