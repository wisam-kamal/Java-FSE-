package org.example;

public class AppLogger {
    private LoggerService loggerService;

    public AppLogger(LoggerService loggerService) {
        this.loggerService = loggerService;
    }

    public void performLog(String message) {
        try {
            loggerService.log(message);
        } catch (Exception e) {
            System.out.println("Logging failed: " + e.getMessage());
        }
    }
}
