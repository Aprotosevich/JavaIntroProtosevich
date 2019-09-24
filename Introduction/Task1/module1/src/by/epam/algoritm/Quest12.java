package by.epam.algoritm;

/*Вычислить расстояние между двумя точками с данными координатами (х1, у1)и (x2, у2).*/

public class Quest12 {

    public static void main(String[] args) {
        Quest12 quest12 = new Quest12();
        System.out.println(quest12.getDistanceBetweenMarks(-2.3, 4, 8.5, 0.7));
        System.out.println(quest12.getDistanceBetweenMarks(1,1 ,2,2 ));
    }

    private double getDistanceBetweenMarks(double xx, double xy, double yx, double yy){
        return Math.sqrt( (yx - xx)*(yx - xx) + (yy - xy)*(yy - xy));
    }
}
