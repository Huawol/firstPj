import java.util.Scanner;

public class CalLv1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("첫번째 숫자를 입력해주세요 : ");
            int num1= scanner.nextInt();

            System.out.print("두번째 숫자를 입력해주세요 : ");
            int num2 = scanner.nextInt();
            if(num2 == 0){
                System.out.println("0 을 제외한 숫자를 입력해주세요");
            }

            System.out.print("어떤 사칙 연산을 하실건가요? : ");
            String operations = scanner.next(); // 반복문 안에서는 next와 nextLine의 차이가 있는데 nextLine에 개행(\n)이 남아서 바로 다음으로 넘어가게됨
            operations.charAt(0);

            switch (operations.charAt(0)){
                case '*':
                    System.out.println(num1 + " * "+ num2+" = "+(num1*num2));
                    break;
                case '+':
                    System.out.println(num1 + " + "+ num2+" = "+(num1+num2));
                    break;
                case '-':
                    System.out.println(num1 + " - "+ num2+" = "+(num1-num2));
                    break;
                case '/':
                    System.out.println(num1 + " / "+ num2+" = "+(num1/num2));
                    break;
                default:
                    System.out.println("오류");
            }


        }
    }
}
