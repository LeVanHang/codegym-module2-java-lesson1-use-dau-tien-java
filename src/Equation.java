import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a: ");
        double a = scanner.nextDouble();
        System.out.println("b: ");
        double b = scanner.nextDouble();
        System.out.println("c: ");
        double c = scanner.nextDouble();

            if (a != 0) {
                double answer = (c - b) / a;
                System.out.println();
                System.out.println("answer:" + answer);
            } else if (b == c) {
                System.out.println("");
            } else {
                System.out.println(" ");
            }
        }
    }
