package com.stoyanov5;

public class CoRDemo {

    public static void main(String[] args) {
        AbstractLogger loggerChainOfResponsibility = getChainOfResponsibility();

        loggerChainOfResponsibility.log(AbstractLogger.INFO, "Information about the log");
        loggerChainOfResponsibility.log(AbstractLogger.ERROR, "Error message");
        loggerChainOfResponsibility.log(AbstractLogger.DEBUG, "Debug log");
    }

    private static AbstractLogger getChainOfResponsibility() {
        AbstractLogger debugLogger = new ConsoleLogger(AbstractLogger.DEBUG);
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger consoleLogger = new DebugLogger(AbstractLogger.INFO);

        debugLogger.setLogger(errorLogger);
        errorLogger.setLogger(consoleLogger);

        return debugLogger;
    }
}
