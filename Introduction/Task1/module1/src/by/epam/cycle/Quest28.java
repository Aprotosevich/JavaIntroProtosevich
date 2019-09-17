package by.epam.cycle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quest28 {
    int x = 0;
    int y = 0;
    String operate = "";

    BufferedReader reader;

    public static void main(String[] args) throws Exception {
        Quest28 quest28 = new Quest28();

        quest28.reader = new BufferedReader(new InputStreamReader(System.in));

        while(true) {

            quest28.inputNumbers();

            quest28.inputOperate();

            int calculatedNumber = quest28.calculateQuestion(quest28.x, quest28.y, quest28.operate);

            System.out.println(quest28.x + " " + quest28.operate + " " + quest28.y + " = " + calculatedNumber);

            System.out.println("Type '0' to exit or any other key to continue");
            if (quest28.reader.readLine().equals("0")) {
                System.out.println("Closing application. Bye!");
                break;
            }
        }

        quest28.reader.close();
    }

    private int calculateQuestion(int a, int b, String operate){
        if(operate.length()!= 1){
            System.out.println("Wrong operate! Please choose correct operate: + - * /");
            return 0;
        }
        char ch = operate.charAt(0);
        int answer = 0;
        switch (ch){
            case 43 : answer = a+b;
            break;
            case 45 : answer = a-b;
            break;
            case 42: answer = a*b;
            break;
            case 47: answer = a / b;
        }
        return answer;
    }

    private void inputOperate() throws Exception {
        System.out.println("Please enter operate type: * / + -");
        while(true){
            String input = reader.readLine();
            if(input.equals("/") && y == 0){
                System.out.println("Wrong input! Cannot divide by 0. Try again.");
            }
            else if(input.equals("*") || input.equals("/") || input.equals("+") || input.equals("-")){
                operate = input;
                break;
            }
            else { System.out.println("Wrong operate input! Please try again!"); }
        }
    }



    private void inputNumbers() throws Exception{
        System.out.println("Please Enter Number X and Number Y: ");
        while(true) {
            try {
                x = Integer.parseInt(reader.readLine());
                y = Integer.parseInt(reader.readLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Wrong number input! Please try again!");
            }
        }
    }

}
