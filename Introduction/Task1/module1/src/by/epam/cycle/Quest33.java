package by.epam.cycle;

import java.util.HashMap;
import java.util.Map;

/* Найдите наибольшую цифру данного натурального числа.*/

public class Quest33 {
    public static void main(String[] args) {
        Quest33 quest33 = new Quest33();

        Map<Integer, Integer> numPairs = quest33.getValidNumPairs();

        quest33.printResults(numPairs);
    }

    private void printResults(Map<Integer, Integer> inputMap){
        for(Map.Entry pair: inputMap.entrySet()){
            System.out.println(pair.getKey() + " and " + pair.getValue());
        }
    }

    private Map<Integer,Integer> getValidNumPairs(){
        Map<Integer,Integer> pairsMap = new HashMap<>();

        for(int a = 10; a < 100; a++){
            for(int i = 10; i < 100; i++){
                if(Integer.parseInt(a +"" + i) % (a*i) == 0){
                    pairsMap.put(a,i);
                }
            }
        }
        return pairsMap;
    }
}
