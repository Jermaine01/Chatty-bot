import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int min = scanner.nextInt();
        int max = scanner.nextInt();
        int hours = scanner.nextInt();

        if (min <= max) {
            if (hours < min) {
                System.out.println("Deficiency");
            }
            if (hours > max) {
                System.out.println("Excess");
            }
            if (hours >= min  && hours <= max) {
                System.out.println("Normal");
            }
        }
    }
}