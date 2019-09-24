package by.epam.algoritm;

/* Дано значение х. Получить значения  -2х + 3х2 - 4х3  и 1 + 2х + 3х2 + 4х3 . Позаботьтесь об экономии операций.*/

public class Quest40 {
    public static void main(String[] args) {
        int x = 2;
        int x2 = x*x;
        int x3 = x*x*x;
        int asnwer1 = x*(-2 + 3*x - 4*x2);
        int answer2 = 1 + 2*x + 3*x2 + 4*x3;
        System.out.println(asnwer1 + " and " + answer2);
    }
}
