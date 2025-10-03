public class TypeConversionCasting_2 {
    public static void main(String[] args){
        // 각 과목 점수
        int koreanScore = 86;
        int mathScore = 94;
        int scienceScore = 87;
        int computerScore = 100;

        // 평균 점수
        // double average = (koreanScore + mathScore + scienceScore + computerScore) / 4; // 정수를 정수로 나눴기 때문에 91 출력
        double average = (koreanScore + mathScore + scienceScore + computerScore) / 4.0; // 첫번째 방법
        System.out.println(average);

        // 강제 형변환을 사용할 경우
        System.out.println((double) (koreanScore + mathScore + scienceScore + computerScore) / 4); // 두번째 방법
    }
}
