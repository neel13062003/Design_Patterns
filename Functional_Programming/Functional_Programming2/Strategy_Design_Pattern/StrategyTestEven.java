package lambdaindp.strategy;
import java.util.Arrays;
import java.util.List;
public class StrategyTestEven {
    public static void main(String[] args) {
        List<Integer> numbers=Arrays.asList(1,3,4,6,7,9,10,12,13);
        System.out.print("Total of the numbers is "+totalNumbers(numbers));
        System.out.println("");
        System.out.print("Total of the Even numbers is "+totalEvenNumbers(numbers));
        System.out.println("");
    }
    public static int totalNumbers(List<Integer> numbers){
        int result=0;
        for(int no:numbers){
            result +=no;
        }
        return result;
    }
    public static int totalEvenNumbers(List<Integer> numbers){
        int result=0;
        for(int no:numbers){
            if(no % 2==0)
                result +=no;
        }
        return result;
    }
}