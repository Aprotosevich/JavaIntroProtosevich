package by.epam.cycle;

import java.util.ArrayList;
import java.util.List;

/*Последовательность аn строится так: а1 = 1, an =6+ аn-1 , для каждого n >1
        Составьте программу нахождения произведения первых 10 членов этой последовательности.*/

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

    protected int getMultiplFromList(List<Integer> list) { // used in q17, so acces = protected
        int answer = 1;
        for(int element: list){
            answer = answer * element;
        }
        return answer;
    }
}
