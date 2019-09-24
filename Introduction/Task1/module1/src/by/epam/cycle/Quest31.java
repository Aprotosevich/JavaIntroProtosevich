package by.epam.cycle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* Компьютер генерирует пять чисел в диапазоне от 1 до 15 включительно. Человек пытается их угадать.
         Программа должна выводить угаданные и неугаданные числа из тех, что сгенерировала программа,
         а также ошибочные числа пользователя.*/

public class Quest31 {

    private BufferedReader reader;

    public static void main(String[] args) {
        Quest31 quest31 = new Quest31();

        List<Integer> compNumbers = quest31.getIntegerArray();

        List<Integer> userTries = quest31.userToTry();

        List<Integer> userHits = quest31.getHits(compNumbers, userTries);
        List<Integer> userMisses = quest31.getMisses(compNumbers, userTries);
        List<Integer> notShotedNumbers = quest31.getMisses(userHits, compNumbers);

        System.out.println("Computer Generated: " + compNumbers);
        System.out.println("User Hits: " + userHits);
        System.out.println("User Misses: " + userMisses);
        System.out.println("Not shoted numbers: " + notShotedNumbers);
    }

    private List<Integer> getHits(List<Integer> target, List<Integer> shots){
        List<Integer> succesNum = new ArrayList<>();
        for(int i = 0; i < shots.size(); i++){
            int a = shots.get(i);
            for(int j = 0; j < target.size(); j++){
                int b = target.get(j);
                if(a == b){
                    succesNum.add(a);
                    break;
                }
            }
        }
        return succesNum;

    }

    private List<Integer> getMisses(List<Integer> target, List<Integer> shots){
        List<Integer> misses = new ArrayList<>();
        for(int i = 0; i < shots.size(); i++){
            int a = shots.get(i);
            boolean found = false;
            for(int j = 0; j < target.size(); j++){
                int b = target.get(j);
                if(a == b){
                    found = true;
                    break;
                }
            }
            if(!found){
                misses.add(a);
            }
        }
        return misses;
    }

    private List<Integer> userToTry(){
        reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        System.out.println("Generation complete! " +
                "Type number from 1 to 15. Wish you good luck! Type '0' to finish.");
        while(true){
            try {
                if (list.size() > 0) {
                    System.out.println("Type another number if you want to try, or type '0' to finish");
                }
                int a = Integer.parseInt(reader.readLine());
                if(a == 0){
                    break;
                }
                else {
                    list.add(a);
                }
            } catch (Exception e) {
                System.out.println("Wrong input! Type numbers please!");
            }
        }
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    private List<Integer> getIntegerArray(){
        List<Integer> array = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            array.add(new Random().nextInt(15)+1);
        }
        return array;
    }
}
