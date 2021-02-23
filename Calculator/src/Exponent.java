import java.sql.PreparedStatement;

public class Exponent extends Operation{

    @Override
    public void execute(int first, int second) {
        if (second < 0){
            System.out.println("Возведение в отрицательную степень не поддерживается");
            return;
        }
        long result = first;
        if (second == 0)
            result = 1;
        while (second-- > 1)
            result = result * first;
        System.out.println("Результат:" + result);
    }
}
