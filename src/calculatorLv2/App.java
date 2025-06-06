package calculatorLv2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // 내 생각엔 반복문은 메인 안에 만들어야함
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        ResultManagement resultManagement = new ResultManagement();
        int selectNum = 0;
        int calculatorResult = 0 ;
        try {
            while (true) {
                System.out.println("=============================");
                System.out.println(" 1. 계산기 2. 종료  3. 숫자 삭제 ");
                System.out.println("=============================");
                System.out.print("=========== 값을 입력해주세요 : ");
                selectNum = scanner.nextInt();

                switch (selectNum) { // 여기 단계에서 연산자와 두번째 정수를 받은걸로 if문 써서하면 불필요한 코드를 줄일수있다.

                    case 1:
                        System.out.print("첫번째 정수를 입력하세요 : ");
                        int firstNum = scanner.nextInt();
                        System.out.print(" + - * / 중 하나를 선택해주세요 :");
                        String operator = scanner.next();
                        System.out.print("두번째 정수를 입력하세요 : ");
                        int secondNum = scanner.nextInt();
                        calculatorResult = calculator.calculate(firstNum, operator, secondNum);
                        System.out.println("계산 결과 : " + calculatorResult);
                        resultManagement.saveResult(calculatorResult);
                        break;
                    case 2:
                        System.out.print("종료하기 위해서 exit 을 입력해주세요 : ");
                        String exitCommend = scanner.next();
                        if (exitCommend.equals("exit")) {
                            System.out.println("종료되었습니다.");
                            return;
                        }
                        break;

                    case 3: // 삭제 하는 기능에는 삭제 기능만 넣기 // 3번 누르면 바로 삭제됨 추가로 0누르는거 없앰
                        System.out.println(resultManagement.saveList);
                        resultManagement.getRemoveResult();
                        break;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("숫자말고 다른걸 입력했습니다. 다시 시작해주세요");
        }


    }
}
