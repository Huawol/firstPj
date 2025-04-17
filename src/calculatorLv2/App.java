package calculatorLv2;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // 내 생각엔 반복문을 메인 안에 만들어야함
        //
        Scanner scanner = new Scanner(System.in);
        int selectNum = 0;
        String exitCommend;
        ArrayList<Object> saveResult = new ArrayList<>();


        while (true) {
            System.out.println("=============================");
            System.out.println(" 1. 계산기 2. 종료  3. 숫자 삭제 ");
            System.out.println("=============================");
            System.out.print("=========== 값을 입력해주세요 : ");
            selectNum = scanner.nextInt();

            if (selectNum == 1) {
                // 입력란
                System.out.print("첫번째 정수를 입력하세요 : ");
                int firstNum = scanner.nextInt();
                System.out.print("연산자를 입력하세요 : ");
                String oper = scanner.next();
                System.out.print("두번째 정수를 입력하세요 : ");
                int secondNum = scanner.nextInt();

                // 결과 계산되서 출력디는 란
                Calculator ca = new Calculator(firstNum,oper,secondNum);
                System.out.println("결과값은 : " + ca.result());

                // 결과값 계속 배열로 축적
                saveResult.add(ca.result());

            } else if (selectNum == 2) {
                System.out.print("종료하기 위해서 exit 을 입력해주세요 : ");
                exitCommend = scanner.next();
                if(exitCommend.equals("exit")){
                    System.out.println("종료되었습니다.");
                    return;
                }
            } else if (selectNum == 3) {
                System.out.println("저장 된 숫자: " + saveResult);
                System.out.print("가장 오래된 값을 지우려면 숫자 0을 입력해주세요 : ");
                int pick = scanner.nextInt();
                //removeResult(pick);
                // getter 로 받아야할듯
            }
        }
    }
}
