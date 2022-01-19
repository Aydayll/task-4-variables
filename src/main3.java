import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the taste of the first knob: ");
        String myString = input.next();
        System.out.print("Enter the taste of second knob: ");
        String myString1 = input.next();
        System.out.print("Enter the taste of the third knob: ");
        String myString2 = input.next();
        System.out.println("Your order is:");
        System.out.println(myString);
        System.out.println(myString1);
        System.out.println(myString2);
        System.out.println("VVVVVVVVVVVVV");
        System.out.println(" " + "VVVVVVVVVVV");
        System.out.println(" " + " " + "VVVVVVVVV");
        System.out.println(" " + " " + " " +"VVVVVVV");
        System.out.println(" " + " " + " " + " " + "VVVVV");
        System.out.println(" " + " " + " " + " " + " " + "VVV");
        input.close();
    }
}
