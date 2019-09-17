package by.epam.cycle;

import java.util.ArrayList;
import java.util.List;

public class Quest18 {
    public static void main(String[] args) {
        Quest18 quest18 = new Quest18();
        int e = 3;
        System.out.println(quest18.countA(2));
        System.out.println(quest18.countA(-2));
        System.out.println(quest18.countA(5));
        System.out.println(quest18.countA(-5));
        System.out.println(quest18.countA(-12));
        System.out.println(quest18.countA(+12));
        System.out.println(quest18.countA(1));
        System.out.println(quest18.countA(-1));
        System.out.println(quest18.countA(475));

        /* сумма всегда будет = 0 (???)*/
    }

    private double countA(int n){
        return (Math.pow(-1, n-1)) / n;
    }
}
