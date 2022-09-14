import java.util.Objects;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int number = scanner.nextInt();
        int gradeA = 0;
        int gradeB = 0;
        int gradeC = 0;
        int gradeD = 0;


        for (int i = 1; i <= number; i++){
            String grade = scanner.next();
            if (Objects.equals(grade,"A")) {
                gradeA = gradeA+1;
            }
            if (Objects.equals(grade, "B")) {
                gradeB = gradeB+1;
            }
            if (Objects.equals(grade, "C")) {
                gradeC = gradeC+1;
            }
            if (Objects.equals(grade, "D")) {
                gradeD = gradeD+1;
            }
        }
        System.out.print(gradeD);
        System.out.print(" ");
        System.out.print(gradeC);
        System.out.print(" ");
        System.out.print(gradeB );
        System.out.print(" ");
        System.out.print(gradeA );
    }
}
