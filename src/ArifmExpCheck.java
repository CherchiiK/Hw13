import java.util.Random;

public class ArifmExpCheck {
    public static void ArrayTryCatch(double[] a) throws ArithmeticException, ArrayIndexOutOfBoundsException {
        double firstNumber, secondNumber, result = 0.0;

        firstNumber = new Random().nextInt(a.length);
        secondNumber = new Random().nextInt(a.length);
        System.out.println(firstNumber + " " + secondNumber);
        try {
            if (secondNumber == 0.0){
                throw new DivideByZeroException();
            }
            result = firstNumber / secondNumber;
        } catch (ArrayIndexOutOfBoundsException ex) {
            firstNumber = new Random().nextInt(a.length);
            secondNumber = new Random().nextInt(a.length);
        } catch (DivideByZeroException ex) {
            System.out.println("Divide by zero");
        }
    }
}

