package session16_lambdas.homework.challenge8;

import java.util.List;

@FunctionalInterface
public interface IntListModifier {

    List<Integer> listModifier(List<Integer> inputList, IntModifier intModifier);
}
