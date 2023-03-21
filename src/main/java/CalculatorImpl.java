import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CalculatorImpl implements Calculator {

    @Override
    public List<String> readFromFile(String fileName) {
        List<String> stringList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            String line = reader.readLine();
            while (line != null) {
                stringList.add(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    @Override
    public List<Double> convertToDouble(List<String> stringList) {
        return stringList.stream().map(Double::valueOf).collect(Collectors.toList());
    }

    @Override
    public Double addUpAllNumbers(List<Double> doubleList) {
        return doubleList.stream().mapToDouble(Double::doubleValue).sum();
    }

    @Override
    public Double multiplyAllNumbers(List<Double> doubleList) {
        return doubleList.stream().reduce((x, y) -> x * y).get();
    }

    @Override
    public void writeToFile(List<Double> doubleList) {

        try (FileWriter writer = new FileWriter(
                "../testProject1//src//main//resources//output.txt")) {
            for (Double num : doubleList) {
                writer.write(num + "\n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}