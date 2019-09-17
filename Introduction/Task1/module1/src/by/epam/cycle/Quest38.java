package by.epam.cycle;

import by.epam.algoritm.Quest35;

import java.util.List;

public class Quest38 {
    Quest35 quest35 = new Quest35(); // from by.epam.algoritm;

    public static void main(String[] args) {
        Quest38 quest38 = new Quest38();

        System.out.println(quest38.isNumberValidForTask(2524678));
        System.out.println(quest38.isNumberValidForTask(1357));
        System.out.println(quest38.isNumberValidForTask(963));

    }

    private boolean isNumberValidForTask(int a){
        List<Integer> numbersList = quest35.splitNumberToNumerals(a);
        boolean isValid = true;
        for(int i = 0; i < numbersList.size()-2; i++){
            if(numbersList.get(i+1) - numbersList.get(i) != numbersList.get(i+2) - numbersList.get(i+1)){
                isValid = false;
            }
        }
        return isValid;
    }
}
