import java.util.Scanner;
public class main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x");
        double a = input.nextDouble();
        System.out.println("Enter y");
        double b = input.nextDouble();
        System.out.println("The expression is: " + expression(a,b));
    }
    public static double expression(double x, double y){
        return (((Math.pow(x,4)+Math.pow(x,2)+2)/(Math.pow(y,4)+Math.pow(y,2)+3))+((Math.pow(y,4)+Math.pow(y,2)+8)/
                (Math.pow(x,4)+Math.pow(x,2)+4)));
    }
}
