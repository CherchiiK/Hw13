import java.util.Random;

public class Main {

    static String firstString = "asD";
    static String secondString = "bgD";
    static double[] myArr = new double[100];

    public static void main(String[] args) {
        for (double i : myArr) {
            i = new Random().nextInt(myArr.length);
        }
        IllArgExeptCheck.StringExptnCheck(firstString, secondString);
        ArifmExpCheck.ArrayTryCatch(myArr);
    }
}
