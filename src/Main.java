import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	NumberConverterManager numberConverterManager = new NumberConverterManager();
    	Scanner myScanner = new Scanner(System.in);
    	System.out.print("Input a number (0-100000): ");
    	int number = myScanner.nextInt();
    	
    	
        System.out.println(number + "  >>>  " + numberConverterManager.convertToWords(number));
    }
}