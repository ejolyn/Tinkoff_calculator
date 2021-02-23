import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Для выхода из программы введите 'exit'");
            System.out.println("При вводе отрицательных чисел не заключайте их в скобки");
            System.out.println("Для работы введите выражение в формате a(операция)b (без пробелов): ");
            String str = scan.nextLine();
            str = str.trim();
            if (str.equals("exit"))
                break;
            char[] ch_arr = str.toCharArray();
            int i = 0;
            if (ch_arr[i] == '-')
                i++;
            while (ch_arr[i] >= '0' && ch_arr[i] <= '9')
                i++;
            if (i == 0 || (ch_arr[i] != '+' && ch_arr[i] != '-'
                    && ch_arr[i] != '*' && ch_arr[i] != '/' && ch_arr[i] != '^')) {
                System.out.println("Ошибочный ввод");
                continue;
            }
            String first = str.substring(0, i);
            int max = Integer.MAX_VALUE;
            if (first.length() >= 10 && first.compareTo(Integer.toString(max)) > 0) {
                System.out.println("Слишком большое число");
                continue;
            }
            int j = i + 1;
            if (ch_arr[j] == '-')
                j++;
            while (j < str.length() && ch_arr[j] >= '0' && ch_arr[j] <= '9')
                j++;
            if (j == i + 1 || j != str.length()){
                System.out.println("Ошибочный ввод");
                continue;
            }
            String second = str.substring(i + 1);
            if (second.length() >= 10 && second.compareTo(Integer.toString(max)) > 0) {
                System.out.println("Слишком большое число");
                continue;
            }
            if (ch_arr[i] == '+'){
                Addition addition = new Addition();
                addition.execute(Integer.parseInt(first), Integer.parseInt(second));
            }
            else if (ch_arr[i] == '-'){
                Subtraction subtraction = new Subtraction();
                subtraction.execute(Integer.parseInt(first), Integer.parseInt(second));
            }
            else if (ch_arr[i] == '*'){
                Multiplication multiplication = new Multiplication();
                multiplication.execute(Integer.parseInt(first), Integer.parseInt(second));
            }
            else if (ch_arr[i] == '/'){
                Division division = new Division();
                division.execute(Integer.parseInt(first), Integer.parseInt(second));
            }
            else if (ch_arr[i] == '^'){
                Exponent exponent = new Exponent();
                exponent.execute(Integer.parseInt(first), Integer.parseInt(second));
            }
        }
    }
}
