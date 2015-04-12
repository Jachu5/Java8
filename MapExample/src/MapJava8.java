import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by alfredocerezoluna on 12/04/15.
 */
public class MapJava8 {

    public static void main(String args[]){


    }

    public static List<Integer> powerTest(Integer[] values){
        List<Integer> numbers = Arrays.asList(values);
        List<Integer> result = numbers.stream().map(n->(n*n)).collect(Collectors.toList());

        return result;
    }
}
