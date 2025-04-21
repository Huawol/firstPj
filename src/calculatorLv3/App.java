package calculatorLv3;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Calculator calculator = new Calculator(Calculator.Operation.MULTI);
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자 : ");
        int result1 = scanner.nextInt();
        System.out.print("숫자 : ");
        int result2 = scanner.nextInt();
        double result = calculator.getType(result1,result2);
        System.out.println("result = " + result);
    }
}
