import java.util.Scanner;

public class ScannerHelper {


    /**
     * Second this class
     *
     * Create Three methods which will take String question
     * it will print the question, and it will take
     * String, int, double
     *
     * getString(String question)
     * getInt(String question)
     * getDouble(String question)
     */

    // Create a method which will create and return scanner object

    public static Scanner scan(){
        return new Scanner(System.in);
    }
    public static String getString(String question){
        System.out.println(question);
        return scan().nextLine();
    }

    public static int getInt(String question){
        System.out.println(question);
        return scan().nextInt();
    }

    public static double getDouble(String question){
        System.out.println(question);
        return scan().nextDouble();
    }

}
