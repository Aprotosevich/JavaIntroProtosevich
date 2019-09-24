package by.epam.cycle;

import by.epam.algoritm.Quest35;

import java.util.ArrayList;
import java.util.List;

/* Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.*/

public class Quest29 {
    public static void main(String[] args) {
        Quest29 quest29 = new Quest29();
        int x = 54873;
        int y = 4219582;

        System.out.println("Common numbers: " + quest29.getListOfCommonNum(x,y));
    }

    private List<Integer> getListOfCommonNum(int x, int y){
        Quest35 quest35 = new Quest35(); //import from by.epam.algoritm
        List<Integer> firstNumberList = quest35.splitNumberToNumerals(x);
        List<Integer> secondNumberList = quest35.splitNumberToNumerals(y);

        List<Integer> listOfCommonNum = new ArrayList<>();

        for(int i = 0; i < firstNumberList.size(); i++){
            int a = firstNumberList.get(i);
            for(int j = 0; j < secondNumberList.size(); j++){
                int b = secondNumberList.get(j);
                if(a == b){
                    listOfCommonNum.add(a);
                }
            }
        }
        return listOfCommonNum;
    }
}
