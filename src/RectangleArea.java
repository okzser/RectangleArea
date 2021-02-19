import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter rectangle width and height: ");
        System.out.println();

        System.out.print("Width: ");
        
        double width = scan.nextDouble();

        System.out.print("Height: ");

        double height = scan.nextDouble();

        double area = width * height;
        double perimeter = width * 2 + height * 2;
        double diagonal = Math.sqrt(width * width + height * height);

        System.out.println();
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Diagonal: " + diagonal);
    }
}
