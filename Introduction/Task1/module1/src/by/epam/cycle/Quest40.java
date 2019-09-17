package by.epam.cycle;

import by.epam.algoritm.Quest35;

import java.util.ArrayList;
import java.util.List;

public class Quest40 {

    Quest35 quest35 = new Quest35();

    public static void main(String[] args) {
        Quest40 quest40 = new Quest40();

        int a = 578;

        System.out.println(quest40.getValidNumbersList(999));

        x instanceof y;

    }

    private static void doSmth(){
        System.out.println("or");
    }

    private List<Integer> getValidNumbersList(int n){
        List<Integer> validList = new ArrayList<>();

        for(int i = 0; i < n; i++){
            if(isNumberValid(i)){
                validList.add(i);
            }
        }

        return validList;
    }

    private boolean isNumberValid(int a){
        List<Integer> splitNumber = quest35.splitNumberToNumerals(a);
        boolean isValid = true;
        for(int i = 0; i < splitNumber.size(); i++){
            if(splitNumber.get(i) != 0) {
                if (a % splitNumber.get(i) != 0) {
                    isValid = false;
                }
            }
        }
        return isValid;
    }
}
