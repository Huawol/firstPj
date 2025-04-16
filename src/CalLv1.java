import java.util.Scanner;

public class CalLv1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        while (true) {

            System.out.print("첫번째 숫자를 입력해주세요 : ");
            int num1= scanner.nextInt();
            // 양수의 값만 나오게 하기 위한 줄
            if (num1 < 0) {
                num1 = num1 * -1;
            }

            System.out.print("어떤 사칙 연산을 하실건가요? : ");
            String operations = scanner.next(); // 반복문 안에서는 next와 nextLine의 차이가 있는데
            // nextLine에 개행(\n)이 남아서 바로 다음으로 넘어가게됨
            operations.charAt(0);

            System.out.print("두번째 숫자를 입력해주세요 : ");
            int num2 = scanner.nextInt();
            if(num2 == 0){
                System.out.println("0 을 제외한 숫자를 입력해주세요");
                continue; // 0 을 입력하면 처음 부터 입력하게 만듬
            }else if (num2 < 0) {
                num2 = num2 * -1;
            }

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
                    return;
            }

            System.out.print("종료 하시려면 exit를 입력해주세요 아니라면 아무거나 입력 하세요 : ");
            String exit = scanner.next();
            if(exit.equals("exit")){
                System.out.println("프로그램이 종료됩니다.");
                return;
            }else
                continue;
        }
    }
}
