public class Subtraction extends Operation {

    @Override
    public void execute(int first, int second) {
        int result = first - second;
        System.out.println("Результат:" + result);
    }
}
