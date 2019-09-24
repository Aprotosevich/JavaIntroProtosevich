package by.epam.algoritm;

/* Составить программу для вычисления пути, пройденного лодкой, если ее скорость в стоячей воде v км/ч,
         скорость течения реки v1 км/ч, время движения по озеру t1 ч, а против течения реки — t2 ч.*/

public class Quest31 {
    public static void main(String[] args) {
        Quest31 quest31 = new Quest31();

        int totalDistance = quest31.countDistanceOnLake(10, 5)
                + quest31.countDistanceOnRiver(2, 8, 10);

        System.out.println("Total distance: " + totalDistance);
    }

    private int countDistanceOnLake(int vLake, int tLake){
        return vLake * tLake;
    }

    private int countDistanceOnRiver(int riverSpeed, int tRiver, int vLake){
        return (vLake - riverSpeed) * tRiver;
    }
}
