package by.epam.algoritm;

/* Дана сторона равностороннего треугольника.
Найти площадь этого треугольника, его высоту, радиусы вписанной и описанной окружностей.*/

public class Quest19 {
    public static void main(String[] args) {
        Quest19 quest19 = new Quest19();
        int line = 3;
        System.out.println("Сторона треугольника: " + line);
        System.out.println(String.format("Площадь треугольника: %.3f", quest19.getS(line)));
        System.out.println(String.format("Высота треугольника: %.3f", quest19.getH(line)));
        System.out.println(String.format("Радиус вписанной окружности: %.3f", quest19.getRIn(line)));
        System.out.println(String.format("Радиус описаной окружности: %.3f", quest19.getROut(line)));

    }

    private double getS(int a){
        return a*a * Math.sqrt(3) / 4;
    }

    private double getH(int a){
        return a * Math.sqrt(3) / 2;
    }

    private double getRIn(int a){
        return Math.sqrt(3)/6 * a;
    }

    private double getROut(int a){
        return Math.sqrt(3)/3 * a;
    }
}
