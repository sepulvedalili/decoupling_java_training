package fr.lernejo.logger;

public class LoggerFactory {
    public static Logger getLogger(String name){
        // Filtered File Logger
        Logger fileLogger = new FileLogger("output.txt");
        Logger filteredFileLogger = new FilteredLogger(fileLogger, message -> message.contains("simulation"));
        Logger contextualFileLogger = new ContextualLogger(name, filteredFileLogger);

        // Console Logger
        Logger consoleLogger = new ConsoleLogger();
        Logger contextualConsoleLogger = new ContextualLogger(name, consoleLogger);

        // Composite Logger
        Logger compositeLogger = new CompositeLogger(contextualFileLogger, contextualConsoleLogger);
        return compositeLogger;
    }
}
