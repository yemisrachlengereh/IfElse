import java.util.Scanner;
public class PairProcess {
public static void main(String[] arg) {
    int num1, num2, Sum, Mul, avg;
    Scanner keyboard = new Scanner(System.in);
    System.out.print("first number? :");
    num1 = keyboard.nextInt();
    System.out.print("last number? :");
    num2 = keyboard.nextInt();
    Sum = num1 + num2;
    if (Sum > 200) {
        System.out.println("*");
        if (Sum < 1000) {
            System.out.println("~");
        }
    }
    // Mul = num1 * num2;


    //avg=(num1 + num2))/2);

    if (num2 > 3000) ;

    System.out.print("wow! you choose a big number");
}
}