import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);
        int number,pwr;
        int total =1;


        System.out.println("Entry number :"); number = hi.nextInt();
        System.out.println("Entry power :"); pwr = hi.nextInt();

            for (int i=1 ; i<=pwr ; i ++)
            {
                total *= number;
            }
             System.out.println(total);
    }
}