package by.epam.cycle;

public class Quest36 {
    public static void main(String[] args) {
        Quest36 quest36 = new Quest36();

        quest36.printValidNumbers();
    }

    private void printValidNumbers(){
        for(int i = 10; i < 100; i++) {
            for(int j = 10; j < 100; j++){
                int k = Integer.parseInt(i + "" + j);
                if(k % (i*j) == 0){
                    System.out.println("Valid numbers: " + i + " and " + j);
                }
            }
        }
    }
}
