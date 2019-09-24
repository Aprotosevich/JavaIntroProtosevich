package by.epam.branching;

public class Task40 {
    /*Вычислить значение функции:*/
    public static void main(String[] args) {
        Task40 task40 = new Task40();
        int x = 18;

        System.out.println(task40.countFx(x));
    }

    private double countFx (int x) {
        if (x <= 13) return (-(x*x*x) + 9);
        else return ( (- (3/((double)x+1)) ) );
    }
}
