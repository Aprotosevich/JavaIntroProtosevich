package by.epam.algoritm;

public class Quest6 {
    public static void main(String[] args) {
        Quest6 quest6 = new Quest6();
        System.out.println(quest6.getMBuckets(1));
        System.out.println(quest6.getMBuckets(2));
        System.out.println(quest6.getMBuckets(3));
        System.out.println(quest6.getMBuckets(9));
    }

    private String getMBuckets(int n){
        double capacity = 80 / n;
        double mCapacity = (capacity+12) * n;
        return String.format("При " + n + " малых бидонах, в m больших бидонах - %.2f литров", mCapacity) ;
    }
}
