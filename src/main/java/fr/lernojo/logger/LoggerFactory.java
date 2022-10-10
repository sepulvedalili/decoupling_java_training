package fr.lernojo.logger;

public class LoggerFactory {
    public static Logger getLogger(String name){
        Logger logger = new FileLogger("output.txt");
        Logger contextualLogger = new ContextualLogger(name, logger);
        return contextualLogger;
    }
}
