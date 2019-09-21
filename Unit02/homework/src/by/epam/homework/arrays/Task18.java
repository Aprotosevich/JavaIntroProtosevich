package by.epam.homework.arrays;

import java.util.ArrayList;
import java.util.List;

public class Task18 {
   /* Секретный замок для сейфа состоит из 10 расположенных в ряд ячеек, в которые надо вставить игральные кубики.
   * Но дверь открывается только в том случае, когда в любых трех соседних ячейках сумма точек на передних гранях
   * кубиков равна 10. (Кубик имеет на каждой грани от 1 до 6 точек) Напишите программу, которая разгадывает код замка
   * при условии, что два кубика уже вставлены в ячейки. */
   public static void main(String[] args) {
       Cube cube = new Cube();


   }

   List<Cube> lock = new ArrayList<>(10);

   private static class Cube {
       int points;

       void roll() {
           points = (int)((Math.random()*6)+1);
       }
   }
}
