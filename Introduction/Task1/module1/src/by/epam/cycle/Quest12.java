package by.epam.cycle;

import java.util.ArrayList;
import java.util.List;

public class Quest12 {
    public static void main(String[] args) {
        Quest12 quest12 = new Quest12();
        List<Integer> listFirstTenNum = quest12.getArray(3);
        System.out.println(listFirstTenNum);

        System.out.println(quest12.getMultiplFromList(listFirstTenNum));
    }

    private List<Integer> getArray(int n){
        List<Integer> list = new ArrayList<>();
        int a = 1;
        list.add(a);
        for(int i = 1; i < n; i++){
            a = 6 + list.get(i-1);
            list.add(i, a);
        }
        return list;
    }

    protected int getMultiplFromList(List<Integer> list){
        int answer = 1;
        for(int element: list){
            answer = answer * element;
        }
        return answer;
    }
}
