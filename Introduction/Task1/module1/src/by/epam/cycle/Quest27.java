package by.epam.cycle;

import java.util.ArrayList;
import java.util.List;

public class Quest27 {
    public static void main(String[] args) {
        Quest27 quest27 = new Quest27();

        quest27.printValidNumbers(5,10);
    }

    private void printValidNumbers(int m, int n){
        for(int i = m; i <= n; i++){
            if(getDividersList(i).size() > 0) {
            System.out.println("Number: " + i + ", dividers: " + getDividersList(i));
            }
        }
    }

    private List<Integer> getDividersList(int n) {
        List<Integer> list = new ArrayList<>();

        for(int i = 2; i < n; i++){
            if(n % i == 0){
                list.add(i);
            }
        }

        return list;
    }
}
