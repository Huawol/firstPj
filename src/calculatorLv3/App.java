package calculatorLv3;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("숫자 : ");
        int firstNum = scanner.nextInt();

        System.out.print("+ - * / : ");
        String type = scanner.next();

        System.out.print("숫자 : ");
        int secondNum = scanner.nextInt();



        Calcul operation = Calcul.selectSymbol(type);

        double result = operation.math(firstNum, secondNum);

        System.out.println("result = " + result);

    }
}
