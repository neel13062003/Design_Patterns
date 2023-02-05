// package lambdaindp.strategy;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
public class LambdaInStrategy {
    public static int totalNumbers(List<Integer> numbers, Predicate<Integer> selector){
        int result=0;
        for(int no:numbers){
            if(selector.test(no))
                result +=no;
        }
        return result;
    }
    public static void main(String[] args) {
        List<Integer> numbers=Arrays.asList(1,3,4,6,7,9,10,12,13);
        System.out.print("Total of the numbers is "+totalNumbers(numbers, no -> true));
        System.out.println("");
        System.out.print("Total of the Even numbers is "+totalNumbers(numbers, no -> no%2==0));
        System.out.println("");
        System.out.print("Total of the Odd numbers is "+totalNumbers(numbers, no -> no%2!=0));
        System.out.println("");
    }
}