public class Multiplication extends Operation {

    @Override
    public void execute(int first, int second) {
        long result = (long)first * second;
        System.out.println("Результат:" + result);
    }
}
