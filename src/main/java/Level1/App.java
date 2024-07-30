package Level1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1= sc.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2= sc.nextInt();

        System.out.print("사칙연산 기호를 입력하세요 : ");
        char input = sc.next().charAt(0);

        int result = 0;
//        int[] resultArray = new int[10];
        // 20240730 먼저들어간 값을 내보내면서 저장하는 것은 큐
        Queue<Integer> queue = new LinkedList<>();

        int i = 0;

        boolean flag = true;

        queue.add(result);

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

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            if(sc.nextLine().equals("remove")) {
                queue.remove();
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            if(sc.nextLine().equals("inquiry")) {
                for (int num : queue) {
                    System.out.println(num);
                }
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
