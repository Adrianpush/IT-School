package session16_lambdas.homework.challenge14;

import session15_hashcode_equals_generics.live.generics.Pair;

@FunctionalInterface
public interface PairMaker<K, V> {

    Pair<K, V> makePair(K key, V value);
}
