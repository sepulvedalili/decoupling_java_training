package fr.lernojo.logger;

public class ConsoleLogger implements Logger {
    void log( String message){
        System.out.println(message);
    }

}
