package SingletonDesignPattern;

public class Main {
    public static void main(String [] args){

        Logger l1= Logger.getInstance();
        Logger l2 = Logger.getInstance();

        System.out.println(l1.logInfo("User Logged In "));
        System.out.println(l2.logInfo("User Logged Out "));

        System.out.println(l1==l2); //shows that the generated instance for logger is same
    }
}
