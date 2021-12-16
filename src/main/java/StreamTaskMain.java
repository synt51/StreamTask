import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTaskMain {


    public static void main(String[] args) throws IOException {

        int[] zahlen = {9, 1, 8, 2, 7, 3, 6, 4, 5};

        IntStream streamSort = Arrays.stream(zahlen).sorted();

        streamSort.forEach((str -> System.out.println(str + " ")));

        int streamSum = Arrays.stream(zahlen).sum();

        System.out.println("Sum is: " + streamSum);

        int streamProd = Arrays.stream(zahlen).reduce(1, (x, y) -> x * y);

        System.out.println("Product is: " + streamProd);


        String fileName = "/Users/heinzschlomer/Downloads/students.csv";
        List<Student> students = new ArrayList<>(); //"/Users/heinzschlomer/Downloads/students.csv"

        try (Stream<String> stream = Files.lines(Path.of("/Users/heinzschlomer/Downloads/students.csv"))) {


            students = stream.skip(1)                     // delete the headline
                    .filter(line -> !line.isEmpty())      // filter invalid lines (blanks)
                    .distinct()                           // delete duplicates
                    .map(line -> line.split(","))   // convert each line to Student class
                    .map(values -> new Student(Integer.parseInt(values[0]),values[1],Integer.parseInt(values[2]),Integer.parseInt(values[3])))
                    .collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }

        students.forEach(System.out::println);

    }


}
