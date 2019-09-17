package by.epam.cycle;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

public class Quest24 {
    public static void main(String[] args) {
        Quest24 quest24 = new Quest24();
        int a = 1332856479;
        List<Integer> splitA = quest24.splitNumber(a);
        System.out.println("Even numbers Sum: " + quest24.getSumEvenFromList(splitA));
    }

    private List<Integer> splitNumber(int a){
        List<Integer> list = new ArrayList<>();
        String[] array = (a+"").split("");
        for(int i = 0; i < array.length; i++){
                list.add(Integer.parseInt(array[i]));
        }
        return list;
    }

    private int getSumEvenFromList(List<Integer> list){
        return list
                .stream()
                .mapToInt(n -> n)
                .filter(n -> n % 2 == 0)
                .sum();
    }
}
