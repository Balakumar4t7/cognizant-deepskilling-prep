package SingletonDesignPattern;

public class Logger {
    private static  Logger logger;

    private Logger(){}

    public  static Logger getInstance(){
        if(logger == null){
            return logger = new Logger();
        }
        return logger;
    }

    public String logInfo(String s){
        return (" Logging Manager --- " + s);
    }

}
