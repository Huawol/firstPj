package calculatorLv2;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class Calculator {
    // 속성
    int num1;
    int num2;
    char operation;
    int numResult = 0;
    ArrayList<Object> saveLists = new ArrayList<>();


    // 기본 생성자
    Calculator(){}

    // 기능 ( 연산하기 )
    // 연산 메서든 ( 여기서 값 받아오기 )
    int result(int value1, String value2, int value3) {
        this.num1 = value1;
        this.num2 = value3;
        this.operation = value2.charAt(0);
        if (num1 < 0) { // 음수를 양수로 전환
            num1 *= -1;
        }
        if (num2 < 0) {
            num2 *= -1;
        }

        switch (operation){
            case '+' :
                numResult = num1 + num2;
                return numResult;
            case '-':
                numResult = num1 - num2;
                return numResult;
            case '*':
                numResult = num1 * num2;
                return numResult;
            case '/':
                if (num2 == 0) {
                    System.out.println("0으로는 나눌수 없습니다.");
                    break;
                }
                numResult = num1 / num2;
                return numResult;
            default:
                 System.out.println("잘 못 입력된 값이 있습니다.");
                 break;
        }
        return numResult;
    }

    // 결과값 저장 메소드
    void saveResult1(){
        saveLists.add(numResult); // 저장 메소드에서 저장하는 기능만 넣어야함
        // 전에 출력문도 같이 넣었다보니 오류가 발생했음
    }

    // 결과값 삭제 메소드
    private int removeResult(int pick) {
        try { // 삭제 할게 없는데 삭제하려고 하면 오류가 뜨면서 종료되는걸 예외처리함
            if(pick == 0) {
                saveLists.remove(0);
                System.out.println("삭제 되었습니다. 남은 숫자 : " + saveLists);
            }
        }catch (IndexOutOfBoundsException e) {
            System.out.println("더 이상 삭제할게 없습니다.");
        }
        try {
            if (pick != 0) {
                System.out.println("0이 아닌 다른것을 입력하셨습니다.");
            }
        } catch (InputMismatchException ime){
            System.out.println("0이 아닌 다른것을 입력했습니다.");
        }
        return pick;
    }
    // getter - 안전하게 접근
    public int getNumPick(int num1) {
        return this.removeResult(num1);
    }

    // setter - 안전하게 설정 변경
    public void setNumPick(int num1) {
        this.removeResult(num1);
    }




}
