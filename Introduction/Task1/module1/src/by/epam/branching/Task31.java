package by.epam.branching;

import javafx.concurrent.Task;

public class Task31 {
    /*Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
    Определить, пройдет ли кирпич через отверстие.*/
    public static void main(String[] args) {
        int a = 15;
        int b = 20;

        Brick brick = new Brick(5,5,35);
        brick.printIfCanPass(a, b);
    }

    private static class Brick {
        private int x;
        private int y;
        private int z;

        private Brick (int a, int b, int c) {
            x = a;
            y = b;
            z = c;
        }

        private void printIfCanPass(int a, int b) {
            if (canPass(a, b)){
                System.out.println("Может пройти");
            }
            else System.out.println("Не может пройти");
        }

        private boolean canPass(int a, int b) {
            if (x < a && y < b){
                return true;
            }
            else if (y < a && z < b) {
                return true;
            }
            else if (x < b && z < a) {
                return true;
            }
            else return false;
        }

    }
}
