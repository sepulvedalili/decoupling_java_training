package fr.lernojo.logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ContextualLogger implements Logger{
    private final String className;
    private final Logger otherLogger;

    public ContextualLogger(String className, Logger otherLogger) {
        this.className = className;
        this.otherLogger = otherLogger;
    }

    @Override
    public void log(String message) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        otherLogger.log(LocalDateTime.now().format(dateTimeFormatter) + " " + className + " " + message);
    }
}
