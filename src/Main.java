import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x1, y1, x2, y2;

        System.out.print("Enter x1: ");
        x1 = input.nextInt();
        10System.out.print("Enter y1: ");
        y1 = input.nextInt();
        System.out.print("Enter x2: ");
        x2 = input.nextInt();
        System.out.print("Enter y2: ");
        y2 = input.nextInt();
        int length = x2 - x1;
        int width = y1 - y2;
        int s = length * width;
        int p = 2 * (length + width);
        System.out.println("Area = " + s);
        System.out.println("Perimeter = " + p);
    }
}