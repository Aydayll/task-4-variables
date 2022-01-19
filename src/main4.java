import java.util.Scanner;
public class main4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.print("Enter an integer: ");
        int number2 = input.nextInt();
        System.out.println(number2 + number);
        System.out.println(number - number2);
        System.out.println((Math.pow(number, -1))+(Math.pow(number2, -1)));
        input.close();
    }
}
