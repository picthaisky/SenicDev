/**
 * Hello
 */
import java.util.Scanner;
public class Hello {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter heigh (M)");
        double h = in.nextDouble();
        System.out.print("Enter weight (Kg)");
        double w = in.nextDouble();
        System.out.println(BodyMassindex.bmi(h,w));
    }
}