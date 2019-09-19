package by.epam.algoritm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quest33 {

    public static void main(String[] args) throws Exception {
        Quest33 quest33 = new Quest33();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        char input = quest33.getSymbolFromInput(bufferedReader);

        System.out.println("Symbol number: " + quest33.getNumberFromChar(input));
        System.out.println("Next symbol: " + quest33.getNextSymbol(input));
        System.out.println("Before symbol: " + quest33.getBeforeSymbol(input));

        bufferedReader.close();
    }

    private char getNextSymbol(char input){
        return (char)((int)input+1);
    }

    private char getBeforeSymbol(char input){
        return (char)((int)input-1);
    }


    private int getNumberFromChar (char input){
        return (int)input;
    }

    private char getSymbolFromInput(BufferedReader bufferedReader){
        String input = "";
        try {
            while(true) {
            input = bufferedReader.readLine();
            if(input.length() == 1){
                break;
            }
            else {
                System.out.println("Wrong input! Please type one symbol!");
            }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return input.charAt(0);
    }

}
