package mathoperationwithlambda;
    public class Test implements MathOperation {
        public static void main(String[] args) {
            MathOperation addition= (int a, int b)-> a+b;
            MathOperation subtraction= (int a, int b)-> a-b;
            MathOperation multiplication= (int a, int b)-> {return a*b;};
            MathOperation division= (int a, int b)-> a/b;
            System.out.println("10 + 25 = "+operate(10, 25, addition));
            System.out.println("10 - 25 = "+operate(10, 25, subtraction));
            System.out.println("10 * 25 = "+operate(10, 25, multiplication));
            System.out.println("10 / 25 = "+operate(10, 25, division));
        }
        static private int operate(int a, int b, MathOperation mathOperation){
            return mathOperation.operation(a, b);
        }
    } 