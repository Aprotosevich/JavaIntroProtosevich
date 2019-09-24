package by.epam.algoritm;

/*Известна длина окружности. Найти площадь круга, ограниченного этой окружностью.*/

public class Quest20 {

    public static void main(String[] args) {
        Quest20 quest20 = new Quest20();
        System.out.println(quest20.getS(4));
    }

    private double getS(int l){
        return (l * l) / (4 * Math.PI);
    }

}
