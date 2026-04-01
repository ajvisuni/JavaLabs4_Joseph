import java.util.Scanner;

public class RectangleArea {
    private double length;
    private double width;
    private double area;

    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        this.length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        this.width = scanner.nextDouble();
    }

    public void computeField() {
        this.area = this.length * this.width;
    }

    public void fieldDisplay() {
        System.out.println("Rectangle Dimensions:");
        System.out.println("Length: " + this.length);
        System.out.println("Width: " + this.width);
        System.out.println("Calculated Area: " + this.area);
    }
}