import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        boolean instance1 = number1 > 0 && number2 <= 0 && number3 <= 0;
        boolean instance2 = number2 > 0 && number1 <= 0 && number3 <= 0;
        boolean instance3 = number3 > 0 && number1 <= 0 && number2 <= 0;
        boolean instance4 = !(instance1 || instance2 || instance3);

        if (instance1) {
            System.out.println(true);
        }
        if (instance2) {
            System.out.println(true);
        }
        if (instance3) {
            System.out.println(true);
        }
        if (instance4) {
            System.out.println(false);
        }


    }

}