//package mathoperationwithlambda;

@FunctionalInterface
public interface MathOperation{
    int operation(int a, int b);

}

public abstract class Test implements MathOperation {
    public static void main(String[] args) {
        MathOperation addition= (int a, int b)-> a+b;
        MathOperation subtraction = (int a, int b)-> a-b;
        MathOperation multiplication= (int  a, int b)-> {return a*b;};
        MathOperation division = (int a, int b) -> {
            if (b == 0) {
                System.out.println("Cannot divide by zero.");
                return 0;
            }
            return a / b;
        };
        System.out.println("10 + 25 = " + operate(10, 25, addition));
        System.out.println("10 - 25 = " + operate(10, 25, subtraction));
        System.out.println("10 * 25 = " + operate(10, 25, multiplication));
        System.out.println("10 / 25 = " + operate(10, 25, division));
    }
    static private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }
} 


/*
Output:
10 + 25 = 35
10 - 25 = -15
10 * 25 = 250
10 / 25 = 0
Cannot divide by zero.

*/ 
