/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package app.src.main.java.java.playground;
import java.util.Scanner;
public class App {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("what is A?");
        double a = input.nextDouble();
        System.out.println("what is B?");
        double b = input.nextDouble();
        System.out.println("what is C?");
        double c = input.nextDouble();
        
        double Shrute1 = (b * b) + ((-4) * (a) * (c));
        double Shrute2 = Math.sqrt(Shrute1);
        double x1 = (- b + Shrute2) / (2 * a);
        double x2 = (- b - Shrute2) / (2 * a);
        
        System.out.println();
        System.out.println("The x values are: " + x1 + " and " + x2);
        System.out.println();
        System.out.print("if they are fractions then the x values are: ");
        
        double numx1 = (- b + Shrute2);
        double numx2 = (- b - Shrute2);
        double denx = (2 * a);
        
        System.out.print(numx1 + " / " + denx + " and ");
        System.out.println(numx2 + " / " + denx);
        System.out.println();
        System.out.println("      ________________________");
        System.out.println(-b + " V " + Shrute1);
        System.out.println("______________________________");
        System.out.println(denx);
        
        
    }
}
