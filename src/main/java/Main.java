import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        List<Double> listWithNumbers;
        List<Double> resultList = new ArrayList<>();
        Calculator calc = new CalculatorImpl();

        listWithNumbers = calc.convertToDouble(calc.readFromFile("src\\main\\resources\\input.txt"));
        resultList.add(calc.addUpAllNumbers(listWithNumbers));
        resultList.add(calc.multiplyAllNumbers(listWithNumbers));
        calc.writeToFile(resultList);
        System.out.println(System.currentTimeMillis() - time);
    }
}
