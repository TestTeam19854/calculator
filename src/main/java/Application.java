import java.util.Calendar;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("정수 하나를 입력해주세요.");

        int a = sc.nextInt();
        int b = sc.nextInt();



    }
    public static class Calculator {

        public void plus(int a, int b) {

            System.out.println(a + b);
        }

        public void minus(int a, int b) {

            System.out.println(a - b);
        }


    }
}