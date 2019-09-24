package by.epam.cycle;

/* Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера (Таблицу ASCII).*/

public class Quest26 {
    public static void main(String[] args) {
        for(int i = 32; i <= 255; i++){
            System.out.println("Symbol: " + (char)i + " | Number: " + i);
        }
    }
}