package session16.homework.challenge14;

import session15.live.generics.Pair;

@FunctionalInterface
public interface PairMaker<K, V> {

    Pair<K, V> makePair(K key, V value);
}
