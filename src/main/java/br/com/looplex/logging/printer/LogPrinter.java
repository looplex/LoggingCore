package br.com.looplex.logging.printer;

import br.com.looplex.logging.LogContext;
import br.com.looplex.logging.annotations.LogLevel;
import lombok.extern.java.Log;

import java.io.Serializable;

import static java.lang.String.format;

@Log
public class LogPrinter implements ILogPrinter, Serializable {

    public void print(LogContext logContext) {
        LogLevel logLevel = logContext.getLogLevel();
        String message = logContext.getMessage();
        try {
            if(logLevel == LogLevel.WARNING) log.info(message);
            else log.info(message);
        } catch(IllegalArgumentException exception) {
            log.info(format("%s level doesn't exist. Message: [%s]", logLevel.name(), message));
        }
    }

}