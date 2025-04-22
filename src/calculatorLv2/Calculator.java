package calculatorLv2;

import java.util.ArrayList;
import java.util.List;

// public 이나  private 사용하기
public class Calculator {
    // 속성

    // 계산기 기능에서는 딱히 필요가 없음 멀티 쓰레드 발생시 원하는 결과값이 나오지 않을수 있음
    // 만약 이용하고 싶으면 메인에 있는 ca를 반복문 안으로 넣고 계산기가 계속 만들어지도록 설정을 해야함
    //

    private int calculatorResult = 0;
    public List<Integer> saveList = new ArrayList();
    // 숫자를 저장하기때문에 배열타입을 Interger로만 해도 충분
    // Object 는 불필요한 공간을 만듬 그러니까 필요한 공간만 사용할수 있도록 타입 설정해주기
    // 리스트에 s 붙이면 복수형이 되니까 리스트 안에 리스트 넣을꺼 아니면 사용하지 않기

    // 기본 생성자 꼭필요할때는 명시적으로 작성하는게 좋다.
    Calculator() {
    }

    // 기능 ( 연산하기 )
    // 연산 메서든 ( 여기서 값 받아오기 ) 이름을 동사로 바꿔야한다..
    public int calculate(int firstNum, String calculatorOperator, int secondNum) {
        /*this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.operator = calculatorOperator.charAt(0);*/
        // 주석을 해제해서 사용해도 별문제는 없긴한데 멀티 쓰레드 발생한다는 가정을 하면
        // 값이 변경되서 출력 될수있음

        if (firstNum < 0) { // 음수를 양수로 전환
            firstNum *= -1;
        }
        if (secondNum < 0) {
            secondNum *= -1;
        }

        switch (calculatorOperator) { // 오직 계산기능만 들어감
            case "+":
                calculatorResult = firstNum + secondNum;
                return calculatorResult;
            case "-":
                calculatorResult = firstNum - secondNum;
                return calculatorResult;
            case "*":
                calculatorResult = firstNum * secondNum;
                return calculatorResult;
            case "/":
                if(calculatorOperator.equals("/") && secondNum == 0){
                    System.out.println(" 0 으로 나눌수 없습니다. ");
                    break;
                }
                calculatorResult = firstNum / secondNum;
                return calculatorResult;
            default:
                System.out.println("잘 못 입력된 값이 있습니다.");
                break;
        }
        return calculatorResult;
    }

    // 결과값 저장 메소드
    public void saveResult() {
        saveList.add(calculatorResult); // 저장 메소드에서 저장하는 기능만 넣어야함
        // 전에 출력문도 같이 넣었다보니 오류가 발생했음
    }

    // 결과값 삭제 메소드  0을 굳이 받을 필요는 없다.
    private void removeResult() {
        try {
            saveList.remove(0);
            System.out.println("삭제 되었습니다. 남은 숫자 : " + saveList);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("더 이상 삭제할게 없습니다.");
        }
    }

    // getter - 안전하게 접근 // 삭제버튼 접근 제한,
    public void getRemoveResult() {
        removeResult();
    }
}
