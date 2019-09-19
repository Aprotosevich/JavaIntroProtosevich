package by.epam.cycle;

public class Quest37 {
    public static void main(String[] args) {
        Quest37 quest37 = new Quest37();

        quest37.printValidNumbers();
    }

    private void printValidNumbers() {
        for(int i = 10; i < 100; i++){
            for(int j = 10; j < 100; j++){
                if(isPairValid(i,j)) {
                System.out.println("Valid pair: " + i + " and " + j);
                }
            }
        }
    }

    private boolean isPairValid(int a, int b){
        int k = Integer.parseInt(a + "" + b);
        int g = Integer.parseInt(b + "" + a);

        return (k % 99 == 0) && (g % 49 == 0);
    }
}
