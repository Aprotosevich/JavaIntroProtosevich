package by.epam.algoritm;

/* Дано действительное число х. Не пользуясь никакими другими арифметическими операциями,
         кроме умножения, сложения и вычитания, вычислите за минимальное число операций: 2x4 - 3х3 + 4х2 - 5х + 6.*/

public class Quest39 {
    public static void main(String[] args) {
        int x = 2;
        int x3 = x*x*x;
        int answer = x3*(2*x - 3) + x*(4*x - 5) + 6;
        System.out.println(answer);
    }
}
