package Level1;

import java.util.Scanner;

// 연산결과 배열이 없는 계산기
public class NoArrayCalculator {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1= sc.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2= sc.nextInt();

        System.out.print("사칙연산 기호를 입력하세요 : ");
        char input = sc.next().charAt(0);

        int result = 0;

        boolean flag = true;

        while(flag){
            switch (input){
                case '+':
                    result = num1 + num2;
                    System.out.println("결과 : "+result);

                    break;

                case '-':
                    result = num1 - num2;
                    System.out.println("결과 : "+result);
                    break;

                case '*':
                    result = num1 * num2;
                    System.out.println("결과 : "+result);
                    break;

                case '/':
                    if(num2!=0){
                        result = num1 / num2;
                        System.out.println("결과 : "+result);
                    }else{
                        System.out.println("0으로 나눌수 없습니다.");
                    }
                    break;

                default:
                    System.out.println("이상한 것을 입력했습니다");
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exit = sc.next();

            if(exit.equals("exit")){
                flag = false;
            } // 루프 탈출
        }
        sc.close();
    }
}
