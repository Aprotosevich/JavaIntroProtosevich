package by.epam.algoritm;

public class Quest32 {
    public static void main(String[] args) {
        Quest32 quest32 = new Quest32();
        oClock oClock = new oClock();

        oClock.printTime();
        oClock.waitFor(23,59,50);
        oClock.printTime();
        oClock.waitFor(3,0,20);
        oClock.printTime();
    }


    private static class oClock{

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


