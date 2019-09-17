package by.epam.cycle;

import java.util.ArrayList;
import java.util.List;

public class Quest17 {
    public static void main(String[] args) {
        Quest17 quest17 = new Quest17();
        Quest12 quest12 = new Quest12(); // to multiply list;

        int a = 5;
        int n = 4;

        List<Integer> list = quest17.getList(a,n);
        System.out.println("Answer: " + quest12.getMultiplFromList(list));

    }

    private List<Integer> getList(int a, int n){
        List<Integer> list = new ArrayList<>();
        list.add(a);
        for(int i = 1; i < n; i++){
            list.add(i, a+i);
        }
        return list;
    }
}
