package by.epam.algoritm;

 /*Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
         Поменять местами дробную и целую части числа и вывести полученное значение числа.*/

public class Quest21 {
    public static void main(String[] args) {
        Quest21 quest21 = new Quest21();
        double example = 456.783;
        System.out.println("Новое значение: " + quest21.changeNumbers(example));
    }

    private double changeNumbers(double n){
       String nString = n +"";
       String[] array = nString.split("");
       System.out.println(array.length);
       String newDoubleAsString = array[4] + array[5] + array[6] + array[3] + array[0] + array[1] + array[2];
       // for not RRR.NNN values (e.g. RR.NNNNN) can be done as question 35;
       return Double.parseDouble(newDoubleAsString);
    }
}
