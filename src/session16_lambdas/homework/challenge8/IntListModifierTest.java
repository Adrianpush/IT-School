package session16_lambdas.homework.challenge8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IntListModifierTest {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Random random = new Random();
        for (int index = 0; index < 21; index++) {
            integers.add(random.nextInt(-100, 101));
        }


        IntListModifier intListModifier = (List<Integer> integerList, IntModifier intModifier) -> {
            List<Integer> modifiedList = new ArrayList<>();
            for (int number : integerList) {
                modifiedList.add(intModifier.modifyInt(number));
            }
            return modifiedList;
        };
        IntModifier toPositive = a -> Math.abs(a);
        IntModifier toNegative = a -> -Math.abs(a);

        System.out.println("All numbers to positive: " + intListModifier.listModifier(integers, toPositive));
        System.out.println("All numbers to negative: " + intListModifier.listModifier(integers, toNegative));
        System.out.println("Original List: " + integers);

    }
}
