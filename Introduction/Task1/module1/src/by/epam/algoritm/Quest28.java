package by.epam.algoritm;

public class Quest28 {
    public static void main(String[] args) {
        int radian = 1;
        Quest28 quest28 = new Quest28();
        quest28.printRadToGrad(1);
        quest28.printRadToGrad(2);
    }

    public void printRadToGrad(int radian){

        double grade = (180/Math.PI) * radian;
        double min = ((grade % 1) * 60);
        double sec = Math.round((min % 1) * 60);

        System.out.println(radian + " радиан - это " + (int)grade + " градусов " + (int)min + " минут и "
        + (int)sec + " секунд");
    }

}
