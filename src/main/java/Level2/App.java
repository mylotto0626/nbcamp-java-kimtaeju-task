package Level2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // 생성자 구역
        Calculator calculator = new Calculator();
        CircleCalculator circleCalculator = new CircleCalculator();

        // 스캐너
        Scanner sc = new Scanner(System.in);

        boolean flag = true;

        while (flag) {

            // 사칙연산을 할지 원의 넓이를 구할지
            System.out.println("사칙 연산을 진행하려면 1, 원의 넓이를 구하려면 2");
            int choice = sc.nextInt();

            if(choice == 1) {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                double num1 = sc.nextDouble();
                System.out.print("두 번째 숫자를 입력하세요: ");
                double num2 = sc.nextDouble();

                System.out.println("사칙연산 기호를 입력하세요.");
                char operator = sc.next().charAt(0);

                double result = calculator.calculate(num1,num2,operator);
                System.out.println("결과: " + result);

                // 삭제 기능
                System.out.println("첫번째 데이터 삭제하기 (삭제하려면 yes 입력)");
                String deleteChoice = sc.next();

                if(deleteChoice.equals("yes")) {
                    calculator.deleteResults();
                    System.out.println("데이터가 삭제되었습니다.");
                }

                System.out.println(calculator.getResult());

                // 조회
                System.out.println("데이터 조회하기 (조회하려면 yes 입력)");
                String check = sc.next();
                if(check.equals("yes")) {
                    calculator.enquiry();
                }
            }else{
                System.out.println("원의 반지름을 입력해주세요.");
                int radius = sc.nextInt();

                // 원의 넓이 계산
                double result = circleCalculator.calculateCircleArea(radius);
                System.out.println("결과 : " + result);
                System.out.println("계산된 원의 넓이들");
                System.out.println(circleCalculator.getResult());
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exit = sc.next();

            if(exit.equals("exit")){
                flag = false;
            } // 루프 탈출

        }
        sc.close(); // 스캐너 닫기
    }
}
