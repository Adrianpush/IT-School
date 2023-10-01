package session16_lambdas.homework.challenge14;

import session15_hashcode_equals_generics.live.generics.Pair;

public class PairMakerTest {

    public static void main(String[] args) {
        PairMaker<String, Integer> stringIntegerPairMaker = ((key, value) -> new Pair<>(key, value));
        System.out.println(stringIntegerPairMaker.makePair("One", 1).toString());
    }
}
