package calculator;

import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int[] resultSave = new int[10];
        int index = 0;
        Scanner sc = new Scanner(System.in);

        do {

            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num = sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            // 문자열을 읽고 charAt(0) 문자열에 몇번째것을 저장할건지 선택 (0번은 첫번째 문자를 읽어옴)
            char operator = sc.next().charAt(0);

            int answer = 0;

            if (operator == '+') {
                answer = num + num2;
            } else if (operator == '-') {
                answer = num - num2;
            } else if (operator == '*') {
                answer = num * num2;
            } else if (operator == '/') {
                if (num2 != 0) {
                    answer = num / num2;
                } else {
                    System.out.println("두번째 입력한 숫자는 0이 될 수 없습니다.");
                    return;
                }
            } else {
                System.out.println("사칙여산 기호를 입력 해주세요");
                return;
            }

            if (index == 10) {

                for (int i = 0; i < resultSave.length - 1; i++) { // 0 ~ 8
                    resultSave[i] = resultSave[i + 1];
                    // resultSave[0] = resultSave[0 + 1] : resultSave[1]에 저장된 값을 resultSave[0]에 저장한다.
                    // 배열 값은 0 부터 시작하기 때문에 resultSave[8 + 1] =9 이다 9는 마지막 10번째 자리이다.
                    // 반복해서 i가 9되면 for문을 빠져 나온다.
                }
                // 하나씩 이동 후 10인 index값을 1 빼주면 9가 된다.
                index--;
            }
            // resultSave[9] 는 10번째 자리이며 그 자리에 계산된 값을 넣는다.
            resultSave[index] = answer;
            // 다시 index값을 10으로 만들고 계속을 계속하게 되면 다시 for문에 들어가서 반복이 된다.
            index++;
            System.out.println( num +""+ operator +""+ num2 +"="+answer);
            System.out.println("Arrays.toString(resultSave) = " + Arrays.toString(resultSave));

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
        } while (!sc.next().equals("exit"));
        System.out.println("계산이 종료되었습니다.");
    }
}
