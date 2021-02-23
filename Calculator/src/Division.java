public class Division extends Operation{

    @Override
    public void execute(int first, int second) {
        if (second == 0){
            System.out.println("Деление на ноль, ай-ай-ай");
            return;
        }
        double result = (double) first / second;
        System.out.println("Результат:" + result);
    }
}
