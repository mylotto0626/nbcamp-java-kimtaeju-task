package Level2;

import java.util.ArrayList;
import java.util.List;


public class Calculator {
    private List<Double> numResults = new ArrayList<Double>();


    public double calculate(double num1, double num2, char operator) {
        double result = 0;

        switch (operator){
            case '+':
                result = num1 + num2;

                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                if(num2!=0){
                    result = num1 / num2;
                }else{
                    System.out.println("0으로 나눌수 없습니다.");
                }
                break;

            default:
                System.out.println("이상한 것을 입력했습니다");
        }
        numResults.add(result);
        return result;
    }

    // 연산 결과 컬렉션을 간접 접근하는 게터 메서드
    public List<Double> getResult() {
        return numResults;
    }

    // 연산 결과 컬렉션을 간접 수정 세터 메서드
    public List<Double> setResult(List<Double> newResults) {
        numResults = new ArrayList<>(newResults);
        return numResults;
    }

    // 저장된 연산 결과들 중  가장 먼저 저장된 데이터를 삭제하는 기능
    public void deleteResults(){
        if(numResults.isEmpty()){
            numResults.remove(0);
        }
    }

    // 조회
    public void enquiry(){
        for(double data : numResults){
            System.out.println(data + " ");
        }
    }
}