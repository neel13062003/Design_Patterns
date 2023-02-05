package lambdaindp.iterator;
import java.util.Arrays;
import java.util.List;
    public class LambdaInIterator {
        public static void main(String[] args) {
            List<Integer> numbers=Arrays.asList(1,3,4,6,7,9,10,12,13);
            System.out.println("Access numbers using lambda in iterator, i.e.,(internal iterator)");
            System.out.print("Numbers are ");
            numbers.forEach(no -> System.out.print(no+" "));
            System.out.println("");
        }
    }   