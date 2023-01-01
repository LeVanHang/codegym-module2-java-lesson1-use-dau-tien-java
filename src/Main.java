import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        for (int i = 0; i <= 4; i++) {
            System.out.printf(i + "\t");
        }
        System.out.printf("\n");

       String[] cars = {"vinfat","honda"};
        for (String i: cars
             ) {
            System.out.printf(i +"\t");
        }
        System.out.println();
        String name = "Hang";
        System.out.println("halo " + name);

        int x= 2, y = 3, z = 4;
        int sum;
        sum = x + y +z;
        System.out.printf("sum = " + sum);
    }




}
