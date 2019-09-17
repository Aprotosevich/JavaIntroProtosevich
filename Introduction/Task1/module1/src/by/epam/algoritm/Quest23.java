package by.epam.algoritm;

public class Quest23 {
    public static void main(String[] args) {
        Quest23 quest23 = new Quest23();
        int a = 10;
        int b = 5;
        System.out.println("Внешний радиус: - " + a);
        System.out.println("Внутренний радиус: - " + b);
        System.out.println(String.format("Площадь кольца: %.2f", quest23.getRingS(a, b)));
    }

    private double getRingS(int a, int b){
        return Math.PI *((a * a) - (b * b));
    }
}
