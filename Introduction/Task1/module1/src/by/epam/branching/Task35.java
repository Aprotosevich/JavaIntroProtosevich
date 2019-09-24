package by.epam.branching;

/* Вычислить число и месяц в невисокосном году по номеру дня. */

public class Task35 {

    public static void main(String[] args) {
        Task35 task35 = new Task35();
        int a = 136;

        System.out.println(task35.getMonthAndDayNum(a));
    }

    private String getMonthAndDayNum(int a) {
        if(a > 0 && a <= 31) {
            return (a + " Января");
        }
        else if (a > 31 && a <= 59) {
            return (a - 31 + " Февраля");
        }
        else if(a > 59 && a <= 90) {
            return (a - 59 + " Марта");
        }
        else if(a > 90 && a <= 120) {
            return (a - 90 + " Апреля");
        }
        else if(a > 120 && a <= 151) {
            return (a - 120 + " Мая");
        }
        else if(a > 151 && a <= 181) {
            return (a - 151 + " Июня");
        }
        else if(a > 181 && a <= 212) {
            return (a - 181 + " Июля");
        }
        else if(a > 212 && a <= 243) {
            return (a - 212 + " Августа");
        }
        else if(a > 243 && a <= 273) {
            return (a - 243 + " Сентября");
        }
        else if(a > 273 && a <= 304) {
            return (a - 273 + " Октября");
        }
        else if(a > 304 && a <= 334) {
            return (a - 304 + " Ноября");
        }
        else if(a > 334 && a <= 365) {
            return (a - 334 + " Декабря");
        }
        else return ("Ошибка!");
    }
}
