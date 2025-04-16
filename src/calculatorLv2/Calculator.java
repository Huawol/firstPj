package calculatorLv2;

import java.util.ArrayList;

public class Calculator {
    // 속성
    int num1;
    int num2;
    char operation;
    int numResult = 0;
    /*ArrayList<Object> saveResult = new ArrayList<>();*/

    // 생성자 (값 받아오기)
    Calculator(int value1, String value2, int value3) {
        this.num1 = value1;
        this.num2 = value3;
        this.operation = value2.charAt(0); // char 형으로 변환

    }

    // 기능 ( 연산하기 )
    // 연산 메서든
    int result(){

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
        }
        return numResult;
    }

    // 결과값 저장 메서드
    /*int save() {
        saveResult.add(numResult);
    }*/







    // getter

    // setter
    /*void setOperation(String operation) {
        this.operation = operation.charAt(0);
    }*/




}
