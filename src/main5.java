import java.util.Scanner;
public class main5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter width(cm): ");
        float x = input.nextInt();
        System.out.print("Enter height(cm): ");
        float y = input.nextInt();
        System.out.print("Enter amount: ");
        int n = input.nextInt();
        System.out.println("surface covered: ");
        System.out.println(((x*y*n)/10000)+ "m^2");
        input.close();
    }
}

