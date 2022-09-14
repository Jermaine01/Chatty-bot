import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int length = a > b ? a - b + 1  : b - a + 1;
        int min;

        if (a > b) {
            min = b;
        } else {
            min = a;
        }
        {
            for (int i = 1; i <= length; i++) {
                if (min % 3 == 0 && min % 5 != 0) {
              System.out.println("Fizz");
          }
                if (min % 5 == 0 && min % 3 != 0) {
              System.out.println("Buzz");
          }
                if (min % 5 == 0 && min % 3 == 0) {
                System.out.println("FizzBuzz");
          }
                if (min % 5 != 0 && min % 3 != 0) {
                System.out.println(min);
          }
          min = min + 1;
        }



    }
}

}