import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Application app = new Application();
        System.out.print("정수 하나를 입력해주세요 : ");
        int a = sc.nextInt();


        System.out.println(" + , - , / , * 선택 ");
        System.out.println("+ : 더하기 1번입니다" );
        System.out.println("- : 빼기 2번입니다");
        System.out.println("/ : 나누기 3번입니다");
        System.out.println("* : 곱셈 4번입니다");

        System.out.print("필요한 기능을 입력해주세요 : ");
        int c = sc.nextInt();

        System.out.print("정수 하나를 입력해주세요 : ");
        int b = sc.nextInt();

        switch (c){

            case 1:
                System.out.println("+ 을 선택하셨습니다" );
                app.plus(a,b);
                break;
            case 2:
                System.out.println("- 을 선택하셨습니다");
                app.minus(a,b);
                break;
            case 3:
                System.out.println("/ 을 선택하셨습니다");
                app.div(a,b);
                break;
            case 4:
                System.out.println("* 을 선택하셨습니다");
                app.multi(a,b);
                break;
            default:
                System.out.println("잘못입력 하셨습니다. 시스템이 종료됩니다");

        }






    }

}
