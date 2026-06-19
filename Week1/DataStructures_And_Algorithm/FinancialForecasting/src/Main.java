import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Present Value : ");
        double presentValue =sc.nextDouble();

        System.out.print("Enter Growth Rate : ");
        double growth =sc.nextDouble();

        System.out.print("Enter number of years  : ");
        int  years =sc.nextInt();


        ForCastingValue fc =new ForCastingValue();
        System.out.println("Expected Future Value is : "+ fc.findFutureValue(presentValue,growth,years));
    }
}