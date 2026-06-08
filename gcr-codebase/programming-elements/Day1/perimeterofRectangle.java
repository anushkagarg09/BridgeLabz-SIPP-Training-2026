import java.util.Scanner;
public class perimeterofRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        double perimeter = 2 * (length + width);
        System.out.println("The perimeter of the rectangle with length " + length + " and width " + width + " is: " + perimeter);
    }
}