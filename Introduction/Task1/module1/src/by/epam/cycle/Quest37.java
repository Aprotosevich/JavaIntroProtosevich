package by.epam.cycle;

/*Даны два двузначных числа А и В. Из этих чисел составили 2 четырехзначных числа: первое число получили
        путем написания сначала числа А, затем В. Для получения второго числа сначала записали число В, затем А.
        Найти числа А и В если известно , что первое четырехзначное число нацело делится на 99, а второе на 49*/

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
