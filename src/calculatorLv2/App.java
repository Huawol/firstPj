package calculatorLv2;

import java.util.ArrayList;
import java.util.Scanner;

public class App{

    public static void main(String[] args) {
        // 내 생각엔 반복문을 메인 안에 만들어야함
        //
        Scanner scanner = new Scanner(System.in);
        int selectNum = 0;
        String exitCommend;
        Calculator ca = new Calculator();
        /*ArrayList<Object> saveResult = new ArrayList<>();*/

        while (true) {
            System.out.println("=============================");
            System.out.println(" 1. 계산기 2. 종료  3. 숫자 삭제 ");
            System.out.println("=============================");
            System.out.print("=========== 값을 입력해주세요 : ");
            selectNum = scanner.nextInt();

            switch (selectNum) {
                case 1 :
                    System.out.print("첫번째 정수를 입력하세요 : ");
                    int firstNum = scanner.nextInt();
                    System.out.print("연산자를 입력하세요 : ");
                    String oper = scanner.next();
                    System.out.print("두번째 정수를 입력하세요 : ");
                    int secondNum = scanner.nextInt();
                    System.out.println("계산 결과 : " + (ca.result(firstNum,oper,secondNum)));
                    ca.saveResult1();
                    break;

                case 2:
                    System.out.print("종료하기 위해서 exit 을 입력해주세요 : ");
                    exitCommend = scanner.next();
                    if(exitCommend.equals("exit")){
                        System.out.println("종료되었습니다.");
                        return;
                    } break;

                case 3: // 삭제 하는 기능에는 삭제 기능만 넣기
                    System.out.println(ca.saveLists);
                    System.out.print("가장 오래된 값을 지우려면 숫자 0을 입력해주세요 : ");
                    int pick = scanner.nextInt();
                    ca.getNumPick(pick);
                    break;
            }
        }
    }
}
