public class Main {

    public static void main(String[] args) {
        OddOccurrencesCalculator calculator = new OddOccurrencesCalculator();

        int result = calculator.calculate(new int[]{1, 2, 2, 4, 3});
        System.out.println(result);

    }
}

