import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter x: ");
        double x = input.nextDouble();
        System.out.println((Math.pow((Math.pow(x,6)+1), -1)) + (Math.pow((Math.pow(x,4)+1), -1)) + (Math.pow((Math.pow(x,2)+1), -1)));
        input.close();
    }
}
