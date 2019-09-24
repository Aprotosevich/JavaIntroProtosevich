package by.epam.cycle;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Проверить введенную пользователем строку на наличие недопустимых символов. В качестве первого символа допустимы
        только буквы и знак подчеркивания. Остальные символы могут быть буквами, цифрами и знаком подчеркивания.*/

public class Quest32 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = "vhhiigk__kg";
        String input2 = "vksg245_gsa2__";
        String input3 = "sglk>>??K";

        Pattern pattern = Pattern.compile("[\\w_]{1}[\\w\\d_]+");
        Matcher matcher = pattern.matcher(input3);
        System.out.println(matcher.matches());
    }
}
