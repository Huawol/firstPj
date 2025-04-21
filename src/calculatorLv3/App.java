package calculatorLv3;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("숫자 : ");
        int result1 = scanner.nextInt();

        System.out.print("+ - * / : ");
        String result3 = scanner.next();

        System.out.print("숫자 : ");
        int result2 = scanner.nextInt();



        Calculator.Operation operation = Calculator.Operation.selectSymbol(result3);

        double result = operation.math(result1, result2);

        System.out.println("result = " + result);
    }
}
