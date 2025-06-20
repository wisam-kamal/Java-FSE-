public class Logger {
    private static Logger instance;

    private Logger() {
        System.err.println("Logger instance created");
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
}
