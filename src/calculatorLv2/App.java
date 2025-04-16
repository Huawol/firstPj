package calculatorLv2;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // 내 생각엔 반복문을 메인 안에 만들어야함
        //
        Scanner scanner = new Scanner(System.in);
        int selectNum = 0;
        String exitCommend;



        while (true) {
            System.out.println("=============================");
            System.out.println("1. 계산기              2. 종료 ");
            System.out.println("=============================");
            selectNum = scanner.nextInt();
            if (selectNum == 1) {
                System.out.print("첫번째 정수를 입력하세요 : ");
                int firstNum = scanner.nextInt();
                System.out.print("연산자를 입력하세요 : ");
                String oper = scanner.next();
                System.out.print("두번째 정수를 입력하세요 : ");
                int secondNum = scanner.nextInt();
                Calculator ca = new Calculator(firstNum,oper,secondNum);
                System.out.println(ca.result());
            } else if (selectNum == 2) {
                System.out.print("종료하기 위해서 exit 을 입력해주세요 : ");
                exitCommend = scanner.next();
                if(exitCommend.equals("exit")){
                    System.out.println("종료되었습니다.");
                    return;
                }
            }
        }
    }
}
