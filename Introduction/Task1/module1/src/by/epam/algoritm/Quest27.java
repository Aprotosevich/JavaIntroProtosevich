package by.epam.algoritm;

/*Дано значение a. Не используя никаких функций и никаких операций,
        кроме умножения, получить значение а8 за три операции и  а10 за четыре операции.*/

public class Quest27 {
    public static void main(String[] args) {
        Quest27 quest27 = new Quest27();
        int a = 2;
        System.out.println("Число в восьмой степени: " + quest27.getEightDegree(a));
        System.out.println("Число в десятой степени: " +quest27.getTenDegree(a));
    }

    private int getEightDegree(int a){
        int b2 = a * a;
        int b3 = b2 * b2;
        return b3 * b3;
    }

    private int getTenDegree(int a){
        int b2 = a * a;
        int b3 = b2 * b2;
        int b4 = b3 * b3;
        return b4 * b2;
    }
}
