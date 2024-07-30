package Level2;

import java.util.ArrayList;
import java.util.List;

public class CircleCalculator {
    private List<Double> circleResults = new ArrayList<Double>();

    static double pi = 3.14;


    public double calculateCircleArea(int radius) {
        double result = pi * radius * radius;
        circleResults.add(result);
        return result;
    }

    // 연산 결과 컬렉션을 간접 접근하는 게터 메서드
    public List<Double> getResult() {
        return circleResults;
    }

    // 연산 결과 컬렉션을 간접 수정 세터 메서드
    public List<Double> setResult(List<Double> newResults) {
        circleResults = new ArrayList<>(newResults);
        return circleResults;
    }

    // 저장된 연산 결과들 중  가장 먼저 저장된 데이터를 삭제하는 기능
    public void deleteResults(){
        if(circleResults.isEmpty()){
            circleResults.remove(0);
        }
    }

    // 조회
    public void enquiry(){
        for(double data : circleResults){
            System.out.println(data + " ");
        }
    }
}
