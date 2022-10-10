package fr.lernojo.logger;

public class LoggerFactory {
    public static Logger getLogger(String name){
        // File Logger
        Logger fileLogger = new FileLogger("output.txt");
        Logger contextualFileLogger = new ContextualLogger(name, fileLogger);

        // Console Logger
        Logger consoleLogger = new ConsoleLogger();
        Logger contextualConsoleLogger = new ContextualLogger(name, consoleLogger);

        // Composite Logger
        Logger compositeLogger = new CompositeLogger(contextualFileLogger, contextualConsoleLogger);
        return compositeLogger;
    }
}
