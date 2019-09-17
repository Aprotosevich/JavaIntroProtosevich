package by.epam.cycle;

import by.epam.algoritm.Quest35;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Quest39 {

    Quest35 quest35 = new Quest35();

    public static void main(String[] args) {
        Quest39 quest39 = new Quest39();
        int a = 360;

        quest39.printResults(quest39.getValidNumber(100,1000));

        quest39.printResults(quest39.getValidNumber(100,100000));

    }

    private void printResults(List<Integer> list){
        if(list.size() == 0){
            System.out.println("No matches found!");
        }
        else System.out.println(list);
    }

    private List<Integer> getValidNumber(int begin, int end){
        List<Integer> validNumbers = new ArrayList<>();
        for(int i = begin; i < end; i++){
            //System.out.println(getNumberWithoutMaxNum(i) + " " + getNumberWithoutMaxNum(i)*7 + " " + i);
            if((getNumberWithoutMaxNum(i)*7 ) == i){
                validNumbers.add(i);
            }
        }
        return validNumbers;
    }

    private int getNumberWithoutMaxNum(int a){
        List<Integer> list = quest35.splitNumberToNumerals(a);

        int maxNum = Collections.max(list);

        for(int i = 0; i < list.size(); i++){
            if( list.get(i) ==  maxNum){
                list.remove(i);
                break;
            }
        }

        return getIntFromList(list);
    }

    private int getIntFromList(List<Integer> inputList){
        String number = "";
        for(int element: inputList){
            number += element;
        }
        return Integer.parseInt(number);
    }
}
