package by.epam.algoritm;

/*Найти площадь треугольника, две стороны которого равны а и b, а угол между этими сторонами у.*/

public class Quest26 {
    public static void main(String[] args) {
        Quest26 quest26 = new Quest26();

        System.out.println("S: " + quest26.getS(150,231,Math.toRadians(123)));
    }

    private double getS(int a, int b, double y){
        return (((double)(a * b)) / 2) * Math.sin(y);
    }
}
