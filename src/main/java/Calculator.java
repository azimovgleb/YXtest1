import java.util.List;

public interface Calculator {

    List<String> readFromFile(String fileName);

    List<Double> convertToDouble(List<String> stringList);

    Double addUpAllNumbers(List<Double> doubleList);

    Double multiplyAllNumbers(List<Double> doubleList);

    void writeToFile(List<Double> doubleList);
}
