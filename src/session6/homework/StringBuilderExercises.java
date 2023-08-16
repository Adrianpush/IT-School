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

        System.out.println(StringBuilderCustomClass.encodeCaesarCipher("Glory to Rome! ZZzzzZZ", 5));
        System.out.println(StringBuilderCustomClass.decodeCaesarCipher("Lqtwd yt Wtrj! EEeeeEE", 5));

        System.out.println(StringBuilderCustomClass.snakeCaseToCamelCase("this_is_camel_case"));
        System.out.println(StringBuilderCustomClass.camelCaseToSnakeCase("thisIsSnakeCase"));

        System.out.println(StringBuilderCustomClass.expandCompressedString("a22bc5"));

        System.out.println(StringBuilderCustomClass.removeComments("aaa//aaaaaaaaa\na"));
        System.out.println(StringBuilderCustomClass.removeComments("a/**aa//aaa/*aaaaaa\na*///a\na"));

        System.out.println(StringBuilderCustomClass.areAnagrams("aabba", "baaab"));
        System.out.println(StringBuilderCustomClass.areAnagrams("caabba", "baaab"));
        System.out.println(StringBuilderCustomClass.areAnagrams("caabba", "baacab"));

        System.out.println(StringBuilderCustomClass.toggleCase("Hello MofO"));

        System.out.println(StringBuilderCustomClass.interweaveStrings("aaaaaaaaaaa", "11111"));

        System.out.println(StringBuilderCustomClass.findPattern("ABABABABABABA"));
    }
}
