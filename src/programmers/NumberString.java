package programmers;

public class NumberString {

        public int solution(String s) {
            int result = 0;

            // 초기 인풋으로 들어온 데이터 확인 실시
            System.out.println("문자열 데이터 : " + s);
            System.out.println("");

            // 문자열 중에서 각 배열에 해당하는 값을 변경하기 위해 배열 선언
            String word[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
            String number[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

            // for 문을 수행하면서 문자열 변경 실시
            for (int i=0; i<10; i++) { // 바꿔야하는 숫자 범위가 0 ~ 9 까지
                s = s.replaceAll(word[i], number[i]); // 인풋으로 들어온 문자열에서 각 영단어 값을 숫자로 변경 실시
            }
            result = Integer.parseInt(s);

            // 결과 반환 실시
            return result;
        }
    }


