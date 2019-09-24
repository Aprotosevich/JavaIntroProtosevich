package by.epam.algoritm;

/* Текущее показание электронных часов: т ч (0 ≤ т ≤23) п мин (0 ≤ п ≤59) к с (0 ≤к ≤59).
         Какое время будут показывать часы через р ч q мин r с?*/

public class Quest32 {
    public static void main(String[] args) {
        Quest32 quest32 = new Quest32();
        Clock clock = new Clock();

        clock.printTime();
        clock.waitFor(23,59,50);
        clock.printTime();
        clock.waitFor(3,0,20);
        clock.printTime();
    }


    private static class Clock {

        private int sec = 0;
        private int min = 0;
        private int hour = 0;

        private void printTime(){

            String hourPrint = hour + "";
            if(hour <= 9){
                hourPrint = "0" + hour;
            }

            String minPrint = min + "";
            if(min <= 9){
                minPrint = "0" + min;
            }

            String secPrint = sec + "";
            if(sec <= 9){
                secPrint = "0" + sec;
            }

            System.out.println("Time: "
                    + hourPrint + ":" +
                    minPrint + ":" +
                    secPrint);
        }

        private void waitFor(int p, int q, int r){
            sec += r;
            if(sec >= 60){
                sec = sec % 60;
                min++;
            }

            min += q;
            if(min >=60){
                min = min % 60;
                hour++;
            }

            hour += p;
            if(hour >= 24){
                hour = hour % 24;
            }
        }

    }
}


