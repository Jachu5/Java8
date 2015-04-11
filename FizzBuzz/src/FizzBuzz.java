import java.util.Optional;

/**
 * Created by jachu on 11/04/15.
 */
public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public static String fizzBuzzTraditional(int number){

        if (number % 15 == 0){
            return FIZZ+BUZZ;
        }else if (number % 3 == 0){
            return FIZZ;
        }else if (number % 5 == 0){
            return BUZZ;
        }
        return Integer.toString(number);
    }

    public static String fizzBUzzJava8(int number){
        String result = Optional.of(number)
                .map(n->((n % 3 == 0 ? FIZZ:"") + (n % 5 == 0 ? BUZZ:"")))
                .get();
        return result.isEmpty() ? Integer.toString(number) : result;
    }

    public static String fizzBuzzJava8RegularPeople(int number){
        String result = Optional.of(number).map(n -> {
            if (n % 15 == 0) {
                return FIZZ + BUZZ;
            } else if (n % 3 == 0) {
                return FIZZ;
            } else if (n % 5 == 0) {
                return BUZZ;
            } else {
                return Integer.toString(number);
            }
        }).get();
        return result;
    }
}
