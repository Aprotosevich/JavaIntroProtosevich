package by.epam.algoritm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Quest35 {
    public static void main(String[] args) {
        int m = 453;
        int n = 17;
        Quest35 quest35 = new Quest35();
        quest35.printTwoNumbers(m,n);
    }

    private void printTwoNumbers(int m, int n){
        double mn = (double) m / n;
        System.out.println("Делим " + m + " на " + n + ". Результат деления: " + mn);

        int fullPart = (int)mn;
        double halfPart = mn - fullPart;

        System.out.println("Наибольшее число дробной части: "
                + Collections.max(splitNumberToNumerals(halfPart)));

        System.out.println("Наименьшее число целой части "
                + Collections.min(splitNumberToNumerals(fullPart)));
    }

    private List<Integer> splitNumberToNumerals(double x){
        String[] array = (x + "").split("");
        List<Integer> list = new ArrayList<>();
        for(String element: array){
            if(!element.equals("."))
            { list.add(Integer.parseInt(element));}
        }
        return list;
    }

    public List<Integer> splitNumberToNumerals(int x){
        String[] array = (x + "").split("");
        List<Integer> list = new ArrayList<>();
        for(String element: array){
            if(!element.equals("."))
            { list.add(Integer.parseInt(element));}
        }
        return list;
    }

}
