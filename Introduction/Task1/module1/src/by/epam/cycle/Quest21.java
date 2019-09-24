package by.epam.cycle;

/* Составить программу для вычисления значений функции  F(x) на отрезке [а, b] с шагом h.
         Результат представить в виде таблицы, первый столбец которой – значения  аргумента,
         второй - соответствующие значения функции:  */

public class Quest21 {
    public static void main(String[] args) {
        Quest21 quest21 = new Quest21();
        quest21.printFxFromAtoB(2,10,2);
    }

    private static double countFx(int x){
        return x - Math.sin(x);
    }

    private void printFxFromAtoB(int a, int b, int h){
        for(int i = a; i < b; i += h){
            System.out.println("X:" + i + " | F(x): " + String.format("%.4f",countFx(i)));
        }
    }
}
