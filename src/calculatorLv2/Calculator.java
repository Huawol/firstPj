package calculatorLv2;

public class Calculator {
    // 속성
    int num1;
    int num2;
    char operation;

    // 생성자 (값 받아오기)
    Calculator(int value1, String value2, int value3) {
        this.num1 = value1;
        this.num2 = value3;
        this.operation = value2.charAt(0); // char 형으로 변환

    }

    // 기능 ( 연산하기 )
    int result(){
        int numResult = 0;
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

    // getter

    // setter
    /*void setOperation(String operation) {
        this.operation = operation.charAt(0);
    }*/




}
