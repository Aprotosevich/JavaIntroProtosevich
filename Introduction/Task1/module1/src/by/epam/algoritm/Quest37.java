package by.epam.algoritm;

public class Quest37 {
    public static void main(String[] args) throws Exception{
        Quest37 quest37 = new Quest37();
        System.out.println(quest37.isValidForTask(10,44, 5, 50));
        System.out.println(quest37.isValidForTask(10, 44, 11, 15));

        System.out.println(quest37.isNumeralADegree(1, 5)); // 5 в степени 0 = 1
        System.out.println(quest37.isNumeralADegree(2,8)); // 8 ни в какой степени не будет равно 2
        System.out.println(quest37.isNumeralADegree(8, 2)); // 8 это два в 3 степени
    }

    // проверить лежит ли точка с координатами x/y на плоскости, лежащей между прямыми x = m; x = n; (m < n);
    private boolean isValidForTask(int x, int y, int m, int n) throws Exception{
        if(m >= n){
            throw new Exception("Check please the Task. 'm' must be less n");
        }
        if(x > m && x < n){
            return true;
        }
        else return false;
    }

    // проверить является ли число N степенью числа a, показатель степени от 0 до 4
    private boolean isNumeralADegree(int N, int a){ // 8, 10
        if(N == 1) return true;
        if(a > N) return false;
        if(a*a == N || a*a*a == N || a*a*a*a == N){
            return true;
        }
        else return false;
    }

}
