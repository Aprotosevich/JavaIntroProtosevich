package by.epam.algoritm;

public class Quest27 {
    public static void main(String[] args) {
        Quest27 quest27 = new Quest27();
        int a = 2;
        System.out.println("Число в восьмой степени: " + quest27.getEightDegree(a));
        System.out.println("Число в десятой степени: " +quest27.getTenDegree(a));
    }

    private int getEightDegree(int a){
        int bb = a * a;
        int bbb = bb * bb;
        return bbb * bbb;
    }

    private int getTenDegree(int a){
        int bb = a * a; // 2
        int bbb = bb * bb; // 4
        int bbbb = bbb * bbb; // 8
        return bbbb * bb;
    }
}
