import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by alfredocerezoluna on 12/04/15.
 */
public class MapJava8 {

    public static List<Integer> powerTest(Integer[] values){
        List<Integer> numbers = Arrays.asList(values);

        return numbers.stream().map(n->(n*n)).collect(Collectors.toList());
    }

    public static List<String> toUpperCase(List<String> values){
        return values.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}
