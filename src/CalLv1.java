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
            String operations = scanner.nextLine();
            operations.charAt(0); // 연산자 출력
            switch (operations){
                case "*":
                    System.out.println(num1 + " * "+ num2+"="+num1*num2);
                    break;
            }


        }
    }
}
