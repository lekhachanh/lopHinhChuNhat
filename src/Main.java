import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double width, height;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input width: ");
        width = sc.nextDouble();
        System.out.println("Input height: ");
        height = sc.nextDouble();
        Rectangle rt = new Rectangle(width, height);
        System.out.println("Kich thuoc hinh chu nhat: \n "+ rt.display());
        System.out.println("Area: " + rt.getArea());
        System.out.println("Perimeter: "+ rt.getPeriMeter());

    }
}
