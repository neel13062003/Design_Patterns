package lambdaindp.iterator;
import java.util.Arrays;
import java.util.List;
    public class IteratorTest {
        public static void main(String[] args) {
            List<Integer> numbers=Arrays.asList(1,3,4,6,7,9,10,12,13);
            System.out.println("Access numbers using for each loop, \n\tbut still iterator, i.e., (external iterator)");
            System.out.print("Numbers are ");
            for(int n:numbers){
                System.out.print(n+" ");
            }
            System.out.println("");
        }
    }