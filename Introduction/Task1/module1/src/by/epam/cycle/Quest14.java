package by.epam.cycle;

import java.util.ArrayList;
import java.util.List;

public class Quest14 {
    public static void main(String[] args) {
        Quest14 quest14 = new Quest14();

        int n = 25;

        System.out.println(String.format("Sum: %.4f", quest14.getSumFromDoubleList(quest14.getArray(n))));

    }

    private double getSumFromDoubleList(List<Double> list){
        return list.stream().mapToDouble(n -> n).sum();
    }

    private List<Double> getArray(int n) {
        List<Double> list = new ArrayList<>(1);
        double a = 1;
        for (int i = 1; i < n; i++) {
            try {
                a = (double)1 / i;
                list.add(i, a);
            } catch (IndexOutOfBoundsException e) {
                list.add(a);
            }
        }
        return list;
    }
}