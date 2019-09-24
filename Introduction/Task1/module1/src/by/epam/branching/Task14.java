package by.epam.branching;

public class Task14 {

    /*14. Даны два угла треугольника (в градусах).
    Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным. */

    public static void main(String[] args) {
        Task14 task14 = new Task14();
        int a = 5;
        int b = 120;

        if (task14.checkIfTriangleExist(a,b)) {
            System.out.println("Треугольник существует");
            task14.checkAndPrintIfRectangular(a,b);
        }
        else {
            System.out.println("Треугольника не существует");
        }
    }

    private boolean checkIfTriangleExist(int a, int b) {
        if(a + b < 180) return true;
        else return false;
    }

    private void checkAndPrintIfRectangular(int a, int b) {
        if (a == 90 || b == 90 || 180 - a - b == 90){
            System.out.println("Треугольник прямоугольный");
        }
        else System.out.println("Треугольник не прямоугольный");
    }
}
