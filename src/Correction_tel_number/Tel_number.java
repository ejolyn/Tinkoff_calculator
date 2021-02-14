package Correction_tel_number;

public class Tel_number {
    public static void main(String[] args) {
        String test2 = "+   7(234)))5678900";
        String[] tel = tel_number_check(test2);
        System.out.println(tel[0]);
        System.out.println(tel[1]);
    }

    public static String[] tel_number_check(String str)
    {
        String[] result = {str, "Не было изменений"};
        int i = 0;
        while ((i = result[0].indexOf(' ')) != -1)
            result[0] = result[0].substring(0, i) + result[0].substring(i + 1, result[0].length());
        while ((i = result[0].indexOf('(')) != -1)
            result[0] = result[0].substring(0, i) + result[0].substring(i + 1, result[0].length());
        while ((i = result[0].indexOf(')')) != -1)
            result[0] = result[0].substring(0, i) + result[0].substring(i + 1, result[0].length());
        if (!result[0].equals(str)) {
            result[1] = "Заменены пробелы и/или скобки";
            i = -2;
        }
        if (result[0].charAt(0) == '+' && result[0].charAt(1) == '7')
        {
            result[0] = result[0].replace("+7", "8");
            if (i == -2)
                result[1] += "; Замена +7 на 8";
            else
                result[1] = "Замена +7 на 8";
        }
        if (result[0].length() != 11)
            result[0] = "Введен некорректный номер";
        return result;
    }
}
